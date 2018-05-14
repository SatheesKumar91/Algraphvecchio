package graph;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GraficaTest extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
		GraphXY<String> g1 = new GraphXY<String>();
		
		NodeXY<String> a = new NodeXY<String>("A", 250., 100.);
		NodeXY<String> b = new NodeXY<String>("B", 100., 300.);
		NodeXY<String> c = new NodeXY<String>("C", 400., 300.);
		
		g1.insertNode(a);
		g1.insertNode(b);
		g1.insertNode(c);
		
		g1.insertEdge(a, b, 1);
		g1.insertEdge(a, c, 2);
		g1.insertEdge(b, c, 3);
		
		//Grafica<String> dg = new Grafica<String>();
		Pane console = new Pane();
		for (EdgeXY<String> edge : g1.EXY()) {
			Line lineToAdd = new Line(edge.getUX(), edge.getUY(), edge.getVX(), edge.getVY());
			console.getChildren().add(lineToAdd);
		}
		
		for (NodeXY<String> node : g1.VXY()) {
			Circle circleToAdd = new Circle(node.getX(), node.getY(), 50.);
			circleToAdd.setFill(Color.WHITE);
			circleToAdd.setStroke(Color.BLACK);
			circleToAdd.setStrokeWidth(1.);
	    	console.getChildren().add(circleToAdd);
		}
		//console = dg.draw(g1, 50., 1., Color.WHITE, Color.BLACK);
		Scene scene = new Scene(console);
    	
    	primaryStage.setTitle("Welcome to FX!");
        primaryStage.setHeight(500.);
        primaryStage.setWidth(500.);
    	primaryStage.setScene(scene);
        primaryStage.show();
		
		//g1.print();
	}

}
