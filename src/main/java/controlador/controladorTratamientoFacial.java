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
import modelo.DbTratamientoFacial;
import modelo.TratamientoFacial;
import vista.frmContenedorPrincipal;

/**
 *
 * @author 
 */
public class controladorTratamientoFacial implements ActionListener {
    
    private TratamientoFacial tFacial = new TratamientoFacial();
    private DbTratamientoFacial dbFacial = new DbTratamientoFacial();
    private frmContenedorPrincipal frmPrin = new frmContenedorPrincipal();
    
    public controladorTratamientoFacial(TratamientoFacial trFacial, 
            DbTratamientoFacial dbTFacial, frmContenedorPrincipal frmContenedor){
        
        this.tFacial = trFacial;
        this.dbFacial = dbTFacial;
        this.frmPrin = frmContenedor;
        
        // Agregamos los listeners
        this.frmPrin.btnGuardarTF.addActionListener(this);
        this.frmPrin.btnModificarTF.addActionListener(this);
        this.frmPrin.btnEliminarTF.addActionListener(this);
        this.frmPrin.btnBuscarTF.addActionListener(this);
        this.frmPrin.btnLimpiarTF.addActionListener(this);
    }
    
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmPrin.jPanelPrincipal.getLayout();
        cardLayout.show(frmPrin.jPanelPrincipal, "TFacial");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // GUARDAR
        if (e.getSource() == frmPrin.btnGuardarTF) {
            tFacial.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTF.getText().trim())
            );
            
            // Usamos Locale.US para forzar el uso del punto como separador decimal
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);

            try {
                String txtPrecio = frmPrin.txtPrecioTF.getText().trim();
                // Parse usando el formato de Estados Unidos
                Number number = nf.parse(txtPrecio); 
                BigDecimal precio = new BigDecimal(number.toString());
                tFacial.setPrecio(precio);

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    frmPrin,
                    "Precio no válido. Por favor, use punto (.) como separador decimal.",
                    "Error de Formato",
                    JOptionPane.ERROR_MESSAGE
                );
                return; // No guardamos nada
            }
            
            tFacial.setNombreTratamiento(frmPrin.txtNombreTF.getText().trim());
            tFacial.setTipo(frmPrin.txtTipoTF.getText().toUpperCase().trim()); 
            
            if (dbFacial.guardar(tFacial)) {
                JOptionPane.showMessageDialog(frmPrin, "Tratamiento Guardado con éxito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(frmPrin, "Error al guardar el tratamiento");
                limpiar();
            }
        }
        
        // MODIFICAR
        if (e.getSource() == frmPrin.btnModificarTF) {
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);

            try {
                String txtPrecio = frmPrin.txtPrecioTF.getText().trim();
                Number number = nf.parse(txtPrecio); 
                BigDecimal precio = new BigDecimal(number.toString());
                tFacial.setPrecio(precio);

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    frmPrin,
                    "Precio no válido. Use punto (.) como separador decimal.",
                    "Error de Formato",
                    JOptionPane.ERROR_MESSAGE
                );
                return; // No modificamos nada
            }
            
            tFacial.setNombreTratamiento(frmPrin.txtNombreTF.getText().trim());
            tFacial.setTipo(frmPrin.txtTipoTF.getText().trim());
            tFacial.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTF.getText().trim())
            );
            
            if (dbFacial.modificar(tFacial)) {
                JOptionPane.showMessageDialog(frmPrin, "Tratamiento modificado con éxito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(frmPrin, "Error al modificar el tratamiento");
                limpiar();
            }
        }
        
        // ELIMINAR
        if (e.getSource() == frmPrin.btnEliminarTF) {
            tFacial.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTF.getText().trim())
            );
            
            if (dbFacial.eliminar(tFacial)) {
                limpiar();
                JOptionPane.showMessageDialog(frmPrin, "Tratamiento eliminado con éxito");
            } else {
                limpiar();
                JOptionPane.showMessageDialog(frmPrin, "Error al eliminar el tratamiento");
            }
        }
        
        // BUSCAR
        if (e.getSource() == frmPrin.btnBuscarTF) {
            tFacial.setCodigoTratamiento(
                Integer.parseInt(frmPrin.txtCodigoTF.getText().trim())
            );
            
            if (dbFacial.buscar(tFacial)) {
                frmPrin.txtCodigoTF.setText(String.valueOf(tFacial.getCodigoTratamiento()));
                frmPrin.txtNombreTF.setText(tFacial.getNombreTratamiento());
                frmPrin.txtPrecioTF.setValue(tFacial.getPrecio());
                frmPrin.txtTipoTF.setText(tFacial.getTipo());
            } else {
                JOptionPane.showMessageDialog(frmPrin, "No se ha encontrado un tratamiento");
                limpiar();
            }
        }
        
        // LIMPIAR
        if (e.getSource() == frmPrin.btnLimpiarTF) {
            limpiar();
        }
    }
    
    public void limpiar(){
        frmPrin.txtCodigoTF.setText(null);
        frmPrin.txtNombreTF.setText(null);
        frmPrin.txtPrecioTF.setText(null);
        frmPrin.txtTipoTF.setText(null);
    }
    
}
