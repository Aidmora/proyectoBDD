/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.DbPagoRealizadoVM;
import modelo.PagoRealizadoVM;
import vista.frmContenedorPrincipal;

/**
 *
 * @author RIBZ
 */
public class controladorPagoRealizadoVM implements ActionListener{
    private PagoRealizadoVM prVM;
    private frmContenedorPrincipal frmContenedorPrincipal;
    private DbPagoRealizadoVM dbPRVM;

    public controladorPagoRealizadoVM(PagoRealizadoVM pr, frmContenedorPrincipal frmContenedorPrincipal, DbPagoRealizadoVM dbPR) {
        this.prVM = pr;
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        this.dbPRVM = dbPR;
        this.frmContenedorPrincipal.btnBuscarPRVM.addActionListener(this);
    }

    public void iniciar() {
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "PagoRVM");
    }

    public void limpiar() {
        frmContenedorPrincipal.txtCantidadPRVM.setText(null);
        frmContenedorPrincipal.txtHoraPRVM.setText(null);
        frmContenedorPrincipal.txtMinutoPRVM.setText(null);
        frmContenedorPrincipal.txtMetodoPRVM.setText(null);
        Calendar today = Calendar.getInstance();
        frmContenedorPrincipal.dateFechaPRVM.setDate(today.getTime());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmContenedorPrincipal.btnBuscarPRVM) {
            prVM.setId(Integer.parseInt(frmContenedorPrincipal.txtIdPRVM.getText().trim()));
            if (dbPRVM.buscar(prVM)) {
                frmContenedorPrincipal.txtCantidadPRVM.setText(Double.toString(prVM.getCantidad()));
                frmContenedorPrincipal.txtMetodoPRVM.setText(prVM.getMetodo());
                frmContenedorPrincipal.dateFechaPRVM.setDate(prVM.getFecha());
                if (prVM.getHora() != null) { 
                    java.sql.Timestamp timestamp = prVM.getHora();
                    java.util.Date horaDate = new java.util.Date(timestamp.getTime());
                    java.text.SimpleDateFormat horaFormat = new java.text.SimpleDateFormat("HH");
                    java.text.SimpleDateFormat minutoFormat = new java.text.SimpleDateFormat("mm");
                    String hora = horaFormat.format(horaDate);
                    String minutos = minutoFormat.format(horaDate);
                    frmContenedorPrincipal.txtHoraPRVM.setText(hora);
                    frmContenedorPrincipal.txtMinutoPRVM.setText(minutos);
                } else {
                    frmContenedorPrincipal.txtHoraPRVM.setText("");
                    frmContenedorPrincipal.txtMinutoPRVM.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el Pago Realizado");
                limpiar();
            }
        }
    }
    
}
