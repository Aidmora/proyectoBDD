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
import modelo.CitaMedicaNorte;
import modelo.CitaMedicaSur;
import modelo.DbCitaMedicaNorte;
import modelo.DbCitaMedicaSur;
import modelo.DbMedicoActivo;
import modelo.DbMedicoInactivo;
import modelo.DbPaciente;
import modelo.DbPacienteVM;
import modelo.DbPagoPendiente;
import modelo.DbPagoRealizado;
import modelo.DbTratamientoCorporal;
import modelo.DbTratamientoFacial;
import modelo.DbUsuario;
import modelo.DbUsuarioVM;
import modelo.MedicoActivo;
import modelo.MedicoInactivo;
import modelo.Paciente;
import modelo.PacienteVM;
import modelo.PagoPendiente;
import modelo.PagoRealizado;
import modelo.TratamientoCorporal;
import modelo.TratamientoFacial;
import modelo.Usuario;
import modelo.UsuarioVM;
import vista.frmContenedorPrincipal;


/**
 *
 * @author RIBZ
 */
public class controladorMenuBar  implements ActionListener{
    private frmContenedorPrincipal frmConP;
    
    
    public controladorMenuBar(frmContenedorPrincipal frmContenedorPrincipal){
        this.frmConP=frmContenedorPrincipal;
        this.frmConP.jMenuItemPaciente.addActionListener(this);
        this.frmConP.jMenuItemUsuarioM.addActionListener(this);
        this.frmConP.jMenuItemUsuario.addActionListener(this);
        this.frmConP.jMenuItemPacienteM.addActionListener(this);
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
        if (e.getSource() == frmConP.jMenuItemPacienteM) {
            Paciente pa= new Paciente();
            DbPaciente dbPaciente= new DbPaciente();
            controladorPaciente ctrPa= new controladorPaciente(pa, dbPaciente, frmConP);
            ctrPa.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemPaciente) {
            PacienteVM paVM = new PacienteVM();
            DbPacienteVM dbPacienteVM = new DbPacienteVM();
            controladorPacienteVM ctrPAVM = new controladorPacienteVM(paVM, dbPacienteVM,frmConP);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            frmConP.txtIdUsVM.setVisible(false);
            ctrPAVM.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemUsuarioM) {
            Usuario us = new Usuario();
            DbUsuario dbUsuario = new DbUsuario();
            controladorUsuario ctrUs = new controladorUsuario(us, frmConP, dbUsuario);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            frmConP.txtIdUsVM.setVisible(false);
            ctrUs.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemUsuario) {
            UsuarioVM us = new UsuarioVM();
            DbUsuarioVM dbUsuario = new DbUsuarioVM();
            controladorUsuarioVM ctrUsVM = new controladorUsuarioVM(us, frmConP, dbUsuario);
            CardLayout cardLayout = (CardLayout) frmConP.jPanelPrincipal.getLayout();
            frmConP.txtIdUsVM.setVisible(false);
            ctrUsVM.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemTratamientosFacial) {
            TratamientoFacial tratamientoFacial= new TratamientoFacial();
            DbTratamientoFacial dbTratamientoFacial= new DbTratamientoFacial();
            controladorTratamientoFacial ctrF= new controladorTratamientoFacial(tratamientoFacial, dbTratamientoFacial, frmConP);
            ctrF.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemTratamientosCorporal) {
            TratamientoCorporal tratamientoCorporal =  new TratamientoCorporal();
            DbTratamientoCorporal dbCorporal = new DbTratamientoCorporal();
            controladorTratamientoCorporal crtC = new controladorTratamientoCorporal(tratamientoCorporal,dbCorporal,frmConP);
            crtC.iniciar();
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
            MedicoInactivo mi = new MedicoInactivo();
            DbMedicoInactivo dbMI = new DbMedicoInactivo();
            controladorMedicoInactivo ctrMI = new controladorMedicoInactivo(mi,dbMI, frmConP);
            ctrMI.iniciar();
        } 
        if (e.getSource() == frmConP.jMenuItemCitaMedicaNorte) {
            CitaMedicaNorte citaMedicaNorte= new CitaMedicaNorte();
            DbCitaMedicaNorte dbCitaMedicaNorte= new DbCitaMedicaNorte();
            controladorCitaMedicaNorte conCitaMedicaNorte= new controladorCitaMedicaNorte(citaMedicaNorte, dbCitaMedicaNorte, frmConP);
            conCitaMedicaNorte.iniciar(); 
        } 
        if (e.getSource() == frmConP.jMenuItemCitaMedicaSur) {
            CitaMedicaSur citaMedicaSur= new CitaMedicaSur();
            DbCitaMedicaSur dbCitaMedicaSur= new DbCitaMedicaSur();
            controladorCitaMedicaSur conCitaMedicaSur= new controladorCitaMedicaSur(citaMedicaSur, dbCitaMedicaSur, frmConP);
            conCitaMedicaSur.iniciar(); 
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
