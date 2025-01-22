/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.DbUsuario;
import modelo.Usuario;
import vista.frmContenedorPrincipal;
import vista.frmLogin;

/**
 *
 * @author User
 */
public class controladorLogin implements ActionListener {
    private Usuario us; 
    private frmLogin frmLogin;
    private DbUsuario dbUsuario;
    private frmContenedorPrincipal frmContPrincipal;

    public controladorLogin(Usuario us, frmLogin frmLogin, DbUsuario dbUsuario, frmContenedorPrincipal frmContPrincipal) {
        this.us = us;
        this.frmLogin = frmLogin;
        this.dbUsuario = dbUsuario;
        this.frmContPrincipal = frmContPrincipal;
        this.frmLogin.btnIngresar.addActionListener(this);
    }
    
    public void iniciar(){
        frmLogin.setTitle("Iniciar Sesión");
        frmLogin.setLocationRelativeTo(null);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frmLogin.btnIngresar){
            us.setCorreoElectronico(frmLogin.txtEmail.getText().trim());
            us.setContrasenia(frmLogin.txtPassword.getText());
            if(dbUsuario.buscar(us)){
                frmLogin.dispose();
                frmContPrincipal.setLocationRelativeTo(null);
                frmContPrincipal.setVisible(true);
            }
        }
    }
}
