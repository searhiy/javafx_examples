package javafx.examples.ex32;

import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleSmth(){
        System.out.println("print it");
        button.setText("Stop touching me!");
    }
}
