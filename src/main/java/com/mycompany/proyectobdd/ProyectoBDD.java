/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectobdd;

import controlador.controladorLogin;
import controlador.controladorMenuBar;
import modelo.DbUsuario;
import modelo.Usuario;
import vista.frmContenedorPrincipal;
import vista.frmLogin;



/**
 *
 * @author RIBZ 
 */
public class ProyectoBDD {

    public static void main(String[] args) {
        frmLogin frmLogin = new frmLogin();
        Usuario us = new Usuario();
        DbUsuario dbUsuario = new DbUsuario();
        frmLogin.setVisible(true);
        frmContenedorPrincipal frmContenedorPrincipal= new frmContenedorPrincipal();
        controladorLogin contLogin = new controladorLogin(us,frmLogin,dbUsuario, frmContenedorPrincipal);
        contLogin.iniciar();

        controladorMenuBar conBar= new controladorMenuBar(frmContenedorPrincipal);
        //conBar.iniciar();
        //frmContenedorPrincipal.setVisible(true);

    }
} 
