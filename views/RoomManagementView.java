package views;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RoomManagementView extends Application {
    @Override
    public void start (Stage stage){
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(15);
        gp.setPadding(new Insets(20, 20, 20, 20)); // top, right, bottom, left
        gp.setAlignment(Pos.CENTER);

        Label dashboardLabel = new Label("Welcome to the Room Management Dashboard!");

        // Add components to grid
        gp.add(dashboardLabel, 0, 0, 2, 1);

        Scene scene = new Scene(gp, 350, 220);
        stage.setScene(scene);
        stage.setTitle("Room Management");
        stage.show();

    }

}