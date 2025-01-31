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
public class DbMedicoActivo extends Conexion {

    //guardar
    public boolean guardar(MedicoActivo ma) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO Medico_activo(numero_cedula_med, nombre,fecha_contratacion,"
                + "numero_telefono, correo_electronico, estado, ubicacion)"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getCedula());
            ps.setString(2, ma.getNombre());
            ps.setDate(3, ma.getFecha());
            ps.setString(4, ma.getTelefono());
            ps.setString(5, ma.getCorreo());
            ps.setInt(6, ma.getEstado());
            ps.setString(7, ma.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //eliminar
    public boolean eliminar(MedicoActivo ma) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM Medico_activo WHERE numero_cedula_med = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getCedula());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    //buscar
    public boolean buscar(MedicoActivo ma) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM Medico_activo WHERE numero_cedula_med = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getCedula());
            rs = ps.executeQuery();
            if (rs.next()) {
                ma.setCedula(rs.getString("numero_cedula_med"));
                ma.setNombre(rs.getString("nombre"));
                ma.setFecha(rs.getDate("fecha_contratacion"));
                ma.setTelefono(rs.getString("numero_telefono"));
                ma.setCorreo(rs.getString("correo_electronico"));
                ma.setEstado(rs.getInt("estado"));
                ma.setDireccion(rs.getString("ubicacion"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //modificar
    public boolean modificar(MedicoActivo ma) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE Medico_activo "
                + "SET nombre = ?, "
                + "    fecha_contratacion = ?, "
                + "    numero_telefono = ?, "
                + "    correo_electronico = ?, "
                + "    estado = ?, "
                + "    ubicacion = ? "
                + "WHERE numero_cedula_med = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getNombre());
            ps.setDate(2, ma.getFecha());
            ps.setString(3, ma.getTelefono());
            ps.setString(4, ma.getCorreo());
            ps.setInt(5, ma.getEstado());
            ps.setString(6, ma.getDireccion());
            ps.setString(7, ma.getCedula());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
