package mx.com.minutos99.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import mx.com.minutos99.arboles.ArbolService;
import mx.com.minutos99.dto.Neighbor;

class Minuto99Test {

	ArbolService arbolService = new ArbolService();

	@Test
	void height() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(5);
		integers.add(9);
		String cad = arbolService.height(integers);
		assertTrue(!cad.isEmpty());

	}

	@Test
	void bfs() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(5);
		integers.add(9);
		String cad = arbolService.bfs(integers);
		assertFalse(cad.isEmpty());

	}

	@Test
	void neighbors() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(5);
		integers.add(9);
		Neighbor neighbor = arbolService.neighbors(integers, 2);
		assertFalse(neighbor == null);

	}

}
