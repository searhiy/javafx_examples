package javafx.examples.ex15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex15 extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll("M1", "M2", "M3");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);



        button.setOnAction(event -> buttonClick());


        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClick() {
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();
        movies.forEach(System.out::println);
    }

}
