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
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedula.getText().trim());
           pa.setFechaNacimiento(new java.sql.Date(frmContenedorPrincipal.dateFechaNac.getDate().getTime()));
           pa.setNumeroTelefono(frmContenedorPrincipal.txtNumTel.getText().trim());
           pa.setCorreoElectronico(frmContenedorPrincipal.txtCorreoElec.getText().trim());
           pa.setNombre(frmContenedorPrincipal.txtNombre.getText().trim());
           pa.setUbicacion(frmContenedorPrincipal.txtUbicacion.getText().trim());
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
           pa.setFechaNacimiento(new java.sql.Date(frmContenedorPrincipal.dateFechaNac.getDate().getTime()));
           pa.setNumeroTelefono(frmContenedorPrincipal.txtNumTel.getText().trim());
           pa.setCorreoElectronico(frmContenedorPrincipal.txtCorreoElec.getText().trim());
           pa.setNombre(frmContenedorPrincipal.txtNombre.getText().trim());
           pa.setUbicacion(frmContenedorPrincipal.txtUbicacion.getText().trim());
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedula.getText().trim());
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
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedula.getText().trim());
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
           pa.setNumeroCedula(frmContenedorPrincipal.txtCedula.getText().trim());
            if (DbPaciente.buscar(pa)) {
                frmContenedorPrincipal.txtCedula.setText(pa.getNumeroCedula());
                frmContenedorPrincipal.dateFechaNac.setDate(pa.getFechaNacimiento());
                frmContenedorPrincipal.txtNumTel.setText(pa.getNumeroTelefono());
                frmContenedorPrincipal.txtCorreoElec.setText(pa.getCorreoElectronico());
                frmContenedorPrincipal.txtNombre.setText(pa.getNombre());
                frmContenedorPrincipal.txtUbicacion.setText(pa.getUbicacion());
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
        frmContenedorPrincipal.txtCedula.setText(null);
        frmContenedorPrincipal.dateFechaNac.setDate(null);
        frmContenedorPrincipal.txtNumTel.setText(null);
        frmContenedorPrincipal.txtCorreoElec.setText(null);
        frmContenedorPrincipal.txtNombre.setText(null);
        frmContenedorPrincipal.txtUbicacion.setText(null);
    }
    
    
}
