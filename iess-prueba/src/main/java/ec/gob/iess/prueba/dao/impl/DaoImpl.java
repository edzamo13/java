package ec.gob.iess.prueba.dao.impl;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;

import lombok.Getter;

/**
 *
 * @author ezamora
 */
@PersistenceContexts({ @PersistenceContext(name = DaoImpl.IESSPRIEBA_PU, unitName = DaoImpl.IESSPRIEBA_PU) })
public class DaoImpl<T> {

	public static final String IESSPRIEBA_PU = "iessPruebaPu";

	@Resource
	@Getter
	private EJBContext ejbContext;

	private final CrudImpl<T> dao;

	public DaoImpl() {
		dao = new CrudImpl<>();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DaoImpl(Class<T> entidad) {
		dao = new CrudImpl();
		dao.setEntity(entidad);
	}

	public CrudImpl<T> getDao() {

		EntityManager em = (EntityManager) ejbContext.lookup(IESSPRIEBA_PU);
		dao.setEntityManager(em);
		return dao;
	}

	public CrudImpl<T> getDao(String unidadPersistencia) {
		EntityManager em = (EntityManager) ejbContext.lookup(unidadPersistencia);
		dao.setEntityManager(em);
		return dao;
	}

}
