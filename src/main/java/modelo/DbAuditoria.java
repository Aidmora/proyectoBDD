/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author RIBZ
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DbAuditoria extends Conexion {
    public List<Auditoria> obtenerAuditoria() {
        List<Auditoria> listaAuditoria = new ArrayList<>();
        String sql = "SELECT user_name, fecha, tipo_operacion, nombre_table, anterior, nuevo FROM AUDITORIA";

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                listaAuditoria.add(new Auditoria(
                    rs.getString("user_name"),
                    rs.getString("fecha"),
                    rs.getString("tipo_operacion"),
                    rs.getString("nombre_table"),
                    rs.getString("anterior"),
                    rs.getString("nuevo")
                ));
            }
        } catch (Exception e) {
            System.err.println("Error al obtener auditoría: " + e.getMessage());
        }

        return listaAuditoria;
    }
}

