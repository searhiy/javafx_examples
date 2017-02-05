package javafx.examples.ex10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex10 extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello Title");

        TextField nameInput = new TextField();


        button = new Button("Click Me");
        button.setOnAction(event -> {
            System.out.println(nameInput.getText());
            isInt(nameInput, nameInput.getText());
        });

        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField nameInput, String text) {
        try{
            int age = Integer.parseInt(text);
            System.out.println("User is: " + age);
            return true;
        } catch (NumberFormatException e){
            System.out.println("Error: " + text + "is not a number");
            return false;
        }
    }
}
