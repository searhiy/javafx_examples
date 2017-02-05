package javafx.examples.ex21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex21 extends Application {

    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello Title");

        Menu fileMenu = new Menu("File");
        fileMenu.getItems().addAll(new MenuItem("New Project..."));
        fileMenu.getItems().addAll(new MenuItem("New Module..."));
        fileMenu.getItems().addAll(new MenuItem("Import Project..."));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
