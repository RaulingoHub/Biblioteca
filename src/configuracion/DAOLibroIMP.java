/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;
import entidades.Libro;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBASTIAN
 */
public class DAOLibroIMP implements DAOLibro{
    DBHelper db = new DBHelper();
    String TABLA = "libro";

   
    @Override
    public boolean agregar(Libro libro) {
        boolean resultado = false;
        try {
            if (db.connect()) {
                String query = "INSERT INTO `biblioteca`.`libro` (`nombre`, `categoria`, `cantidad`) "
                        + " VALUES ('" + libro.getNombreLibro() + "', "
                        + " '" + libro.getCategoriaLibro() + "', "
                        + " '" + libro.getCantidadLibro()+ "', ";
                resultado = (boolean) db.execute(query, true);
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return resultado;

    }

    @Override
    public boolean editar(Libro libro) {
        boolean resultado = false;
        try {
            if (db.connect()) {
                String query = "UPDATE `biblioteca`.`libro` SET  "
                        + "`nombre` = '" + libro.getNombreLibro() + "',  "
                        + "`categoria` = '" + libro.getCategoriaLibro() + "',  "
                        + "`cantidad` = '" + libro.getCantidadLibro() + "', "
                        + " WHERE (`id` = '" + libro.getIdLibro() + "') ";
                resultado = (boolean) db.execute(query, true);
            }

        } catch (Exception e){
            System.out.println(e);
          
        } finally {
            db.disconnect();
        }
        return resultado;
    }

    @Override
    public List<Libro> obtenerPorNombre(String nombre) {
        List<Libro> libros = new ArrayList();

        try {
            if (db.connect()) {
                String query = "SELECT * FROM " + TABLA + " WHERE nombre LIKE '%" + nombre + "%'";
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Libro l = new Libro();
                    l.setIdLibro(rs.getInt("idlibro"));
                    l.setNombreLibro(rs.getString("nombre"));
                    l.setCategoriaLibro(rs.getString("categoria"));
                    l.setCantidadLibro(rs.getInt("cantidad"));

                    libros.add(l);
                }
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }

        return libros;
        
    }

    @Override
    public boolean eliminar(int id) {
         boolean resultado = false;

        try {
            if (db.connect()) {
                String query = "DELETE FROM `biblioteca`.`libro` WHERE (`id` = '" + id + "');";
                resultado = (boolean) db.execute(query, true);
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return resultado;
    }

    @Override
    public List<Libro> obtenerTodos() {
        List<Libro> libros = new ArrayList();

        try {
            if (db.connect()) {
                String query = "SELECT * FROM " + TABLA;
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Libro l = new Libro();
                    l.setIdLibro(rs.getInt("idlibro"));
                    l.setNombreLibro(rs.getString("nombre"));
                    l.setCategoriaLibro(rs.getString("categoria"));
                    l.setCantidadLibro(rs.getInt("cantidad"));
                  
                    libros.add(l);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            db.disconnect();
        }

        return libros;
    }

    @Override
    public Libro obtenerPorId(int id) {
        Libro l = new Libro();
        try {
            if (db.connect()) {
                String query = "SELECT * FROM " + TABLA + " WHERE id = " + id;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                   l.setIdLibro(rs.getInt("idlibro"));
                   l.setNombreLibro(rs.getString("nombre"));
                   l.setCategoriaLibro(rs.getString("categoria"));
                   l.setCantidadLibro(rs.getInt("cantidad"));
                }
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return l;
        
    }
}
