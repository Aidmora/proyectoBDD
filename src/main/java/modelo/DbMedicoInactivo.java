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
 * @author LENOVO.USER
 */
public class DbMedicoInactivo extends Conexion {
    public boolean guardar (MedicoInactivo mi){
        PreparedStatement ps; 
        Connection con = getConexion();
        String sql= "INSERT INTO Medico_inactivo (numero_cedula_med,nombre,fecha_contratacion,"
                + "numero_telefono,correo_electronico,estado,ubicacion)"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mi.getNumeroCedula());
            ps.setString(2, mi.getNombre());
            ps.setDate(3, mi.getFechaContratacion());
            ps.setString(4, mi.getNumTelefono());
            ps.setString(5, mi.getCorreoElectronico());
            ps.setInt(6, mi.getEstado());
            ps.setString(7, mi.getUbicacion());
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
    public boolean modificar (MedicoInactivo mi){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql = "UPDATE Medico_inactivo "
           + "SET nombre = ?, "
           + "    fecha_contratacion = ?, "
           + "    correo_electronico = ?, "
           + "    estado = ?, "
           + "    ubicacion = ? "
           + "WHERE numero_cedula_med LIKE ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mi.getNombre());
            ps.setDate(2, mi.getFechaContratacion());
            ps.setString(3, mi.getNumTelefono());
            ps.setString(4, mi.getCorreoElectronico());
            ps.setInt(5, mi.getEstado());
            ps.setString(6, mi.getUbicacion());
            ps.setString(7, mi.getNumeroCedula());
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
    public boolean eliminar (MedicoInactivo mi){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "DELETE FROM Medico_inactivo WHERE numero_cedula_med LIKE ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+mi.getNumeroCedula()+"%");
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
    public boolean buscar (MedicoInactivo mi){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM Medico_inactivo WHERE numero_cedula_med LIKE ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+mi.getNumeroCedula()+"%");
            rs= ps.executeQuery();
            if (rs.next()) {
                mi.setNumeroCedula(rs.getString("numero_cedula_med"));
                mi.setNombre(rs.getString("nombre"));
                mi.setFechaContratacion(rs.getDate("fecha_contratacion"));
                mi.setNumTelefono(rs.getString("numero_telefono"));
                mi.setCorreoElectronico(rs.getString("correo_electronico"));
                mi.setEstado(rs.getInt("estado"));
                mi.setUbicacion(rs.getString("ubicacion"));
            }
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
}
