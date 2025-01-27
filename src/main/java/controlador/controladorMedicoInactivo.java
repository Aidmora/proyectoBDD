/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.DbMedicoInactivo;
import modelo.MedicoInactivo;
import vista.frmContenedorPrincipal;

/**
 *
 * @author LENOVO.USER
 */
public class controladorMedicoInactivo implements ActionListener{
    private MedicoInactivo mi = new MedicoInactivo();
    private frmContenedorPrincipal frmContenedorPrincipal = new frmContenedorPrincipal();
    private DbMedicoInactivo DbMedicoI = new DbMedicoInactivo();

    public controladorMedicoInactivo(MedicoInactivo mi, DbMedicoInactivo DbMedicoI,frmContenedorPrincipal frmContenedorPrincipal) {
        this.mi = mi;
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        this.DbMedicoI = DbMedicoI;
        this.frmContenedorPrincipal.btnBuscarMI.addActionListener(this);
        this.frmContenedorPrincipal.btnEliminarMI.addActionListener(this);
        this.frmContenedorPrincipal.btnGuardarMI.addActionListener(this);
        this.frmContenedorPrincipal.btnModificarMI.addActionListener(this);
        this.frmContenedorPrincipal.btnLimpiarMI.addActionListener(this);
    }
public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "MInactivo");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== frmContenedorPrincipal.btnGuardarMI){
            
           mi.setNumeroCedula(frmContenedorPrincipal.txtNumCedulaMI.getText().trim());
            java.util.Date fecha = frmContenedorPrincipal.dateFechaContratacionMI.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de contratacion");
                return; // o no guardes
            }
           mi.setFechaContratacion(new Date(fecha.getTime()));
           mi.setNumTelefono(frmContenedorPrincipal.txtNumTelefonoMI.getText().trim());
           mi.setCorreoElectronico(frmContenedorPrincipal.txtCorreoMI.getText().trim());
           mi.setNombre(frmContenedorPrincipal.txtNombreMI.getText().trim());
           mi.setUbicacion(frmContenedorPrincipal.txtDireccionMI.getText().trim());
           mi.setEstado(0);
            if (DbMedicoI.guardar(mi)) {
                JOptionPane.showMessageDialog(null, "Medico guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
        
        if(e.getSource() == frmContenedorPrincipal.btnEliminarMI){
            mi.setNumeroCedula(frmContenedorPrincipal.txtNumCedulaMI.getText().trim());
            if(DbMedicoI.eliminar(mi)){
                JOptionPane.showMessageDialog(null,"Paciente Eliminado");
                limpiar();
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar medico");
                limpiar();
                }   
           }
           
            //Buscar
         if(e.getSource() == frmContenedorPrincipal.btnBuscarMI){
             mi.setNumeroCedula(frmContenedorPrincipal.txtNumCedulaMI.getText().trim());
             if(DbMedicoI.buscar(mi)){
                 frmContenedorPrincipal.txtNombreMI.setText(mi.getNumeroCedula());
                 frmContenedorPrincipal.txtNumTelefonoMI.setText(mi.getNumTelefono());
                 frmContenedorPrincipal.txtCorreoMI.setText(mi.getCorreoElectronico());
                 frmContenedorPrincipal.txtDireccionMI.setText(mi.getUbicacion());
                 frmContenedorPrincipal.txtEstadoMI.setText(String.valueOf(mi.getEstado()));
                 frmContenedorPrincipal.dateFechaContratacionMI.setDate(mi.getFechaContratacion());
             }else{
                 JOptionPane.showMessageDialog(null, "No se encontró al Paciente ");
                limpiar();
             }
        }
         
         if(e.getSource()==frmContenedorPrincipal.btnModificarMI){
             mi.setNumeroCedula(frmContenedorPrincipal.txtNumCedulaMI.getText().trim());
            java.util.Date fecha = frmContenedorPrincipal.dateFechaContratacionMI.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de contratacion");
                return; // o no guardes
            }
             mi.setNumTelefono(frmContenedorPrincipal.txtNumTelefonoMI.getText().trim());
             mi.setCorreoElectronico(frmContenedorPrincipal.txtCorreoMI.getText().trim());
             mi.setNombre(frmContenedorPrincipal.txtNombreMI.getText().trim());
             mi.setUbicacion(frmContenedorPrincipal.txtDireccionMI.getText().trim());
             if(DbMedicoI.modificar(mi)){
                JOptionPane.showMessageDialog(null, "Medico Modificado");
                limpiar();
             }else
                JOptionPane.showMessageDialog(null, "Error al modificar medico");
                limpiar();
         }
      
        if (e.getSource()== frmContenedorPrincipal.btnLimpiarMI) {
            limpiar();
        }
    }
    public void limpiar(){
        frmContenedorPrincipal.txtNumCedulaMI.setText(null);
        frmContenedorPrincipal.dateFechaContratacionMI.setDate(null);
        frmContenedorPrincipal.txtNombreMI.setText(null);
        frmContenedorPrincipal.txtCorreoMI.setText(null);
        frmContenedorPrincipal.txtNumTelefonoMI.setText(null);
        frmContenedorPrincipal.txtDireccionMI.setText(null);
        frmContenedorPrincipal.txtEstadoMI.setText(null);
    }
    
    
}
