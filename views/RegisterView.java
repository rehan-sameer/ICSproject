package views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import utils.userManager;

public class RegisterView extends Application {

    @Override
    public void start(Stage stage) {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(15);
        gp.setAlignment(Pos.CENTER);

        // Labels and Fields
        Label titleLabel = new Label("Hi! Welcome new user!\n Enter your credentials below");
        Label nameLabel = new Label("Full Name:");
        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");

        TextField nameTF = new TextField();
        TextField usernameTF = new TextField();
        TextField passwordTF = new TextField();

        Button registerBtn = new Button("Register");

        // Add to GridPane
        gp.add(titleLabel, 0, 0, 2, 1); // span 2 columns
        gp.add(nameLabel, 0, 1);
        gp.add(nameTF, 1, 1);
        gp.add(usernameLabel, 0, 2);
        gp.add(usernameTF, 1, 2);
        gp.add(passwordLabel, 0, 3);
        gp.add(passwordTF, 1, 3);
        gp.add(registerBtn, 0, 4, 2, 1); // center button across 2 columns

        registerBtn.setOnAction(e -> {
            String fullName = nameTF.getText();
            String username = usernameTF.getText();
            String password = passwordTF.getText();

            // Call UserManager to register the user
            userManager userManager = new userManager(); // ideally passed/shared, not recreated
            userManager.registerUser(fullName, username, password);

            Label registrationComplete = new Label("Registration Complete!");
            gp.add(registrationComplete, 5, 5);


        });

        // Set up scene and stage
        Scene scene = new Scene(gp, 400, 300);
        stage.setScene(scene);
        stage.setTitle("User Registration");
        stage.show();
    }
}
