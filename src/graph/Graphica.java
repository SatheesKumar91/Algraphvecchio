package graph;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Graphica<T extends Comparable<T>> {
	
	public Pane disegna(GraphXY<T> graph, Double Height, Double Width, Double raggio, Paint c1, Paint c2) {
		Double font = raggio*2;
		Pane console = new Pane();
		for (EdgeXY<T> edge : graph.EXY()) {
			Line lineToAdd = new Line(edge.getUX(), edge.getUY(), edge.getVX(), edge.getVY());
			console.getChildren().add(lineToAdd);
		}
		
		for (NodeXY<T> node : graph.VXY()) {
			Circle circleToAdd = new Circle(node.getX(), node.getY(), raggio);
			circleToAdd.setFill(c1);
			circleToAdd.setStroke(c2);
			circleToAdd.setStrokeWidth(1.);
			
			Text text = new Text(""+node.getElement());
			text.setX(node.getX()-raggio*2/3);
			text.setY(node.getY()+raggio*4/5);
			text.setFont(new Font(font));
			
		   	console.getChildren().addAll(circleToAdd, text);
		}
		return console;
	}

}
