package ec.gob.iess.prueba.controller;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import ec.gob.iess.prueba.model.Cliente;
import ec.gob.iess.prueba.servicio.ClienteServicio;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class ClienteController implements Serializable {

	private static final long serialVersionUID = 7342222473825501609L;

	@Inject
	private ClienteServicio clienteServicio;

	@Getter
	@Setter
	private Cliente cliente;
	@Getter
	@Setter
	private Cliente clienteEliminado;

	@Getter
	@Setter
	private List<Cliente> clientes;

	Logger log = Logger.getLogger("Log Console:");

	@PostConstruct
	public void init() throws Exception {
		clientes = clienteServicio.buscarClientesActivos();
		nuevoRegistro();

	}

	public void nuevoRegistro() {
		cliente = new Cliente();
	}

	public void guardarCliente() {
		try {
			cliente = clienteServicio.guardar(cliente);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente:", cliente.getNombre());
			PrimeFaces.current().dialog().showMessageDynamic(message);
			log.info(cliente.toString());
			clientes = clienteServicio.buscarClientesActivos();
			nuevoRegistro();
			log.info("Guardado!");
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cliente:", "No se pudo Guardar!");
			PrimeFaces.current().dialog().showMessageDynamic(message);
			log.info("No se pudo registrar:" + e);
		}
	}

	public void obtenerCliente(Cliente cliente) {
		System.out.println(cliente.toString());
		this.cliente = cliente;

	}

	public void eliminarCliente(Cliente cliente) {
		this.clienteEliminado = cliente;
		System.out.println(cliente.toString());
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dlgEliminar').show();");

	}

	public void eliminarConfirmacion() throws Exception {
		clienteServicio.eliminar(clienteEliminado);
		cliente = new Cliente();
		clientes = clienteServicio.buscarClientesActivos();

	}

	public void eliminarConfirmacionCancelar() throws Exception {
		cliente = new Cliente();
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dlgEliminar').hide();");

	}

	

}
