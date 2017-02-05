package javafx.examples.ex26;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex26 extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello Title");


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Username");
        nameLabel.setStyle("-fx-text-fill: #e8e8e8");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField("Ivan");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button(" Log In");
        GridPane.setConstraints(loginButton, 1, 2);

//        loginButton.setOnAction(event -> {
//            setUserAgentStylesheet(STYLESHEET_CASPIAN);
//        });

        gridPane.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene layout = new Scene(gridPane, 300, 200);
//        layout.getStylesheets().add("main/java/javafx/examples/ex25/Viper_ex26.css");
        layout.getStylesheets().add("Viper_ex26.css");
        window.setScene(layout);

        window.show();
    }
}
