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
public class Libro {
    
    private int idLibro;
    private String nombreLibro = "";
    private String categoriaLibro = "";
    private int cantidadLibro;

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

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public int getCantidadLibro() {
        return cantidadLibro;
    }

    public void setCantidadLibro(int cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }
    

    
    
}
