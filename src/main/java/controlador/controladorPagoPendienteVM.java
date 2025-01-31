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
import modelo.DbPagoPendienteVM;
import modelo.PagoPendienteVM;
import vista.frmContenedorPrincipal;

/**
 *
 * @author RIBZ
 */
public class controladorPagoPendienteVM implements ActionListener {
     private PagoPendienteVM ppVM;
    private frmContenedorPrincipal frmContenedorPrincipal;
    private DbPagoPendienteVM dbPPVM;

    public controladorPagoPendienteVM(PagoPendienteVM pp, frmContenedorPrincipal frmContenedorPrincipal, DbPagoPendienteVM dbPP) {
        this.ppVM = pp;
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        this.dbPPVM = dbPP;
        this.frmContenedorPrincipal.btnBuscarPPVM.addActionListener(this);
        this.frmContenedorPrincipal.btnLimpiarPPVM.addActionListener(this);
    }
    
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "PagoPVM");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //buscar
         if(e.getSource()== frmContenedorPrincipal.btnBuscarPPVM){
             ppVM.setId(Integer.parseInt(frmContenedorPrincipal.txtIdPPVM.getText().trim()));
             if (dbPPVM.buscar(ppVM)) {
                 frmContenedorPrincipal.txtCantidadPPVM.setText(Double.toString(ppVM.getCantidad()));
                 String estado;
                 if(ppVM.getEstado() == 1){
                     estado = "Activo";
                 } else{
                     estado = "Inactivo";
                 }
                 frmContenedorPrincipal.txtEstadoPPVM.setText(estado);
                 frmContenedorPrincipal.dateFechaPPVM.setDate(ppVM.getFecha());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró al Pago Pendiente ");
                limpiar();
            }
        }
        if (e.getSource()== frmContenedorPrincipal.btnLimpiarPPVM) {
            limpiar();
        }
    }
        public void limpiar(){
        frmContenedorPrincipal.txtEstadoPPVM.setText(null);
        frmContenedorPrincipal.txtIdPPVM.setText(null);
        frmContenedorPrincipal.txtCantidadPPVM.setText(null);
        Calendar today = Calendar.getInstance();
        frmContenedorPrincipal.dateFechaPPVM.setDate(today.getTime());
    }
}
