package javafx.examples.ex4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex4 extends Application {

    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to new scene 1");
        Button btn1 = new Button("Go to scene2");
        btn1.setOnAction(event -> window.setScene(scene2));

        // Layout 1 - children
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, btn1);
        scene1 = new Scene(layout1, 200, 200);

        // Button 2
        Button btn2 = new Button("Go to back to scene1");
        btn2.setOnAction(event -> window.setScene(scene1));
//        Label label2 = new Label("Welcome to new scene 2");

        // Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title");
        window.show();

    }

}
