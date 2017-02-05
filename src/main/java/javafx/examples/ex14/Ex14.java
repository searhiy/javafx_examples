package javafx.examples.ex14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex14 extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkbox example");
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Movie1", "Movie2", "Movie3"
        );

        comboBox.setPromptText("What is favorite movie?");
        comboBox.setEditable(true);
        button = new Button("Print movie");
        button.setOnAction(event -> printMovie());

        comboBox.setOnAction(event -> System.out.println("User selected: " + comboBox.getValue()));


        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void printMovie() {
        System.out.println(comboBox.getValue());

    }


}
