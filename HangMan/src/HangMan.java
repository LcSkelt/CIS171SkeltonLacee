/*
Author: Lacee Skelton
Application: HangMan
Date: 02/08/2020
*/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Arc;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;

public class HangMan extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		// Create 3 lines and set their properties
		Polyline line1 = new Polyline();
		pane.getChildren().add(line1);
		line1.setStroke(Color.BLACK);
		ObservableList<Double> list = line1.getPoints();
		double x1 = 40.0;
		double y1 = 190.0;
		double y2 = 20.0;
		double x3 = 125.0;
		list.addAll(x1, y1, x1, y2, x3, y2, x3, y1 * .60);

		Polyline line2 = new Polyline();
		pane.getChildren().add(line2);
		line2.setStroke(Color.BLACK);
		ObservableList<Double> list2 = line2.getPoints();
		list2.addAll((x1 + x3) * .5, y1 * .5, x3, y1 * .25,
			x3 + (x3 - x1) * .5, y1 * .5);

		Polyline line3 = new Polyline();
		pane.getChildren().add(line3);
		line3.setStroke(Color.BLACK);
		ObservableList<Double> list3 = line3.getPoints();
		list3.addAll((x1 + x3) * .6, y1 * .80, x3, y1 * .60,
			x3 + (x3 - x1) * .3, y1 * .80);

		// Create a head and set properties
		Circle head = new Circle (x3, y1 * .25, 15);
		head.setFill(Color.WHITE);
		head.setStroke(Color.BLACK);
		pane.getChildren().add(head);

		// Create a stand and set its properties
		Arc arc = new Arc(x1, y1 + 1, 25, 15, 0, 180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);
		pane.getChildren().add(arc);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("HangMan"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
