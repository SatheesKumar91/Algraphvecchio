package graph;

public class GraphNotOriented<T extends Comparable<T>> extends Graph<T> {

	public GraphNotOriented() {
		super();
	}
	@Override
	public void insertEdge(Node<T> u, Node<T> v) {
		super.insertEdge(u, v);
		super.insertEdge(v, u);
	}
	@Override
	public void deleteEdge(Node<T> u, Node<T> v) {
		super.deleteEdge(u, v);
		super.deleteEdge(v, u);
	}
}
