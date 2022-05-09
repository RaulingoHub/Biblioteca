package configuracion;


import java.util.List;

public interface CRUD<T> {
    public boolean agregar(T t);
    public boolean editar(T t);
    public boolean eliminar(int id);
    public List<T> obtenerTodos();
    public T obtenerPorId(int id);
}
