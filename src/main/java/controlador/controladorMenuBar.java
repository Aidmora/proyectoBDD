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


/**
 *
 * @author RIBZ
 */
public class controladorMenuBar  implements ActionListener{
    private frmContenedorPrincipal frmConP;
    
    
    public controladorMenuBar(frmContenedorPrincipal frmContenedorPrincipal){
        this.frmConP=frmContenedorPrincipal;
        this.frmConP.jMenuPaciente.addActionListener(this);
        this.frmConP.jMenuUsuarios.addActionListener(this);
        this.frmConP.jMenuItemTratamientosCorporal.addActionListener(this);
        this.frmConP.jMenuItemTratamientosFacial.addActionListener(this);
        this.frmConP.jMenuItemMedicoActivos.addActionListener(this);
        this.frmConP.jMenuItemMedicoInactivos.addActionListener(this);
        this.frmConP.jMenuItemCitaMedicaNorte.addActionListener(this);
        this.frmConP.jMenuItemCitaMedicaSur.addActionListener(this);
        this.frmConP.jMenuItemPagoPendiente.addActionListener(this);
        this.frmConP.jMenuItemPagoRealizado.addActionListener(this);
    }
    public void iniciar() {
        frmConP.setTitle("Centro Médico");
        frmConP.setLocation(100,100);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmConP.jMenuPaciente) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "Paciente");
        } 
        if (e.getSource() == frmConP.jMenuUsuarios) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "Usuario");
        } 
        if (e.getSource() == frmConP.jMenuItemTratamientosFacial) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "TFacial");
        } 
        if (e.getSource() == frmConP.jMenuItemTratamientosCorporal) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "TCorporal");
        } 
        if (e.getSource() == frmConP.jMenuItemMedicoActivos) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "MActivo");
        } 
        if (e.getSource() == frmConP.jMenuItemMedicoInactivos) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "MInactivo");
        } 
        if (e.getSource() == frmConP.jMenuItemCitaMedicaNorte) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "CMNorte");
        } 
        if (e.getSource() == frmConP.jMenuItemCitaMedicaSur) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "CMSur");
        } 
        if (e.getSource() == frmConP.jMenuItemPagoPendiente) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "PagoP");
        } 
        if (e.getSource() == frmConP.jMenuItemPagoRealizado) {
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "PagoR");
        } 
        
    }
    

}
