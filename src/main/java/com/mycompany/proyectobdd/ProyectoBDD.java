/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectobdd;

import controlador.controladorMenuBar;
import vista.frmContenedorPrincipal;



/**
 *
 * @author RIBZ 
 */
public class ProyectoBDD {

    public static void main(String[] args) {
        frmContenedorPrincipal frmContenedorPrincipal= new frmContenedorPrincipal();
        controladorMenuBar conBar= new controladorMenuBar(frmContenedorPrincipal);
        conBar.iniciar();
        frmContenedorPrincipal.setVisible(true);

    }
} 
