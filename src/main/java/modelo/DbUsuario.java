/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DbUsuario extends Conexion {
    //guardar
    public boolean guardar (Usuario u){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "INSERT INTO Usuario (nombre,"
                + "correo_electronico, contrasena, estado,rol)"
                + "VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getCorreoElectronico());
            ps.setString(3, u.getContrasenia());
            ps.setInt(4, u.getEstado());
            ps.setString(5, u.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    //modificar
    public boolean modificar (Usuario u){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql = "UPDATE Usuario "
           + "SET nombre = ?, "
           + "    estado = ?, "
           + "    rol = ? "
           + "WHERE correo_electronico = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,u.getNombre());
            ps.setInt(2, u.getEstado());
            ps.setString(3, u.getRol());
            ps.setString(4, u.getCorreoElectronico());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
     //eliminar
    public boolean eliminar (Usuario u){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "DELETE FROM Usuario WHERE correo_electronico =  ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getCorreoElectronico());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    //buscar
    public boolean buscar (Usuario u){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM Usuario WHERE correo_electronico = ?";
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
    
    //buscar para ingresar sesion
    public boolean buscarIngreso(Usuario u) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = getConexion();
    String sql = "SELECT * FROM Usuario WHERE correo_electronico = ? AND TRIM(contrasena) = ?";
    try {
        System.out.println("Preparing statement...");
        ps = con.prepareStatement(sql);
        ps.setString(1, u.getCorreoElectronico().trim());
        ps.setString(2, u.getContrasenia().trim());
        System.out.println("Query: " + sql.replaceFirst("\\?", "'" + u.getCorreoElectronico() + "'").replaceFirst("\\?", "'" + u.getContrasenia() + "'"));
        System.out.print("Correo:" + u.getCorreoElectronico());
        System.out.print("Correo:" + u.getContrasenia().trim());
        rs = ps.executeQuery();
        if (rs.next()) {
            u.setContrasenia(rs.getString("contrasena"));
            u.setCorreoElectronico(rs.getString("correo_electronico"));
            System.out.println("User found: " + u.getCorreoElectronico());
            return true;
        } else {
            System.out.println("User not found.");
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al buscar usuario: " + e.getMessage());
        return false;
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

}
