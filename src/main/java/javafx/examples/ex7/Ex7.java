package javafx.examples.ex7;

import javafx.application.Application;
import javafx.examples.ex6.ConformBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex7 extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello Title");

        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });


        button = new Button();
        button.setText("Close Button");
        button.setOnAction(event -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        System.out.println("File was saved");

        Boolean answer = ConformBox.display("Title", "Sure you want to exit?");
        if (answer){
            window.close();
        }
    }
}
