package lezione9.Graph;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Set;

public class Graph<T extends Comparable<T>> implements IGraph<T> {
	private TreeMap<Node<T>, TreeSet<Node<T>>> vertici;
	
	public Graph() {
		this.vertici = new TreeMap<Node<T>, TreeSet<Node<T>>>();
	}

	@Override
	public void insertNode(Node<T> u) {
		if(!this.vertici.containsKey(u))
			this.vertici.put(u, new TreeSet<Node<T>>());
	}

	@Override
	public void deleteNode(Node<T> u) {
		for(Node<T> v: this.vertici.keySet())
			this.deleteEdge(v, u);
		this.vertici.remove(u);
		
	}

	@Override
	public void insertEdge(Node<T> u, Node<T> v) {
		if(this.vertici.containsKey(u) && this.vertici.containsKey(v))
			this.vertici.get(u).add(v);
	}

	@Override
	public void deleteEdge(Node<T> u, Node<T> v) {
		if(this.vertici.containsKey(u))
			this.vertici.get(u).remove(v);
	}

	@Override
	public Set<Node<T>> adj(Node<T> u) {
		//ritorna null se U non esiste
		if(this.vertici.containsKey(u))
			return this.vertici.get(u);
		else
			return null;
	}

	@Override
	public Set<Node<T>> V() {
		return this.vertici.keySet();
	}

	@Override
	public void print() {
		/*for (Node<T> v : this.vertici.keySet()) {
			System.out.println(v + ":" + this.vertici.get(v));
		}*/
		for(Entry<Node<T>, TreeSet<Node<T>>> e: this.vertici.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
