package graph;

public class Edge<T extends Comparable<T>> implements Comparable<Edge<T>> {

	private Integer peso;
	private Node<T> u;
	private Node<T> v;

	public Edge(Node<T> u, Node<T> v, Integer peso) {
		this.peso = peso;
		this.u = u;
		this.v = v;
	}

	public Integer getWeight() {
		return peso;
	}

	public void setWeight(Integer peso) {
		this.peso = peso;
	}

	public Node<T> getNodeU() {
		return u;
	}

	public void setNodeU(Node<T> u) {
		this.u = u;
	}

	public Node<T> getNodeV() {
		return v;
	}

	public void setNodeV(Node<T> v) {
		this.v = v;
	}

	public Boolean connectEdgeNode(Node<T> u) {
		//restituisce true se questo arco collega il nodo u a un altro nodo
		return (this.v.equals(u) || this.u.equals(u));
	}

	public Node<T> otherNode(Node<T> u) {
		//restitusce l'altro nodo nell'arco uv
		if(this.v.equals(u))
			return this.u;
		else if(this.u.equals(u))
			return this.v;
		else
			return null;
	}
	
	@Override
	public String toString(){
		return ( "[" + this.u + " <-" + this.peso + "-> " + this.v + "]" );
	}
	
	@Override
	public int compareTo(Edge<T> o) {
		if(this.peso.equals(o.peso)) {
			if(this.u.equals(o.u)) {
				if(this.v.equals(o.v)) {	//o = uv
					 return 0;
				} else
					return this.v.compareTo(o.v);
			} else if(this.u.equals(o.v)) {
				if(this.v.equals(o.u)) {	//o = vu
					 return 0;
				} else
					return this.v.compareTo(o.u);
			} else 
				return this.u.compareTo(o.u);
		} else
			return this.peso.compareTo(o.peso);
	}
}
