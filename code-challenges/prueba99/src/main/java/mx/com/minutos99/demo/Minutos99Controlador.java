package mx.com.minutos99.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.minutos99.arboles.ArbolService;
import mx.com.minutos99.dto.InputHeight;
import mx.com.minutos99.dto.InputNeighbors;
import mx.com.minutos99.dto.Neighbor;
import mx.com.minutos99.dto.OutBfs;
import mx.com.minutos99.dto.OutHeight;
import mx.com.minutos99.dto.OutNeighbor;


@RestController
@RequestMapping("/v1/b-trees")
public class Minutos99Controlador {

	@PostMapping("/height")
	public OutHeight height(@RequestBody InputHeight toTree) {
		ArbolService arbolService = new ArbolService();
		OutHeight height = new OutHeight();
		height.setHeight(arbolService.height(toTree.getToTree()));
		return height;
	}

	@PostMapping("/neighbors")
	public OutNeighbor neighbors(@RequestBody InputNeighbors toTree) {
		System.out.println(toTree);
		ArbolService arbolService = new ArbolService();
		Neighbor neighbor = arbolService.neighbors(toTree.getToTree(), toTree.getNode());
		System.out.println(neighbor.toString());
		OutNeighbor outNeighbor = new OutNeighbor();
		outNeighbor.setNeighbor(neighbor);
		return outNeighbor;
	}

	@PostMapping("/bfs")
	public OutBfs bfs(@RequestBody InputHeight toTree) {
		System.out.println(toTree);
		ArbolService arbolService = new ArbolService();
		OutBfs bfs = new OutBfs();
		bfs.setBfs(arbolService.bfs(toTree.getToTree()));
		return bfs;
	}

}
