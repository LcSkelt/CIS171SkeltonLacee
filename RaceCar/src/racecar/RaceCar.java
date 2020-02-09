/*
Author: Lacee Skelton
Application: Race Car
Date: 02/08/2020
 */
package racecar;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class RaceCar extends Application {
	@Override // Override start method
	public void start(Stage primaryStage) {
		// Create a car
		CarPane pane = new CarPane();

		// Create and register handles
		pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());

		pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				pane.decreaseSpeed();
			}
		});

		// Create scene  place it in stage
		Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("Race Car "); // Title
		primaryStage.setScene(scene); //Scene in stage
		primaryStage.show(); // Display stage

		pane.requestFocus(); // Request focus
	}
}