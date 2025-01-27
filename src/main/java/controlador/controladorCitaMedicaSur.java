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
import modelo.CitaMedicaSur;
import modelo.DbCitaMedicaSur;
import vista.frmContenedorPrincipal;

/**
 *
 * @author LENOVO.USER
 */
public class controladorCitaMedicaSur implements ActionListener {
    private CitaMedicaSur CMS = new CitaMedicaSur();
    private frmContenedorPrincipal contenedorP = new frmContenedorPrincipal();
    private DbCitaMedicaSur dbCMS = new DbCitaMedicaSur();

    public controladorCitaMedicaSur(CitaMedicaSur CMS, DbCitaMedicaSur dbCMS, frmContenedorPrincipal contenedorP) {
        this.CMS = CMS;
        this.contenedorP = contenedorP;
        this.dbCMS = dbCMS;
        //Botones
        this.contenedorP.btnBuscarCMS.addActionListener(this);
        this.contenedorP.btnEliminarCMS.addActionListener(this);
        this.contenedorP.btnModificarCMS.addActionListener(this);
        this.contenedorP.btnGuardarCMS.addActionListener(this);
        this.contenedorP.btnLimpiarCMS.addActionListener(this);
    }
    
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) contenedorP.jPanelPrincipal.getLayout();
        cardLayout.show(contenedorP.jPanelPrincipal, "CMSur");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        //guardar
        if (e.getSource() == contenedorP.btnGuardarCMS) {
            
        if (contenedorP.txtCodigoCMS.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
        return;
}
            CMS.setCodigoCita(Integer.parseInt(contenedorP.txtCodigoCMS.getText().trim()));
            CMS.setComentario(contenedorP.txtComenAreaCMS.getText().trim());
            java.util.Date fecha = contenedorP.dateChooserCMS.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; // o no guardes
            }
            CMS.setFechaCita(new Date(fecha.getTime()));
            String fechaHoraStr = construirFechaHora();
            if (fechaHoraStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se pudo construir la hora de la cita");
                return;
            }
            CMS.setHoraCita(Timestamp.valueOf(fechaHoraStr));
            CMS.setSucursal("SUR");
            if (dbCMS.guardar(CMS)) {
                JOptionPane.showMessageDialog(null, "Cita medica guardada con exito");
                limpiar();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "La cita medica no se ha guardado");
                limpiar();
            }
        }
        //modificar
        
        if (e.getSource() == contenedorP.btnModificarCMS) {
            if (contenedorP.txtCodigoCMS.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
            return;
            }
            CMS.setComentario(contenedorP.txtComenAreaCMS.getText().trim());
            java.util.Date fecha = contenedorP.dateChooserCMS.getDate();
            if (fecha == null) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha de la cita");
                return; // o no guardes
            }
            CMS.setFechaCita(new Date(fecha.getTime()));
            String fechaHoraStr = construirFechaHora();
            if (fechaHoraStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se pudo construir la hora de la cita");
                return;
            }
            CMS.setHoraCita(Timestamp.valueOf(fechaHoraStr));
            CMS.setCodigoCita(Integer.parseInt(contenedorP.txtCodigoCMS.getText().trim()));
            if (dbCMS.modificar(CMS)) {
                JOptionPane.showMessageDialog(null, "Cita medica modificada con éxito");
                limpiar();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "La cita medica no se ha modificado");
                limpiar();
            }
        }
        //eliminar 
        if (e.getSource() == contenedorP.btnEliminarCMS) {
            if (contenedorP.txtCodigoCMS.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
            return;
            }
            CMS.setCodigoCita(Integer.parseInt(contenedorP.txtCodigoCMS.getText().trim()));
            if (dbCMS.eliminar(CMS)) {
                JOptionPane.showMessageDialog(null, "Cita medica eliminada con éxito");
                limpiar();
 
            }else{
                JOptionPane.showMessageDialog(null, "La cita medica no se ha eliminado");
                limpiar();
            }
        }
        //buscar
        if (e.getSource() == contenedorP.btnBuscarCMS) {
            if (contenedorP.txtCodigoCMS.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
            return;
            }
            CMS.setCodigoCita(Integer.parseInt(contenedorP.txtCodigoCMS.getText()));
            if (dbCMS.buscar(CMS)) {
                contenedorP.txtCodigoCMS.setText(String.valueOf(CMS.getCodigoCita()));
                contenedorP.txtComenAreaCMS.setText(CMS.getComentario());
                contenedorP.dateChooserCMS.setDate(CMS.getFechaCita());
                //Extraer la hora 
                Timestamp horaCita = CMS.getHoraCita();
                int[] horaYmin = extraerHoraMinuto(horaCita);
                //valores de los spin
                contenedorP.spinHoraS.setValue(horaYmin[0]);
                contenedorP.spinMinSur.setValue(horaYmin[1]);
                contenedorP.txtSucursalS.setText(CMS.getSucursal());
                
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado la cita médica");
                limpiar();
            }
        }
        //limpiar
        if (e.getSource() == contenedorP.btnLimpiarCMS) {
            limpiar();
        }
    }
    
     private String construirFechaHora() {
        java.util.Date fechaSeleccionada = contenedorP.dateChooserCMS.getDate();
        if (fechaSeleccionada == null) {
            return "";
        }
        int hora = (Integer) contenedorP.spinHoraS.getValue(); 
        int min  = (Integer) contenedorP.spinMinSur.getValue();

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
        contenedorP.txtCodigoCMS.setText(null);
        contenedorP.txtComenAreaCMS.setText(null);
        contenedorP.dateChooserCMS.setDate(null);
        contenedorP.spinHoraS.setValue(0);
        contenedorP.spinMinSur.setValue(0);
        contenedorP.txtSucursalS.setText(null);
        
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
