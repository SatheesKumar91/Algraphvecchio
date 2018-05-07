package graph;

import java.util.Set;
import java.util.TreeSet;

public class Graph<T extends Comparable<T>> implements IGraph<T> {
	private TreeSet<Node<T>> nodi;
	private TreeSet<Edge<T>> archi;
	
	public Graph() {
		this.nodi = new TreeSet<Node<T>>();
		this.archi = new TreeSet<Edge<T>>();
	}

	@Override
	public void insertNode(Node<T> u) {
		if(!this.nodi.contains(u))
			this.nodi.add(u);
	}

	@Override
	public void deleteNode(Node<T> u) {
		for(Edge<T> uv: this.archi)
			if(uv.connectEdgeNode(u))	//se nell'arco uv connette il nodo v a un altro nodo
				this.deleteEdge(uv);	//allora elimina l'arco uv
		this.nodi.remove(u);		
	}

	@Override
	public void insertEdge(Node<T> u, Node<T> v, Integer peso) {
		if(this.nodi.contains(u) && this.nodi.contains(v)) {
			Edge<T> uv = new Edge<T>(u, v, peso);
			this.archi.add(uv);
		}
	}

	@Override
	public void deleteEdge(Edge<T> uv) {
		this.archi.remove(uv);
	}

	@Override
	public TreeSet<Node<T>> adj(Node<T> u) {
		//ritorna null se U non esiste
		TreeSet<Node<T>> adiacenti = new TreeSet<Node<T>>();
		if(this.nodi.contains(u))
			for(Edge<T> uv: this.archi)
				if(uv.connectEdgeNode(u)) 
					adiacenti.add(uv.otherNode(u));
		else
			adiacenti = null;
		return adiacenti;
	}

	@Override
	public Set<Node<T>> V() {
		return this.nodi;
	}

	@Override
	public void print() {
		System.out.print(" G = { ");
		for (Node<T> node : nodi) {
			System.out.print(node + ", ");
		}
		for (Edge<T> edge : archi) {
			System.out.print(edge + ", ");
		}
		System.out.println(" } ");
	}

}
