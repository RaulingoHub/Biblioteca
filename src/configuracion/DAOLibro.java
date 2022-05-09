/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;
import entidades.Libro;
import java.util.List;
/**
 *
 * @author SEBASTIAN
 */
public interface DAOLibro extends  CRUD<Libro>{
    public List<Libro> 
        obtenerPorNombre(String nombre);
}
