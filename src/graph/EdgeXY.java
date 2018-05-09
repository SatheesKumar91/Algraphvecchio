package graph;

public class EdgeXY<T extends Comparable<T>> extends Edge<T> {

	private NodeXY<T> u;
	private NodeXY<T> v;

	public EdgeXY(NodeXY<T> u, NodeXY<T> v, Integer peso) {
		super(u, v, peso);
		this.u = u;
		this.v = v;
	}

	public EdgeXY(NodeXY<T> u, NodeXY<T> v, Integer peso, Double x1, Double y1, Double x2, Double y2) {
		super(u, v, peso);
		this.u = u;
		this.v = v;
		this.u.setXsetY(x1, y1);
		this.v.setXsetY(x2, y2);
	}
}
