/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.DbPacienteVM;
import modelo.PacienteVM;
import vista.frmContenedorPrincipal;

/**
 *
 * @author RIBZ
 */
public class controladorPacienteVM implements ActionListener{
    private PacienteVM paVM;
    private frmContenedorPrincipal frmContenedorPrincipal;
    private DbPacienteVM DbPacienteVM;
    public controladorPacienteVM(PacienteVM pacVM, DbPacienteVM dbPacVM, frmContenedorPrincipal frmContenedor){
        this.paVM= pacVM;
        this.frmContenedorPrincipal= frmContenedor;
        this.DbPacienteVM= dbPacVM;
        this.frmContenedorPrincipal.btnBuscarPaVM.addActionListener(this);
        this.frmContenedorPrincipal.btnLimpiarPaVM.addActionListener(this);
    }

    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "PacienteVM");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Buscar
        if(e.getSource()== frmContenedorPrincipal.btnBuscarPaVM){
           paVM.setNumeroCedula(frmContenedorPrincipal.txtCedulaPAVM.getText().trim());
            if (DbPacienteVM.buscar(paVM)) {
                frmContenedorPrincipal.txtCedulaPAVM.setText(paVM.getNumeroCedula());
                frmContenedorPrincipal.dateFechaNacPAVM.setDate(paVM.getFechaNacimiento());
                frmContenedorPrincipal.txtNumTelPAVM.setText(paVM.getNumeroTelefono());
                frmContenedorPrincipal.txtCorreoElecPAVM.setText(paVM.getCorreoElectronico());
                frmContenedorPrincipal.txtNombrePAVM.setText(paVM.getNombre());
                frmContenedorPrincipal.txtUbicacionPAVM.setText(paVM.getUbicacion());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró al Paciente ");
                limpiar();
            }
        }
        if (e.getSource()== frmContenedorPrincipal.btnLimpiarPaVM) {
            limpiar();
        }
    }
    public void limpiar(){
        frmContenedorPrincipal.txtCedulaPAVM.setText(null);
        frmContenedorPrincipal.dateFechaNacPAVM.setDate(null);
        frmContenedorPrincipal.txtNumTelPAVM.setText(null);
        frmContenedorPrincipal.txtCorreoElecPAVM.setText(null);
        frmContenedorPrincipal.txtNombrePAVM.setText(null);
        frmContenedorPrincipal.txtUbicacionPAVM.setText(null);
    }

}
