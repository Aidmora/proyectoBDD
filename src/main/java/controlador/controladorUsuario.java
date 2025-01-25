/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.DbUsuario;
import modelo.Usuario;
import vista.frmContenedorPrincipal;

/**
 *
 * @author User
 */
public class controladorUsuario implements ActionListener {
    
    private Usuario us;
    private frmContenedorPrincipal frmContPrincipal;
    private DbUsuario dbUsuario;

    public controladorUsuario(Usuario us, frmContenedorPrincipal frmContPrincipal, DbUsuario dbUsuario) {
        this.us = us;
        this.frmContPrincipal = frmContPrincipal;
        this.dbUsuario = dbUsuario;
        this.frmContPrincipal.btnModificarUs.addActionListener(this);
        this.frmContPrincipal.btnGuardarUs.addActionListener(this);
        this.frmContPrincipal.btnEliminarUs.addActionListener(this);
        this.frmContPrincipal.btnBuscarUs.addActionListener(this);
    }
    
     public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContPrincipal.jPanelPrincipal, "Usuario");
        frmContPrincipal.txtIdUs.setVisible(false);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        //guardar
        if(e.getSource()== frmContPrincipal.btnGuardarUs){
            us.setNombre(frmContPrincipal.txtNombreUs.getText().trim());
            us.setCorreoElectronico(frmContPrincipal.txtCorreoUs.getText().trim());
            if(frmContPrincipal.txtEstadoUs.getText().trim().equalsIgnoreCase("Activo")){
                us.setEstado(1);
            }else{
                us.setEstado(0);
            }
            String rolSeleccionado = (String) frmContPrincipal.listRolUs.getSelectedItem();
            us.setRol(rolSeleccionado);
            //validar que coincidan las contraseñas
            if(frmContPrincipal.txtNuevaPassUs.getText().trim().equals(frmContPrincipal.txtConfNuevaPassUs.getText().trim())){
                us.setContrasenia(frmContPrincipal.txtConfNuevaPassUs.getText().trim());
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                return;
            }
            if (dbUsuario.guardar(us)) {
                JOptionPane.showMessageDialog(null, "Paciente Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar ");
                limpiar();
            }
            
        }
        
        //modificar
        if(e.getSource()== frmContPrincipal.btnModificarUs){
            us.setNombre(frmContPrincipal.txtNombreUs.getText().trim());
            us.setCorreoElectronico(frmContPrincipal.txtCorreoUs.getText().trim());
            if(frmContPrincipal.txtEstadoUs.getText().trim().equalsIgnoreCase("Activo")){
                us.setEstado(1);
            }else{
                us.setEstado(0);
            }         
            String rolSeleccionado = (String) frmContPrincipal.listRolUs.getSelectedItem();
            us.setRol(rolSeleccionado);
            if (dbUsuario.modificar(us)) {
                JOptionPane.showMessageDialog(null, "Usuario Modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar ");
                limpiar();
            }
        }
        
        //eliminar
        if(e.getSource()== frmContPrincipal.btnEliminarUs){
            us.setCorreoElectronico(frmContPrincipal.txtCorreoUs.getText().trim());
            if (dbUsuario.eliminar(us)) {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar ");
                limpiar();
            }
        }
        
        
        //buscar por correo
        if(e.getSource()== frmContPrincipal.btnBuscarUs){
            us.setCorreoElectronico(frmContPrincipal.txtCorreoUs.getText().trim());
            if (dbUsuario.buscar(us)) {
                frmContPrincipal.txtNombreUs.setText(us.getNombre());
                frmContPrincipal.txtCorreoUs.setText(us.getCorreoElectronico());
                int estado = us.getEstado();
                if(estado == 1){
                    frmContPrincipal.txtEstadoUs.setText("Activo");
                }else{
                    frmContPrincipal.txtEstadoUs.setText("Inactivo");
                }
                frmContPrincipal.listRolUs.setSelectedItem(us.getRol().trim());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró al Usuario ");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        frmContPrincipal.txtConfNuevaPassUs.setText(null);
        frmContPrincipal.txtCorreoUs.setText(null);
        frmContPrincipal.txtEstadoUs.setText(null);
        frmContPrincipal.txtNombreUs.setText(null);
        frmContPrincipal.txtNuevaPassUs.setText(null);
    }
    
}
