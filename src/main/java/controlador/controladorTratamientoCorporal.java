 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JOptionPane;
import modelo.DbTratamientoCorporal;
import modelo.TratamientoCorporal;
import vista.frmContenedorPrincipal;


/**
 *
 * @author LENOVO.USER
 */
public class controladorTratamientoCorporal implements ActionListener {
    private TratamientoCorporal tCorporal;
    private DbTratamientoCorporal dbCorporal;
    private frmContenedorPrincipal frmPrin;

    public controladorTratamientoCorporal(TratamientoCorporal tCorporal, DbTratamientoCorporal dbCorporal, frmContenedorPrincipal frmPrin) {
        this.tCorporal = tCorporal;
        this.dbCorporal = dbCorporal;
        this.frmPrin = frmPrin;
        //Botones
        this.frmPrin.btnBuscarTC.addActionListener(this);
        this.frmPrin.btnGuardarTC.addActionListener(this);
        this.frmPrin.btnModificarTC.addActionListener(this);
        this.frmPrin.btnLimpiarTC.addActionListener(this);
        this.frmPrin.btnEliminarTC.addActionListener(this);
    }

    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmPrin.jPanelPrincipal.getLayout();
        cardLayout.show(frmPrin.jPanelPrincipal, "TCorporal");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // GUARDAR
        if (e.getSource() == frmPrin.btnGuardarTC) {
             if (frmPrin.txtCodigoTC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
                return;
             }
            tCorporal.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTC.getText().trim())
            );
            
            // Usamos Locale.US para forzar el uso del punto como separador decimal
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);

            try {
                String txtPrecio = frmPrin.txtPrecioTC.getText().trim();
                // Parse usando el formato de Estados Unidos
                Number number = nf.parse(txtPrecio); 
                BigDecimal precio = new BigDecimal(number.toString());
                tCorporal.setPrecio(precio);

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    frmPrin,
                    "Precio no válido. Por favor, use punto (.) como separador decimal.",
                    "Error de Formato",
                    JOptionPane.ERROR_MESSAGE
                );
                return; // No guardamos nada
            }
            
            tCorporal.setNombreTratamiento(frmPrin.txtNombreTC.getText().trim());
            tCorporal.setTipo(frmPrin.txtTipoTC.getText().toUpperCase().trim()); 
            
            if (dbCorporal.guardar(tCorporal)) {
                JOptionPane.showMessageDialog(frmPrin, "Tratamiento Guardado con éxito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(frmPrin, "Error al guardar el tratamiento");
                limpiar();
            }
        }
        
        // MODIFICAR
        if (e.getSource() == frmPrin.btnModificarTC) {
            
            if (frmPrin.txtCodigoTC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
                return;
             }
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);

            try {
                String txtPrecio = frmPrin.txtPrecioTC.getText().trim();
                Number number = nf.parse(txtPrecio); 
                BigDecimal precio = new BigDecimal(number.toString());
                tCorporal.setPrecio(precio);

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    frmPrin,
                    "Precio no válido. Use punto (.) como separador decimal.",
                    "Error de Formato",
                    JOptionPane.ERROR_MESSAGE
                );
                return; // No modificamos nada
            }
            
            tCorporal.setNombreTratamiento(frmPrin.txtNombreTC.getText().trim());
            tCorporal.setTipo(frmPrin.txtTipoTC.getText().trim());
            tCorporal.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTC.getText().trim())
            );
            
            if (dbCorporal.modificar(tCorporal)) {
                JOptionPane.showMessageDialog(frmPrin, "Tratamiento modificado con éxito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(frmPrin, "Error al modificar el tratamiento");
                limpiar();
            }
        }
        
        // ELIMINAR
        if (e.getSource() == frmPrin.btnEliminarTC) {
            if (frmPrin.txtCodigoTC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
                return;
             }
            tCorporal.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTC.getText().trim())
            );
            
            if (dbCorporal.eliminar(tCorporal)) {
                JOptionPane.showMessageDialog(frmPrin, "Tratamiento eliminado con éxito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(frmPrin, "Error al eliminar el tratamiento");
                limpiar();
            }
        }
        
        // BUSCAR
        if (e.getSource() == frmPrin.btnBuscarTC) {
            
            
            if (frmPrin.txtCodigoTC.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
                return;
             }
            tCorporal.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTC.getText().trim())
            );
            
            if (dbCorporal.buscar(tCorporal)) {
                frmPrin.txtCodigoTC.setText(String.valueOf(tCorporal.getCodigoTratamiento()));
                frmPrin.txtNombreTC.setText(tCorporal.getNombreTratamiento());
                frmPrin.txtPrecioTC.setValue(tCorporal.getPrecio());
                frmPrin.txtTipoTF.setText(tCorporal.getTipo());
            } else {
                JOptionPane.showMessageDialog(frmPrin, "No se ha encontrado un tratamiento");
                limpiar();
            }
        }
        
        // LIMPIAR
        if (e.getSource() == frmPrin.btnLimpiarTC) {
            limpiar();
        }
    }
    
    public void limpiar(){
        frmPrin.txtCodigoTC.setText(null);
        frmPrin.txtNombreTC.setText(null);
        frmPrin.txtPrecioTC.setText(null);
        frmPrin.txtTipoTC.setText(null);
    }
}
