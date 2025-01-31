/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RIBZ
 */
public class DbTratamientoFacial extends Conexion {
   public boolean guardar (TratamientoFacial tf){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "INSERT INTO Tratamiento_Facial (codigo_tratamiento, nombre_tratamiento,precio,"
                + "tipo)"
                + "VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tf.getCodigoTratamiento());
            ps.setString(2, tf.getNombreTratamiento());
            ps.setBigDecimal(3, tf.getPrecio());
            ps.setString(4, tf.getTipo());
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
   //Modificar 
   public boolean modificar (TratamientoFacial tf){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "UPDATE Tratamiento_Facial SET nombre_tratamiento= ?,precio= ?,"
                + "tipo= ?  WHERE codigo_tratamiento= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tf.getNombreTratamiento());
            ps.setBigDecimal(2, tf.getPrecio());
            ps.setString(3, tf.getTipo());
            ps.setInt(4, tf.getCodigoTratamiento());
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
   public boolean eliminar (TratamientoFacial tf){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "DELETE FROM Tratamiento_Facial  WHERE codigo_tratamiento= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tf.getCodigoTratamiento());
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
   //Buscar 
    public boolean buscar (TratamientoFacial tf){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM Tratamiento_Facial  WHERE codigo_tratamiento= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tf.getCodigoTratamiento());
            rs= ps.executeQuery();
            if (rs.next()) {
                tf.setCodigoTratamiento(Integer.parseInt(rs.getString("codigo_tratamiento")));
                tf.setNombreTratamiento(rs.getString("nombre_tratamiento"));
                tf.setPrecio(rs.getBigDecimal("precio"));
                tf.setTipo(rs.getString("tipo"));
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
