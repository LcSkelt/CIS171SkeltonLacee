
package exercise14_2_tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * Author: Lacee Skelton
 * Application: 14.2 Tic-Tac-Toe
 */
public class Exercise14_2_TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
		// Create pane
		GridPane pane = new GridPane();

		// Add nodes to pane
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int n = (int)(Math.random() * 3);
				if (n == 0)
					pane.add(new ImageView(new Image("image/x.gif")), j, i);
				else if (n == 1)
					pane.add(new ImageView(new Image("image/o.gif")), j, i);
				else
					continue;
			}
		}

		// Create scene
		Scene scene = new Scene(pane, 120, 130);
		primaryStage.setTitle("Tic-Tac-Toe:  "); // Set title
		primaryStage.setScene(scene); // Place scene
		primaryStage.show(); // Display stage
	}
}