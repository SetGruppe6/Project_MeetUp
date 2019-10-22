package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartsideController {

    @FXML
    private Button arrangement;

    @FXML
    public void initialize(){
        arrangement.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                arrangement.setText("kaf");
            }
        });
    }
}
