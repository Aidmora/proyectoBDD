/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.DbMedicoActivo;
import modelo.MedicoActivo;
import vista.frmContenedorPrincipal;

/**
 *
 * @author User
 */
public class controladorMedicoActivo implements ActionListener {

    private frmContenedorPrincipal frmContenedorPrincipal;
    private MedicoActivo ma;
    private DbMedicoActivo dbMA;

    public controladorMedicoActivo(frmContenedorPrincipal frmContenedorPrincipal, MedicoActivo ma, DbMedicoActivo dbMA) {
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        this.ma = ma;
        this.dbMA = dbMA;
        this.frmContenedorPrincipal.btnGuardarMA.addActionListener(this);
        this.frmContenedorPrincipal.btnModificarMA.addActionListener(this);
        this.frmContenedorPrincipal.btnEliminarMA.addActionListener(this);
        this.frmContenedorPrincipal.btnBuscarMA.addActionListener(this);
    }

    public void iniciar() {
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "MActivo");
    }

    public void limpiar() {
        frmContenedorPrincipal.txtCorreoMA.setText(null);
        frmContenedorPrincipal.txtCedulaMA.setText(null);
        frmContenedorPrincipal.txtDireccionMA.setText(null);
        frmContenedorPrincipal.txtEstadoMA.setText(null);
        frmContenedorPrincipal.txtNombreMA.setText(null);
        frmContenedorPrincipal.txtTelefonoMA.setText(null);
        Calendar today = Calendar.getInstance();
        frmContenedorPrincipal.dateFechaMA.setDate(today.getTime());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //guardar
        if (e.getSource() == frmContenedorPrincipal.btnGuardarMA) {
            ma.setCedula(frmContenedorPrincipal.txtCedulaMA.getText().trim());
            ma.setCorreo(frmContenedorPrincipal.txtCorreoMA.getText().trim());
            ma.setDireccion(frmContenedorPrincipal.txtDireccionMA.getText().trim());
            ma.setNombre(frmContenedorPrincipal.txtNombreMA.getText().trim());
            ma.setTelefono(frmContenedorPrincipal.txtTelefonoMA.getText().trim());
            java.util.Date fecha = frmContenedorPrincipal.dateFechaMA.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de contratacion");
                return;
            }
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            ma.setFecha(sqlDate);
            if (frmContenedorPrincipal.txtEstadoMA.getText().trim().equalsIgnoreCase("Activo")) {
                ma.setEstado(1);
            } else {
                ma.setEstado(0);
            }
            if (dbMA.guardar(ma)) {
                JOptionPane.showMessageDialog(null, "Medico Activo Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar ");
                limpiar();
            }
        }

        //modificar
        if (e.getSource() == frmContenedorPrincipal.btnModificarMA) {
            ma.setCedula(frmContenedorPrincipal.txtCedulaMA.getText().trim());
            ma.setCorreo(frmContenedorPrincipal.txtCorreoMA.getText().trim());
            ma.setDireccion(frmContenedorPrincipal.txtDireccionMA.getText().trim());
            ma.setNombre(frmContenedorPrincipal.txtNombreMA.getText().trim());
            ma.setTelefono(frmContenedorPrincipal.txtTelefonoMA.getText().trim());
            java.util.Date fecha = frmContenedorPrincipal.dateFechaMA.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de contratación");
                return;
            }
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            ma.setFecha(sqlDate);
            if (frmContenedorPrincipal.txtEstadoMA.getText().trim().equalsIgnoreCase("Activo")) {
                ma.setEstado(1);
            } else {
                ma.setEstado(0);
            }
            if (dbMA.modificar(ma)) {
                JOptionPane.showMessageDialog(null, "Medico Activo Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }

        //buscar
        if (e.getSource() == frmContenedorPrincipal.btnBuscarMA) {
            ma.setCedula(frmContenedorPrincipal.txtCedulaMA.getText().trim());
            if (dbMA.buscar(ma)) {
                frmContenedorPrincipal.txtNombreMA.setText(ma.getNombre());
                frmContenedorPrincipal.txtCorreoMA.setText(ma.getCorreo());
                frmContenedorPrincipal.txtDireccionMA.setText(ma.getDireccion());
                frmContenedorPrincipal.txtTelefonoMA.setText(ma.getTelefono());
                frmContenedorPrincipal.dateFechaMA.setDate(ma.getFecha());
                frmContenedorPrincipal.txtEstadoMA.setText(ma.getEstado() == 1 ? "Activo" : "Inactivo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró al Medico Activo");
                limpiar();
            }
        }

        //eliminar
        if (e.getSource() == frmContenedorPrincipal.btnEliminarMA) {
            ma.setCedula(frmContenedorPrincipal.txtCedulaMA.getText().trim());
            int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este médico?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (dbMA.eliminar(ma)) {
                    JOptionPane.showMessageDialog(null, "Medico Activo Eliminado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar");
                    limpiar();
                }
            }
        }

    }

}
