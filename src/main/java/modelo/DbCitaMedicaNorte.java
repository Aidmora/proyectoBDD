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
public class DbCitaMedicaNorte extends Conexion {
    //guardar 
    public boolean guardar (CitaMedicaNorte cms){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "INSERT INTO CitaMedica_Norte (codigo_cita,comentario,"
                + "fecha_cita,hora_cita, sucursal)"
                + "VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cms.getCodigoCita());
            ps.setString(2, cms.getComentario());
            ps.setDate(3, cms.getFechaCita());
            ps.setTimestamp(4, cms.getHoraCita());
            ps.setString(5, cms.getSucursal());
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
    public boolean modificar (CitaMedicaNorte cms){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "UPDATE CitaMedica_Norte SET comentario= ?,"
                + "fecha_cita= ?,hora_cita= ?, sucursal=? WHERE codigo_cita= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cms.getComentario());
            ps.setDate(2, cms.getFechaCita());
            ps.setTimestamp(3, cms.getHoraCita());
            ps.setString(4, cms.getSucursal());
            ps.setInt(5, cms.getCodigoCita());
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
    public boolean eliminar (CitaMedicaNorte cms){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "DELETE FROM CitaMedica_Norte WHERE codigo_cita= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cms.getCodigoCita());
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
    public boolean buscar (CitaMedicaNorte cms){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM CitaMedica_Norte WHERE codigo_cita= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cms.getCodigoCita());
            rs= ps.executeQuery();
            if (rs.next()) {
                cms.setCodigoCita(Integer.parseInt(rs.getString("codigo_cita")));
                cms.setComentario(rs.getString("comentario"));
                cms.setFechaCita(rs.getDate("fecha_cita"));
                cms.setHoraCita(rs.getTimestamp("hora_cita"));
                cms.setSucursal(rs.getString("sucursal"));
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
