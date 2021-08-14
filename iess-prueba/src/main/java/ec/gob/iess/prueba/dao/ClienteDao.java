/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ec.gob.iess.prueba.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

import ec.gob.iess.prueba.dao.impl.DaoImpl;
import ec.gob.iess.prueba.model.Cliente;

@Stateful
public class ClienteDao extends DaoImpl<Cliente> {

	private List<Cliente> clientes;

	@PostConstruct
	public void init() {
		clientes = new ArrayList<>();
	}

	public Cliente buscarPorCorreoElectronico(String email) throws Exception {
		return buscandoClientesActivos().stream().filter(c -> c.getCorreoElectronico().compareTo(email) == 0).findAny()
				.orElse(new Cliente());
	}

	public List<Cliente> buscandoClientesActivos() throws Exception {
		clientes = getDao().listarPorConsultaJpaNombrada(Cliente.OBTENER_ClIENTES, null);
		return clientes.stream().filter(c -> c.getEstado().compareTo("A") == 0).collect(Collectors.toList());
	}

	public Cliente guardar(Cliente cliente) throws Exception {
		cliente.setEstado("A");
		clientes.add(cliente);
		return getDao().guardarRetorno(cliente);
	}

	public void eliminar(Cliente cliente) throws Exception {
		cliente.setEstado("I");
		getDao().guardar(cliente);
	}
}
