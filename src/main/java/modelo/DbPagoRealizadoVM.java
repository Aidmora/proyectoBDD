/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RIBZ
 */
public class DbPagoRealizadoVM extends Conexion{
    public boolean buscar(PagoRealizadoVM p) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM VWPagoRealizado@dbl132 WHERE numero_pago = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("numero_pago"));
                p.setCantidad(rs.getDouble("cantidad_cancelado"));
                p.setMetodo(rs.getString("metodo_pago"));
                p.setFecha(rs.getDate("fecha_cancelacion"));
                p.setHora(rs.getTimestamp("hora_cancelacion"));
                return true;
            }
            
        } catch (SQLException e) {
            System.err.println(e);
            
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return false;
    }
}
