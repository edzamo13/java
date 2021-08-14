package ec.gob.iess.prueba.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.ToString;

/**
 * The persistent class for the "Cliente" database table.
 * 
 */
@Entity
@Table(name = "\"Cliente\"")
@NamedQueries({ @NamedQuery(name = Cliente.OBTENER_ClIENTES, query = "SELECT c FROM Cliente c"),
		@NamedQuery(name = Cliente.OBTENER_POR_CORREO, query = "SELECT c FROM Cliente c where c.correoElectronico = :correoElectronico") })

@ToString
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String OBTENER_ClIENTES = "Cliente.OBTENER_ClIENTES";
	public static final String OBTENER_POR_CORREO = "Cliente.OBTENER_POR_CORREO";

	@Id
	@SequenceGenerator(name = "cliente_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
	@Column(name = "\"idCliente\"")
	private Integer idCliente;

	@Column(name = "\"correoElectronico\"")
	private String correoElectronico;

	private String estado;

	private String nombre;

	@Column(name = "\"numeroTelefonico\"")
	private String numeroTelefonico;

	public Cliente() {
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefonico() {
		return this.numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

}