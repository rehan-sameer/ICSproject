package views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class WelcomeScreen extends Application {

    @Override
    public void start(Stage applicationStage) {
        // 1. Create GridPane and configure it
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);

        // 2. Create Label and set text (use empty string for "nothing")
        Label welcomeMessage = new Label("");  // Empty string
        gp.add(welcomeMessage, 0, 0);  // Correct grid coordinates (column, row)

        // 3. Set up the scene
        Scene scene = new Scene(gp, 400, 300);  // Added window dimensions
        applicationStage.setScene(scene);
        applicationStage.setTitle("Welcome Screen");
        applicationStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

