package graph;

import java.util.Set;
import java.util.TreeSet;

public class GraphXY<T extends Comparable<T>> extends Graph<T> {

	private TreeSet<NodeXY<T>> nodi;
	private TreeSet<EdgeXY<T>> archi;

	public GraphXY() {
		this.nodi = new TreeSet<NodeXY<T>>();
		this.archi = new TreeSet<EdgeXY<T>>();
	}

	public void insertNode(NodeXY<T> u) {
		if(!this.nodi.contains(u))
		this.nodi.add(u);
	}

	public void deleteNode(NodeXY<T> u) {
		for(EdgeXY<T> uv: this.archi)
			if(uv.connectEdgeNode(u))	//se nell'arco uv connette il nodo v a un altro nodo
				this.deleteEdge(uv);	//allora elimina l'arco uv
		this.nodi.remove(u);		
	}

	public void insertEdge(NodeXY<T> u, NodeXY<T> v, Integer peso) {
		if(this.nodi.contains(u) && this.nodi.contains(v)) {
			EdgeXY<T> uv = new EdgeXY<T>(u, v, peso);
			this.archi.add(uv);
		}
	}

	public Set<NodeXY<T>> VXY() {
		return this.nodi;
	}

	public Set<EdgeXY<T>> EXY() {
		return this.archi;
	}
}
