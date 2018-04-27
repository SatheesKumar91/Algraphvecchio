package graph;

import java.util.TreeSet;

public class Graph<T extends Comparable<T>> implements IGraph<T> {
	private TreeSet<Node<T>> vertici;
	private TreeSet<Edge<T>> archi;
	
	public Graph() {
		this.vertici = new TreeSet<Node<T>>();
		this.archi = new TreeSet<Edge<T>>();
	}

	@Override
	public void insertNode(Node<T> u) {
		if(!this.vertici.contains(u))
			this.vertici.add(u);
	}

	@Override
	public void deleteNode(Node<T> u) {
		for(Edge<T> uv: this.archi)
			this.deleteEdge(uv);
		this.vertici.remove(u);
//		for(Node<T> v: this.vertici.keySet())
//			this.deleteEdge(v, u);
//		this.vertici.remove(u);
		
	}

	@Override
	public void insertEdge(Node<T> u, Node<T> v) {
//		if(this.vertici.containsKey(u) && this.vertici.containsKey(v))
//			this.vertici.get(u).add(v);
	}

	@Override
	public void deleteEdge(Node<T> u, Node<T> v) {
//		if(this.vertici.containsKey(u))
//			this.vertici.get(u).remove(v);
	}

	@Override
	public Set<Node<T>> adj(Node<T> u) {
		//ritorna null se U non esiste
//		if(this.vertici.containsKey(u))
//			return this.vertici.get(u);
//		else
//			return null;
	}

	@Override
	public Set<Node<T>> V() {
//		return this.vertici.keySet();
	}

	@Override
	public void print() {
		/*for (Node<T> v : this.vertici.keySet()) {
			System.out.println(v + ":" + this.vertici.get(v));
		}*/
//		for(Entry<Node<T>, TreeSet<Node<T>>> e: this.vertici.entrySet()) {
//			System.out.println(e.getKey() + ":" + e.getValue());
//		}
	}

}
