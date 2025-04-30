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

public class AdminDashboardView extends Application {
    @Override
    public void start (Stage stage){
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(15);
        gp.setPadding(new Insets(20, 20, 20, 20)); // top, right, bottom, left
        gp.setAlignment(Pos.CENTER);

        Label dashboardLabel = new Label("Welcome to the Admin Dashboard!");

        Button manageRoomsBtn = new Button("Manage Rooms");
        Button viewRequestsBtn = new Button("View Reservation Requests");
        Button logoutBtn = new Button("Logout");

        gp.add(dashboardLabel, 0, 0, 2, 1); // spans 2 columns
        gp.add(manageRoomsBtn, 0, 1);
        gp.add(viewRequestsBtn, 0, 2);
        gp.add(logoutBtn, 0, 3);

        Scene scene = new Scene(gp, 350, 220);
        stage.setScene(scene);
        stage.setTitle("ADMIN DASHBOARD");
        stage.show();

    }

}
