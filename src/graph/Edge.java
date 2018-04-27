package graph;

public class Edge<T extends Comparable<T>> implements Comparable<Node<T>> {
	
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

	@Override
	public String toString(){
		String s = this.u + " <--" + this.peso + "--> " + this.v;		
		return s;
	}

	
	//da rivedere
	//edge<T> non funziona compareTo
	@Override
	public int compareTo(Edge<T> o) {
		return (this.compareTo(o));
	}
}
