/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author RIBZ
 */
public class Auditoria {
    private String userName;
    private String fecha;
    private String tipoOperacion;
    private String nombreTabla;
    private String anterior;
    private String nuevo;

    // Constructor
    public Auditoria(String userName, String fecha, String tipoOperacion, String nombreTabla, String anterior, String nuevo) {
        this.userName = userName;
        this.fecha = fecha;
        this.tipoOperacion = tipoOperacion;
        this.nombreTabla = nombreTabla;
        this.anterior = anterior;
        this.nuevo = nuevo;
    }

    // Getters y Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getAnterior() {
        return anterior;
    }

    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }

    public String getNuevo() {
        return nuevo;
    }

    public void setNuevo(String nuevo) {
        this.nuevo = nuevo;
    }
}
