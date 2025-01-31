/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.DbPaciente;
import modelo.Paciente;
import vista.frmContenedorPrincipal;

/**
 *
 * @author RIBZ
 */
public class controladorPaciente implements ActionListener{
    
    private Paciente pa;
    private frmContenedorPrincipal frmContenedorPrincipal;
    private DbPaciente DbPaciente;
    
    public controladorPaciente(Paciente pac, DbPaciente dbPac, frmContenedorPrincipal frmContenedor){
        this.pa= pac;
        this.frmContenedorPrincipal= frmContenedor;
        this.DbPaciente= dbPac;
        this.frmContenedorPrincipal.btnGuardarPa.addActionListener(this);
        this.frmContenedorPrincipal.btnModificarPa.addActionListener(this);
        this.frmContenedorPrincipal.btnEliminarPa.addActionListener(this);
        this.frmContenedorPrincipal.btnBuscarPa.addActionListener(this);
        this.frmContenedorPrincipal.btnLimpiarPa.addActionListener(this);
       
    }
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "Paciente");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Guardar
        if(e.getSource()== frmContenedorPrincipal.btnGuardarPa){
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedulaPA.getText().trim());
            java.util.Date fecha = frmContenedorPrincipal.dateFechaNacPA.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; // o no guardes
            }
           pa.setFechaNacimiento(new Date(fecha.getTime()));
           pa.setNumeroTelefono(frmContenedorPrincipal.txtNumTelPA.getText().trim());
           pa.setCorreoElectronico(frmContenedorPrincipal.txtCorreoElecPA.getText().trim());
           pa.setNombre(frmContenedorPrincipal.txtNombrePA.getText().trim());
           pa.setUbicacion(frmContenedorPrincipal.txtUbicacionPA.getText().trim());
            if (DbPaciente.guardar(pa)) {
                JOptionPane.showMessageDialog(null, "Paciente Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar ");
                limpiar();
            }
        }
        //Modificar
        if(e.getSource()== frmContenedorPrincipal.btnModificarPa){
            java.util.Date fecha = frmContenedorPrincipal.dateFechaNacPA.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; // o no guardes
            }
           pa.setFechaNacimiento(new Date(fecha.getTime()));
           pa.setNumeroTelefono(frmContenedorPrincipal.txtNumTelPA.getText().trim());
           pa.setCorreoElectronico(frmContenedorPrincipal.txtCorreoElecPA.getText().trim());
           pa.setNombre(frmContenedorPrincipal.txtNombrePA.getText().trim());
           pa.setUbicacion(frmContenedorPrincipal.txtUbicacionPA.getText().trim());
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedulaPA.getText().trim());
            if (DbPaciente.modificar(pa)) {
                JOptionPane.showMessageDialog(null, "Paciente Modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar ");
                limpiar();
            }
        }
        //Eliminar
        if(e.getSource()== frmContenedorPrincipal.btnEliminarPa){
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedulaPA.getText().trim());
            if (DbPaciente.eliminar(pa)) {
                JOptionPane.showMessageDialog(null, "Paciente Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar ");
                limpiar();
            }
        }
        //Buscar
        if(e.getSource()== frmContenedorPrincipal.btnBuscarPa){
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedulaPA.getText().trim());
            if (DbPaciente.buscar(pa)) {
                frmContenedorPrincipal.txtCedulaPA.setText(pa.getNumeroCedula());
                frmContenedorPrincipal.dateFechaNacPA.setDate(pa.getFechaNacimiento());
                frmContenedorPrincipal.txtNumTelPA.setText(pa.getNumeroTelefono());
                frmContenedorPrincipal.txtCorreoElecPA.setText(pa.getCorreoElectronico());
                frmContenedorPrincipal.txtNombrePA.setText(pa.getNombre());
                frmContenedorPrincipal.txtUbicacionPA.setText(pa.getUbicacion());
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró al Paciente ");
                limpiar();
            }
        }
        if (e.getSource()== frmContenedorPrincipal.btnLimpiarPa) {
            limpiar();
        }
    }
    public void limpiar(){
        frmContenedorPrincipal.txtCedulaPA.setText(null);
        frmContenedorPrincipal.dateFechaNacPA.setDate(null);
        frmContenedorPrincipal.txtNumTelPA.setText(null);
        frmContenedorPrincipal.txtCorreoElecPA.setText(null);
        frmContenedorPrincipal.txtNombrePA.setText(null);
        frmContenedorPrincipal.txtUbicacionPA.setText(null);
    }
    
    
}
