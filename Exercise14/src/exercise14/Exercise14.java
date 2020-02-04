
package exercise14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;

/**
 *
 * @author:Lacee Skelton
 * Date:02/03/2020
 * Application:exercise14
 */
public class Exercise14 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
		// Create a GridPane and set properties
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setHgap(5);
		pane.setVgap(5);

		 
		// randomly generated string of 0 or 1
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				TextField text = new TextField();
				text.setPrefColumnCount(1);
				text.setText(String.valueOf((int)(Math.random() * 2)));
				pane.add(text, i, j);
				pane.setHalignment(text, HPos.CENTER);
				pane.setValignment(text, VPos.CENTER);
			}
		}

		// Create a scene and plane it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Random Numbers: "); // Set title
		primaryStage.setScene(scene); // Place scene in stage
		primaryStage.show(); // Display stage
	}
}