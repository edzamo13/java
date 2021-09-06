package ec.gob.iess.prueba.dao.impl;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ezamora
 */
public interface Crud<T> {

	void guardar(final T t) throws Exception;

	T guardarRetorno(final T t) throws Exception;

	@SuppressWarnings("rawtypes")
	List<T> listarPorConsultaNativa(final String consultaSql, final Class clase) throws Exception;

	List<Object> listarPorConsultaNativa(final String consultaSql, final Map<String, Object> parametros)
			throws Exception;

	public List<T> listarPorConsultaJpaNombrada(String consultaNombrada, Map<String, Object> parametros)
			throws Exception;
}