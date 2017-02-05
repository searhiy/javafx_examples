package javafx.examples.ex30;

import javafx.application.Application;
import javafx.examples.ex28.Person;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex30 extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello Title");

        TextField userInput = new TextField();
        userInput.setMinWidth(200);
        Label firstLabel = new Label("Welcome to the site ");
        Label secondLabel = new Label("");

        HBox buttonText = new HBox(firstLabel, secondLabel);
        buttonText.setAlignment(Pos.CENTER);


        VBox box = new VBox(10, userInput, buttonText);
        box.setAlignment(Pos.CENTER);

        secondLabel.textProperty().bind(userInput.textProperty());

        Scene scene = new Scene(box, 300, 200);
        scene.getStylesheets().add("Viper_ex27.css");
        window.setScene(scene);
        window.show();
    }
}
