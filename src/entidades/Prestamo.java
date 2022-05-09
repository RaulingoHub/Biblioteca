/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author SEBASTIAN
 */
public class Prestamo {
    
    private int idPrestamo;
    private int idLibro;
    private String nombreLibro;
    private String nombrePrestador;
    private String fechaPrestamo;
    private String fechaPrestamoConcluido;

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombrePrestador() {
        return nombrePrestador;
    }

    public void setNombrePrestador(String nombrePrestador) {
        this.nombrePrestador = nombrePrestador;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaPrestamoConcluido() {
        return fechaPrestamoConcluido;
    }

    public void setFechaPrestamoConcluido(String fechaPrestamoConcluido) {
        this.fechaPrestamoConcluido = fechaPrestamoConcluido;
    }
    
    
}
