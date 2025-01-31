/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author RIBZ
 */
public class CitaMedicaNorte {
    private int codigoCita; 
    private String comentario;
    private Date fechaCita;
    private Timestamp horaCita;
    private String sucursal;

    public int getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(int codigoCita) {
        this.codigoCita = codigoCita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Timestamp getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Timestamp horaCita) {
        this.horaCita = horaCita;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
}
