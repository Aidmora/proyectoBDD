/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author RIBZ
 */
import java.awt.CardLayout;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Auditoria;
import modelo.DbAuditoria;
import vista.frmContenedorPrincipal;

public class ControladorAuditoria {
    private DbAuditoria dbAuditoria;
    private frmContenedorPrincipal frmContenedorPrincipal;

    public ControladorAuditoria(DbAuditoria dbAuditoria, frmContenedorPrincipal frmContenedorPrincipal) {
        this.dbAuditoria = dbAuditoria;
        this.frmContenedorPrincipal = frmContenedorPrincipal;
        cargarTablaAuditoria();
    }
    public void iniciar(){
        CardLayout cardLayout = (CardLayout) frmContenedorPrincipal.jPanelPrincipal.getLayout();
        cardLayout.show(frmContenedorPrincipal.jPanelPrincipal, "Auditoria");
    }
    public void cargarTablaAuditoria() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Fecha");
        model.addColumn("Operación");
        model.addColumn("Tabla");
        model.addColumn("Anterior");
        model.addColumn("Nuevo");

        List<Auditoria> listaAuditoria = dbAuditoria.obtenerAuditoria();
        for (Auditoria a : listaAuditoria) {
            model.addRow(new Object[]{
                a.getUserName(),
                a.getFecha(),
                a.getTipoOperacion(),
                a.getNombreTabla(),
                a.getAnterior(),
                a.getNuevo()
            });
        }

        frmContenedorPrincipal.jTableAud.setModel(model); 
    }
}

