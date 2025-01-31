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
public class DbPagoPendienteVM extends Conexion{
    //buscar
    public boolean buscar (PagoPendienteVM p){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM VWPagoPendiente@dbl132 WHERE codigo_pendiente = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            rs= ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("codigo_pendiente"));
                p.setCantidad(rs.getDouble("cantidad_cancelar"));
                p.setEstado(rs.getInt("estado"));
                p.setFecha(rs.getDate("fecha_limite"));
                return true;
            }
        } catch (SQLException e) {
            System.err.println(e);
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return false;
    }
}
