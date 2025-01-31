/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
/**
 *
 * @author RIBZ
 */
public class DbPaciente extends Conexion{
    public boolean guardar (Paciente p){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "INSERT INTO Paciente (numero_cedula,fecha_nacimiento,"
                + "numero_telefono,correo_electronico, nombre,ubicacion)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNumeroCedula());
            ps.setDate(2, p.getFechaNacimiento());
            ps.setString(3, p.getNumeroTelefono());
            ps.setString(4, p.getCorreoElectronico());
            ps.setString(5, p.getNombre());
            ps.setString(6, p.getUbicacion());
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
    public boolean modificar (Paciente p){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql = "UPDATE Paciente "
           + "SET fecha_nacimiento = ?, "
           + "    numero_telefono = ?, "
           + "    correo_electronico = ?, "
           + "    nombre = ?, "
           + "    ubicacion = ? "
           + "WHERE numero_cedula LIKE ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, p.getFechaNacimiento());
            ps.setString(2, p.getNumeroTelefono());
            ps.setString(3, p.getCorreoElectronico());
            ps.setString(4, p.getNombre());
            ps.setString(5, p.getUbicacion());
            ps.setString(6, p.getNumeroCedula());
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
    public boolean eliminar (Paciente p){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "DELETE FROM Paciente WHERE numero_cedula LIKE ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+p.getNumeroCedula()+"%");
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
    public boolean buscar (Paciente p){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM Paciente WHERE numero_cedula LIKE ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+p.getNumeroCedula()+"%");
            rs= ps.executeQuery();
            if (rs.next()) {
                p.setNumeroCedula(rs.getString("numero_cedula"));
                p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                p.setNumeroTelefono(rs.getString("numero_telefono"));
                p.setCorreoElectronico(rs.getString("correo_electronico"));
                p.setNombre(rs.getString("nombre"));
                p.setUbicacion(rs.getString("ubicacion"));
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
