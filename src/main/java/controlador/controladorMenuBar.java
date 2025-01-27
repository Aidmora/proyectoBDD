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
import modelo.DbMedicoActivo;
import modelo.DbPagoPendiente;
import modelo.DbPagoRealizado;
import modelo.DbUsuario;
import modelo.MedicoActivo;
import modelo.PagoPendiente;
import modelo.PagoRealizado;
import vista.frmContenedorPrincipal;
import modelo.Usuario;


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
            Usuario us = new Usuario();
            DbUsuario dbUsuario = new DbUsuario();
            controladorUsuario ctrUs = new controladorUsuario(us, frmConP, dbUsuario);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "Usuario");
            frmConP.txtIdUs.setVisible(false);
            
            ctrUs.iniciar();
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
            MedicoActivo ma = new MedicoActivo();
            DbMedicoActivo dbMA = new DbMedicoActivo();
            controladorMedicoActivo ctrMa = new controladorMedicoActivo(frmConP, ma, dbMA);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "MaActivo");
            ctrMa.iniciar();
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
            PagoPendiente pp = new PagoPendiente();
            DbPagoPendiente dbPP = new DbPagoPendiente();
            controladorPagoPendiente ctrPp = new controladorPagoPendiente(pp, frmConP, dbPP);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "PagoP");            
            ctrPp.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemPagoRealizado) {
            PagoRealizado pr = new PagoRealizado();
            DbPagoRealizado dbPR = new DbPagoRealizado();
            controladorPagoRealizado ctrPr = new controladorPagoRealizado(pr, frmConP, dbPR);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            cardLayout.show(frmConP.jPanelPrincipal, "PagoR");
            ctrPr.iniciar();
        } 
        
    }
    

}
