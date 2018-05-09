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

	public void setAllXY(Double x1, Double y1, Double x2, Double y2) {
		this.u.setXsetY(x1, y1);
		this.v.setXsetY(x2, y2);
	}

	public void setUXY(Double x1, Double y1) {
		this.u.setXsetY(x1, y1);
	}

	public void setVXY(Double x2, Double y2) {
		this.v.setXsetY(x2, y2);
	}

	public Double getUX() {
		return this.u.getX();
	}

	public void setUX(Double x1) {
		this.u.setX(x1);
	}

	public Double getUY() {
		return this.u.getY();
	}

	public void setUY(Double y1) {
		this.u.setY(y1);
	}

	public Double getVX() {
		return this.v.getX();
	}

	public void setVX(Double x2) {
		this.v.setX(x2);
	}

	public Double getVY() {
		return this.v.getY();
	}

	public void setVY(Double y2) {
		this.v.setY(y2);
	}

	public NodeXY<T> getNodeU() {
		return this.u;
	}

	public NodeXY<T> getNodeV() {
		return this.v;
	}

}
