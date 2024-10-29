package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;

    //    public void initialize() {
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("You clicked me!");
//            }
//        });
//    }
    public void initialize() {
        clickMeButton.setOnAction(event -> System.out.println("You clicked me"));
    }

}
