package Interfaces;

import java.util.List;

public interface CRUD<T> {

    List<T> listarTodos();

    T leerPorId(String id);

    void crear(T t);

    void actualizar(T t);

    void eliminar(String id);
}
