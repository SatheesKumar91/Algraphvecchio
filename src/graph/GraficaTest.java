package graph;

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
		
		Double Height = 500.;
		Double Width = 500.;
		Pane console = new Pane();
		console = g1.draw(50.);
		Scene scene = new Scene(console);
    	
    	primaryStage.setTitle("Welcome to FX!");
        primaryStage.setHeight(Height);
        primaryStage.setWidth(Width);
    	primaryStage.setScene(scene);
        primaryStage.show();
	}

}
