package ec.gob.iess.prueba.servicio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.gob.iess.prueba.dao.ClienteDao;
import ec.gob.iess.prueba.model.Cliente;

@Stateless
public class ClienteServicio {

	@Inject
	private ClienteDao dao;

	public Cliente buscarPorCorreoElectronico(String email) throws Exception {
		return dao.buscarPorCorreoElectronico(email);
	}

	public List<Cliente> buscarClientesActivos() throws Exception {
		return dao.buscandoClientesActivos();
	}

	public Cliente guardar(Cliente cliente) throws Exception {
		return dao.guardar(cliente);
	}

	public void eliminar(Cliente cliente) throws Exception {
		dao.eliminar(cliente);
	}
}
