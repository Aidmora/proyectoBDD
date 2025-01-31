/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;

;

/**
 *
 * @author User
 */
public class DbPagoRealizado extends Conexion {
    //guardar

    public boolean guardar(PagoRealizado p) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO PagoRealizado (numero_pago,cantidad_cancelado, metodo_pago,fecha_cancelacion,"
                + "hora_cancelacion)"
                + "VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setDouble(2, p.getCantidad());
            ps.setString(3, p.getMetodo());
            ps.setDate(4, p.getFecha());
            ps.setTimestamp(5, p.getHora());
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

    public boolean modificar(PagoRealizado p) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE PagoRealizado "
                + "SET cantidad_cancelado = ?, "
                + "    metodo_pago = ?, "
                + "    fecha_cancelacion = ?, "
                + "    hora_cancelacion = ? "
                + "WHERE numero_pago = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, p.getCantidad());
            ps.setString(2, p.getMetodo());
            ps.setDate(3, p.getFecha());
            ps.setTimestamp(4, p.getHora());
            ps.setInt(5, p.getId());
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

    public boolean buscar(PagoRealizado p) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM PagoRealizado WHERE numero_pago = ?";
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
            }
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

    public boolean eliminar(PagoRealizado p) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM PagoRealizado WHERE numero_pago = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
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
