/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.CitaMedicaNorte;
import modelo.DbCitaMedicaNorte;
import vista.frmContenedorPrincipal;


/**
 *
 * @author RIBZ
 */
public class controladorCitaMedicaNorte implements ActionListener{
    private CitaMedicaNorte citaMedicaNorte;
    private DbCitaMedicaNorte citaMeSDb; 
    private frmContenedorPrincipal frmContenedorPrincipal;
    
    public controladorCitaMedicaNorte(CitaMedicaNorte citaMedicaSur, 
            DbCitaMedicaNorte dbCitaMedicaSur, frmContenedorPrincipal frmContenedor){
        this.citaMedicaNorte= citaMedicaSur;
        this.citaMeSDb= dbCitaMedicaSur;
        this.frmContenedorPrincipal= frmContenedor;
        this.frmContenedorPrincipal.btnGuardarCMN2.addActionListener(this);
        this.frmContenedorPrincipal.btnModificarCMN.addActionListener(this);
        this.frmContenedorPrincipal.btnEliminarCMN.addActionListener(this);
        this.frmContenedorPrincipal.btnBuscarCMN1.addActionListener(this);
        this.frmContenedorPrincipal.btnLimpiarCMN.addActionListener(this);
    }
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "CMNorte");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //guardar
        if (e.getSource() == frmContenedorPrincipal.btnGuardarCMN2) {
            citaMedicaNorte.setCodigoCita(Integer.parseInt(frmContenedorPrincipal.txtCodigoCMN.getText()));
            citaMedicaNorte.setComentario(frmContenedorPrincipal.txtAreaComenCMN.getText());
            java.util.Date fecha = frmContenedorPrincipal.dateChooserCMN.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; // o no guardes
            }
            citaMedicaNorte.setFechaCita(new Date(fecha.getTime()));
            String fechaHoraStr = construirFechaHora();
            if (fechaHoraStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se pudo construir la hora de la cita");
                return;
            }
            citaMedicaNorte.setHoraCita(Timestamp.valueOf(fechaHoraStr));
            citaMedicaNorte.setSucursal(frmContenedorPrincipal.txtSucursalCMN.getText());
            if (citaMeSDb.guardar(citaMedicaNorte)) {
                JOptionPane.showMessageDialog(null, "Cita medica guardada con exito");
                limpiar();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "La cita medica no se ha guardado");
                limpiar();
            }
        }
        //modificar
        if (e.getSource() == frmContenedorPrincipal.btnModificarCMN) {
            citaMedicaNorte.setComentario(frmContenedorPrincipal.txtAreaComenCMN.getText());
            java.util.Date fecha = frmContenedorPrincipal.dateChooserCMN.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; // o no guardes
            }
            citaMedicaNorte.setFechaCita(new Date(fecha.getTime()));
            String fechaHoraStr = construirFechaHora();
            if (fechaHoraStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se pudo construir la hora de la cita");
                return;
            }
            citaMedicaNorte.setHoraCita(Timestamp.valueOf(fechaHoraStr));
            citaMedicaNorte.setSucursal(frmContenedorPrincipal.txtSucursalCMN.getText());
            citaMedicaNorte.setCodigoCita(Integer.parseInt(frmContenedorPrincipal.txtCodigoCMN.getText()));
            if (citaMeSDb.modificar(citaMedicaNorte)) {
                JOptionPane.showMessageDialog(null, "Cita medica modificada con éxito");
                limpiar();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "La cita medica no se ha modificado");
                limpiar();
            }
        }
        //eliminar 
        if (e.getSource() == frmContenedorPrincipal.btnEliminarCMN) {
            citaMedicaNorte.setCodigoCita(Integer.parseInt(frmContenedorPrincipal.txtCodigoCMN.getText()));
            if (citaMeSDb.eliminar(citaMedicaNorte)) {
                JOptionPane.showMessageDialog(null, "Cita medica eliminada con éxito");
                limpiar();
 
            }else{
                JOptionPane.showMessageDialog(null, "La cita medica no se ha eliminado");
                limpiar();
            }
        }
        //buscar
        if (e.getSource() == frmContenedorPrincipal.btnBuscarCMN1) {
            citaMedicaNorte.setCodigoCita(Integer.parseInt(frmContenedorPrincipal.txtCodigoCMN.getText()));
            if (citaMeSDb.buscar(citaMedicaNorte)) {
                frmContenedorPrincipal.txtCodigoCMN.setText(String.valueOf(citaMedicaNorte.getCodigoCita()));
                frmContenedorPrincipal.txtAreaComenCMN.setText(citaMedicaNorte.getComentario());
                frmContenedorPrincipal.dateChooserCMN.setDate(citaMedicaNorte.getFechaCita());
                //Extraer la hora 
                Timestamp horaCita = citaMedicaNorte.getHoraCita();
                int[] horaYmin = extraerHoraMinuto(horaCita);
                //valores de los spin
                frmContenedorPrincipal.spinHoraN.setValue(horaYmin[0]);
                frmContenedorPrincipal.spinMinN.setValue(horaYmin[1]);
                frmContenedorPrincipal.txtSucursalCMN.setText(citaMedicaNorte.getSucursal());
                
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado la cita médica");
                limpiar();
            }
        }
        //limpiar
        if (e.getSource() == frmContenedorPrincipal.btnLimpiarCMN) {
            limpiar();
        }
    }
    
     private String construirFechaHora() {
        java.util.Date fechaSeleccionada = frmContenedorPrincipal.dateChooserCMN.getDate();
        if (fechaSeleccionada == null) {
            return "";
        }
        int hora = (Integer) frmContenedorPrincipal.spinHoraN.getValue(); 
        int min  = (Integer) frmContenedorPrincipal.spinMinN.getValue();

        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaSeleccionada);
        cal.set(Calendar.HOUR_OF_DAY, hora);
        cal.set(Calendar.MINUTE, min);
        cal.set(Calendar.SECOND, 0);

        // Formato "yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }
    public void limpiar(){
        frmContenedorPrincipal.txtCodigoCMN.setText(null);
        frmContenedorPrincipal.txtAreaComenCMN.setText(null);
        frmContenedorPrincipal.dateChooserCMN.setDate(null);
        frmContenedorPrincipal.spinHoraN.setValue(0);
        frmContenedorPrincipal.spinMinN.setValue(0);
        frmContenedorPrincipal.txtSucursalCMN.setText(null);
        
    }
    private int[] extraerHoraMinuto(Timestamp horaCita) {
        if (horaCita != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(horaCita.getTime());

            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);

            return new int[] { hour, minute };
        } else {
            // Si no hay hora, retornamos [0, 0] o lo que prefieras
            return new int[] { 0, 0 };
        }
    }

}
