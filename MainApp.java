import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import views.RegisterView;
import views.adminLoginView;
import views.userLoginView;

public class MainApp extends Application {

    @Override
    public void start(Stage applicationStage) {
        GridPane gp = new GridPane();

        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(10);
        gp.setVgap(10);

        Label welcomeMessage = new Label("Welcome to the reservation system!");
        gp.add(welcomeMessage, 1, 1);

        Button userLoginBtn = new Button("User Login");
        userLoginBtn.setOnAction(e -> {
            Stage loginStage = new Stage();
            userLoginView userLogin = new userLoginView();
            userLogin.start(loginStage);
        });


        Button adminLoginBtn = new Button("Admin Login");
        adminLoginBtn.setOnAction(e -> {
            Stage loginStage = new Stage();
            adminLoginView adminLogin = new adminLoginView();
            adminLogin.start(loginStage);
        });

        Button registerBtn = new Button("Register");
        registerBtn.setOnAction(e -> {
            Stage loginStage = new Stage();
            RegisterView register = new RegisterView();
            register.start(loginStage);
        });


        gp.add(userLoginBtn, 1, 2);
        gp.add(adminLoginBtn, 1, 3);
        gp.add(registerBtn, 1, 4);


        Scene scene = new Scene(gp, 300, 300);
        applicationStage.setScene(scene);
        applicationStage.setTitle("Welcome Screen");
        applicationStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
