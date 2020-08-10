package interfaces;

import java.util.List;

public interface CRUD <T> {
	void registrar(T t);
	void actualizar(T t);
	void eliminar(T t);
	List<T> listar() throws Exception;
}
