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
public class DbPacienteVM extends Conexion{
    //buscar
    public boolean buscar (PacienteVM p){
        PreparedStatement ps; 
        ResultSet rs;
        Connection con= getConexion();
        String sql= "SELECT * FROM VWPaciente@dbl132 WHERE numero_cedula LIKE ?";
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
