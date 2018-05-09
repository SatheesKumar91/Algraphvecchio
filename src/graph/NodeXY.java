package graph;

public class NodeXY<T extends Comparable<T>> extends Node<T> {

	private Double x;
	private Double y;

	public NodeXY(T e) {
		super(e);
	}

	public NodeXY(T e, Double x, Double y) {
		super(e);
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public void setXsetY(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return ( super.toString() + " (" + this.x + ", " + this.y + ")" );
	}

}
