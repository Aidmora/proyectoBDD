/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;

/**
 *
 * @author User
 */
public class DbPagoPendiente extends Conexion {
    //guardar
    public boolean guardar (PagoPendiente p){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "INSERT INTO PagoPendiente (cantidad_cancelar,fecha_limite,"
                + "estado)"
                + "VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, p.getCantidad());
            ps.setDate(2, p.getFecha());
            ps.setInt(3, p.getEstado());
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
    public boolean modificar (PagoPendiente p){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql = "UPDATE PagoPendiente "
           + "SET cantidad_cancelar = ?, "
           + "    fecha_limite = ?, "
           + "    estado = ? "
           + "WHERE codigo_pendiente = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, p.getCantidad());
            ps.setDate(2, p.getFecha());
            ps.setInt(3, p.getEstado());
            ps.setInt(4, p.getId());
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
    public boolean buscar (PagoPendiente p){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM PagoPendiente WHERE codigo_pendiente = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            rs= ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("codigo_pendiente"));
                p.setCantidad(rs.getDouble("cantidad_cancelar"));
                p.setEstado(rs.getInt("estado"));
                p.setFecha(rs.getDate("fecha_limite"));
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
    
    //eliminar 
    public boolean eliminar (PagoPendiente p){
        PreparedStatement ps; 
        Connection con= getConexion();
        String sql= "DELETE FROM PagoPendiente WHERE codigo_pendiente = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
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
}
