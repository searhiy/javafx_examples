package javafx.examples.ex29;

import javafx.application.Application;
import javafx.examples.ex28.Person;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex29 extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello Title");


        Person bucky = new Person();
        bucky.firstNameProperty().addListener((v, oldValue, newValue)->{
            System.out.println("Name changed to: " + newValue);
            System.out.println("firstNameProperty(): " + bucky.firstNameProperty());
            System.out.println("getFirstName(): " + bucky.getFirstName());
        });

        button = new Button("Submit");
        button.setOnAction(event -> bucky.setFirstName("Porky"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        scene.getStylesheets().add("Viper_ex27.css");
        window.setScene(scene);
        window.show();
    }
}
