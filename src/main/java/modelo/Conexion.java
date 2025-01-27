/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RIBZ
 */
public class Conexion {
    private final String url="jdbc:oracle:thin:@localhost:1521:orcl";
    private final String nombreUsuario="nleiva";
    private final String contrasenia="nleiva";
    private Connection con=null;
    public Connection getConexion(){
        try {
            con=DriverManager.getConnection(this.url, this.nombreUsuario,this.contrasenia);
            System.out.println("La conexion ha sido exitosa");
        } catch (SQLException e) {
            System.err.println(e);
        }
        return con;
    }
    
    
}
