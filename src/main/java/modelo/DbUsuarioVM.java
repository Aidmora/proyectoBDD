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
public class DbUsuarioVM  extends Conexion{
    public boolean buscar (UsuarioVM u){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM VWUsuario@dbl132 WHERE correo_electronico = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getCorreoElectronico().trim());
            rs= ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getString("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setCorreoElectronico(rs.getString("correo_electronico"));
                u.setEstado(rs.getInt("estado"));
                u.setRol(rs.getString("rol"));
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
