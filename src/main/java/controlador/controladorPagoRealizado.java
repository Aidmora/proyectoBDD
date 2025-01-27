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
import modelo.DbPagoRealizado;
import modelo.PagoRealizado;
import vista.frmContenedorPrincipal;

/**
 *
 * @author User
 */
public class controladorPagoRealizado implements ActionListener {

    private PagoRealizado pr;
    private frmContenedorPrincipal frmContenedorPrincipal;
    private DbPagoRealizado dbPR;

    public controladorPagoRealizado(PagoRealizado pr, frmContenedorPrincipal frmContenedorPrincipal, DbPagoRealizado dbPR) {
        this.pr = pr;
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        this.dbPR = dbPR;
        this.frmContenedorPrincipal.btnGuardarPR.addActionListener(this);
        this.frmContenedorPrincipal.btnModificarPR.addActionListener(this);
        this.frmContenedorPrincipal.btnEliminarPR.addActionListener(this);
        this.frmContenedorPrincipal.btnBuscarPR.addActionListener(this);
    }

    public void iniciar() {
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "PagoR");
    }

    public void limpiar() {
        frmContenedorPrincipal.txtCantidadPR.setText(null);
        frmContenedorPrincipal.txtHoraPR.setText(null);
        frmContenedorPrincipal.txtMinutoPR.setText(null);
        frmContenedorPrincipal.txtMetodoPR.setText(null);
        Calendar today = Calendar.getInstance();
        frmContenedorPrincipal.dateFechaPR.setDate(today.getTime());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //guardar
        if (e.getSource() == frmContenedorPrincipal.btnGuardarPR) {
            try {
                pr.setCantidad(Double.parseDouble(frmContenedorPrincipal.txtCantidadPR.getText().trim()));
                java.util.Date fecha = frmContenedorPrincipal.dateFechaPR.getDate();
                if (fecha == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione la fecha de cancelación");
                    return;
                }
                java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
                pr.setFecha(sqlDate);
                String horaStr = frmContenedorPrincipal.txtHoraPR.getText().trim();
                String minutoStr = frmContenedorPrincipal.txtMinutoPR.getText().trim();
                if (horaStr.isEmpty() || minutoStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese la hora y los minutos");
                    return;
                }
                int hora = Integer.parseInt(horaStr);
                int minuto = Integer.parseInt(minutoStr);
                if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                    JOptionPane.showMessageDialog(null, "Ingrese una hora válida (0-23) y minutos válidos (0-59)");
                    return;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fecha);
                calendar.set(Calendar.HOUR_OF_DAY, hora);
                calendar.set(Calendar.MINUTE, minuto);
                calendar.set(Calendar.SECOND, 0);
                calendar.set(Calendar.MILLISECOND, 0);
                java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(calendar.getTimeInMillis());
                pr.setHora(sqlTimestamp);
                pr.setMetodo(frmContenedorPrincipal.txtMetodoPR.getText().trim());
                if (dbPR.guardar(pr)) {
                    JOptionPane.showMessageDialog(null, "Pago Realizado Guardado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para cantidad, hora y minutos");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage());
            }
        }

        //modificar
        if (e.getSource() == frmContenedorPrincipal.btnModificarPR) {
            try {
                pr.setCantidad(Double.parseDouble(frmContenedorPrincipal.txtCantidadPR.getText().trim()));
                java.util.Date fecha = frmContenedorPrincipal.dateFechaPR.getDate();
                if (fecha == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione la fecha de cancelación");
                    return;
                }
                java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
                pr.setFecha(sqlDate);
                String horaStr = frmContenedorPrincipal.txtHoraPR.getText().trim();
                String minutoStr = frmContenedorPrincipal.txtMinutoPR.getText().trim();
                if (horaStr.isEmpty() || minutoStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese la hora y los minutos");
                    return;
                }
                int hora = Integer.parseInt(horaStr);
                int minuto = Integer.parseInt(minutoStr);
                if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                    JOptionPane.showMessageDialog(null, "Ingrese una hora válida (0-23) y minutos válidos (0-59)");
                    return;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fecha);
                calendar.set(Calendar.HOUR_OF_DAY, hora);
                calendar.set(Calendar.MINUTE, minuto);
                calendar.set(Calendar.SECOND, 0);
                calendar.set(Calendar.MILLISECOND, 0);
                java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(calendar.getTimeInMillis());
                pr.setHora(sqlTimestamp);
                pr.setMetodo(frmContenedorPrincipal.txtMetodoPR.getText().trim());
                if (dbPR.modificar(pr)) {
                    JOptionPane.showMessageDialog(null, "Pago Realizado Modificado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para cantidad, hora y minutos");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage());
            }
        }

        //buscar
        if (e.getSource() == frmContenedorPrincipal.btnBuscarPR) {
            pr.setId(Integer.parseInt(frmContenedorPrincipal.txtIdPR.getText().trim()));
            if (dbPR.buscar(pr)) {
                frmContenedorPrincipal.txtCantidadPR.setText(Double.toString(pr.getCantidad()));
                frmContenedorPrincipal.txtMetodoPR.setText(pr.getMetodo());
                frmContenedorPrincipal.dateFechaPP.setDate(pr.getFecha());
                if (pr.getHora() != null) { 
                    java.sql.Timestamp timestamp = pr.getHora();
                    java.util.Date horaDate = new java.util.Date(timestamp.getTime());
                    java.text.SimpleDateFormat horaFormat = new java.text.SimpleDateFormat("HH");
                    java.text.SimpleDateFormat minutoFormat = new java.text.SimpleDateFormat("mm");
                    String hora = horaFormat.format(horaDate);
                    String minutos = minutoFormat.format(horaDate);
                    frmContenedorPrincipal.txtHoraPR.setText(hora);
                    frmContenedorPrincipal.txtMinutoPR.setText(minutos);
                } else {
                    frmContenedorPrincipal.txtHoraPR.setText("");
                    frmContenedorPrincipal.txtMinutoPR.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el Pago Realizado");
                limpiar();
            }
        }
        
        //eliminar
         if(e.getSource()== frmContenedorPrincipal.btnEliminarPR){
             pr.setId(Integer.parseInt(frmContenedorPrincipal.txtIdPR.getText().trim()));
            if (dbPR.eliminar(pr)) {
                JOptionPane.showMessageDialog(null, "Pago Realizado Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar ");
                limpiar();
            }
        }

    }

}
