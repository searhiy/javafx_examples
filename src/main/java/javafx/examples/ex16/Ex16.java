package javafx.examples.ex16;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class Ex16 extends Application {

    Stage window;
    Scene scene;
    Button button;
    TreeView<String> treeView;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title");
        button = new Button("Submit");

        TreeItem<String> root, bucky, megan;

        root = new TreeItem<>();
        root.setExpanded(true);

        // bucky
        bucky = makeBranch("Bucky", root);
        makeBranch("youtube", bucky);
        makeBranch("facebook", bucky);
        makeBranch("twitter", bucky);

        // megan
        megan = makeBranch("Megan", root);
        makeBranch("makeup", megan);
        makeBranch("glitter", megan);

        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty().addListener((v, oldV, newV) -> {
            if (newV != null)
                System.out.println(newV);
        });


        StackPane layout = new StackPane();
        layout.getChildren().add(treeView);
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>();
        item.setValue(title);
        item.setExpanded(true);

        parent.getChildren().add(item);
        return item;
    }

}
