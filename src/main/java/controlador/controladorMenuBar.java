/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.frmContenedorPrincipal;
import vista.frmPaciente;

/**
 *
 * @author RIBZ
 */
public class controladorMenuBar  implements ActionListener{
    private frmContenedorPrincipal frmConP;
    
    
    public controladorMenuBar(frmContenedorPrincipal frmContenedorPrincipal){
        this.frmConP=frmContenedorPrincipal;
        this.frmConP.jMenuPaciente.addActionListener(this);
    }
    public void iniciar() {
        frmConP.setTitle("Centro Médico");
        frmConP.setLocation(100,100);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmConP.jMenuPaciente) {
            frmPaciente ventanaPaciente = new frmPaciente();
            ventanaPaciente.setVisible(true);
        } 
    }
    

}
