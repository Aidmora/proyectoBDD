/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.DbUsuarioVM;
import modelo.UsuarioVM;
import vista.frmContenedorPrincipal;

/**
 *
 * @author RIBZ
 */
public class controladorUsuarioVM implements ActionListener {
    private UsuarioVM usVM;
    private frmContenedorPrincipal frmContPrincipal;
    private DbUsuarioVM dbUsuarioVM;

    public controladorUsuarioVM(UsuarioVM us, frmContenedorPrincipal frmContPrincipal, DbUsuarioVM dbUsuario) {
        this.usVM = us;
        this.frmContPrincipal = frmContPrincipal;
        this.dbUsuarioVM = dbUsuario;
        this.frmContPrincipal.btnBuscarUsVM.addActionListener(this);
        this.frmContPrincipal.btnLimpiarUsVM.addActionListener(this);
    }
    
     public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContPrincipal.jPanelPrincipal, "UsuarioVM");
        frmContPrincipal.txtIdUsVM.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== frmContPrincipal.btnBuscarUsVM){
            usVM.setCorreoElectronico(frmContPrincipal.txtCorreoUsVM.getText().trim());
            if (dbUsuarioVM.buscar(usVM)) {
                frmContPrincipal.txtNombreUsVM.setText(usVM.getNombre());
                frmContPrincipal.txtCorreoUsVM.setText(usVM.getCorreoElectronico());
                int estado = usVM.getEstado();
                if(estado == 1){
                    frmContPrincipal.txtEstadoUsVM.setText("Activo");
                }else{
                    frmContPrincipal.txtEstadoUsVM.setText("Inactivo");
                }
                frmContPrincipal.listRolUsVM.setSelectedItem(usVM.getRol().trim());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró al Usuario ");
                limpiar();
            }
        }
        if (e.getSource()== frmContPrincipal.btnLimpiarUsVM) {
            limpiar();
        }
    }
    public void limpiar(){
        frmContPrincipal.txtCorreoUsVM.setText(null);
        frmContPrincipal.txtEstadoUsVM.setText(null);
        frmContPrincipal.txtNombreUsVM.setText(null);
    }
    
}
