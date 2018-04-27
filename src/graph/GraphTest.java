package graph;
public class GraphTest {

	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("A");
		Node<String> n2 = new Node<String>("B");
		Edge<String> ab = new Edge<String>(n1, n2, 2);
		System.out.println(ab);
		
		Graph<String> g1 = new Graph<String>();
//		GraphNotOriented<String> g1 = new GraphNotOriented<String>();
		
		Node<String> a = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		Node<String> c = new Node<String>("C");
		Node<String> d = new Node<String>("D");
		Node<String> e = new Node<String>("E");
		Node<String> f = new Node<String>("F");
		Node<String> g = new Node<String>("G");
		
		g1.insertNode(a);
		g1.insertNode(b);
		g1.insertNode(c);
		g1.insertNode(d);
		g1.insertNode(e);
		g1.insertNode(f);
		g1.insertNode(g);
		
		g1.insertEdge(a, b);
		g1.insertEdge(a, c);
		g1.insertEdge(b, e);
		g1.insertEdge(b, g);
		g1.insertEdge(d, g);
		g1.insertEdge(e, d);
		g1.insertEdge(g, c);
		g1.insertEdge(c, f);
		
		//arco che rompe il vincolo 2-colorabile
		g1.insertEdge(b, c);
		g1.print();
	}

}

