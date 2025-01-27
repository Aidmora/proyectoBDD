/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.DbPagoPendiente;
import modelo.PagoPendiente;
import vista.frmContenedorPrincipal;

/**
 *
 * @author User
 */
public class controladorPagoPendiente implements ActionListener {

    private PagoPendiente pp;
    private frmContenedorPrincipal frmContenedorPrincipal;
    private DbPagoPendiente dbPP;

    public controladorPagoPendiente(PagoPendiente pp, frmContenedorPrincipal frmContenedorPrincipal, DbPagoPendiente dbPP) {
        this.pp = pp;
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        this.dbPP = dbPP;
        this.frmContenedorPrincipal.btnGuardarPP.addActionListener(this);
        this.frmContenedorPrincipal.btnModificarPP.addActionListener(this);
        this.frmContenedorPrincipal.btnEliminarPP.addActionListener(this);
        this.frmContenedorPrincipal.btnBuscarPP.addActionListener(this);
    }
    
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "PagoP");
    }
    
    public void limpiar(){
        frmContenedorPrincipal.txtEstadoPP.setText(null);
        frmContenedorPrincipal.txtIdPP.setText(null);
        frmContenedorPrincipal.txtCantidadPP.setText(null);
        Calendar today = Calendar.getInstance();
        frmContenedorPrincipal.dateFechaPP.setDate(today.getTime());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //guardar
        if(e.getSource()== frmContenedorPrincipal.btnGuardarPP){
            pp.setCantidad(Double.parseDouble(frmContenedorPrincipal.txtCantidadPP.getText().trim()));
            java.util.Date fecha = frmContenedorPrincipal.dateFechaPP.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; 
            }
             java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            pp.setFecha(sqlDate);
            if(frmContenedorPrincipal.txtEstadoPP.getText().trim().equalsIgnoreCase("Activo")){
               pp.setEstado(1); 
            }else{
               pp.setEstado(0);
            }
            if (dbPP.guardar(pp)) {
                JOptionPane.showMessageDialog(null, "Pago Pendiente Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar ");
                limpiar();
            }
        }
        
        //modificar
        if(e.getSource()== frmContenedorPrincipal.btnModificarPP){
            pp.setCantidad(Double.parseDouble(frmContenedorPrincipal.txtCantidadPP.getText().trim()));
            java.util.Date fecha = frmContenedorPrincipal.dateFechaPP.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; 
            }
             java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            pp.setFecha(sqlDate);
            System.out.print(frmContenedorPrincipal.txtEstadoPP.getText().trim());
            if(frmContenedorPrincipal.txtEstadoPP.getText().trim().equalsIgnoreCase("Activo")){
               pp.setEstado(1); 
            }else{
               pp.setEstado(0);
            }
            if (dbPP.modificar(pp)) {
                JOptionPane.showMessageDialog(null, "Pago Pendiente Actualizado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar ");
                limpiar();
            }
        }
        
        //buscar
         if(e.getSource()== frmContenedorPrincipal.btnBuscarPP){
             pp.setId(Integer.parseInt(frmContenedorPrincipal.txtIdPP.getText().trim()));
             if (dbPP.buscar(pp)) {
                 frmContenedorPrincipal.txtCantidadPP.setText(Double.toString(pp.getCantidad()));
                 String estado;
                 if(pp.getEstado() == 1){
                     estado = "Activo";
                 } else{
                     estado = "Inactivo";
                 }
                 frmContenedorPrincipal.txtEstadoPP.setText(estado);
                 frmContenedorPrincipal.dateFechaPP.setDate(pp.getFecha());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró al Pago Pendiente ");
                limpiar();
            }
        }
         
         //eliminar
         if(e.getSource()== frmContenedorPrincipal.btnEliminarPP){
             pp.setId(Integer.parseInt(frmContenedorPrincipal.txtIdPP.getText().trim()));
            if (dbPP.eliminar(pp)) {
                JOptionPane.showMessageDialog(null, "Pago Pendiente Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar ");
                limpiar();
            }
        }
    }
    
}
