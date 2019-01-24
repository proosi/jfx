package jfx_prop1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class AppController {
    
    private Person person = new Person();
    
    @FXML
    TextField name;

    @FXML
    Label current_name;

    @FXML
    Button b_entry, b_exit;

    @FXML
    public void initialize() {

        name.textProperty().bindBidirectional(person.getName());
             
    }

    @FXML
    public void onActionEntry() {

        //person.setName(name.textProperty());  
        //System.out.println(person.getName()); 

        current_name.textProperty().bind(person.getName());

        //current_name.textProperty().unbind();
        //name.clear();
        //name.selectAll(); 

        System.out.println(person.getName());
        System.out.println(name.textProperty());
        System.out.println(current_name.textProperty());
    }

    @FXML
    public void onKeyPressed() {

        name.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER){

                onActionEntry();

            }});
        
    }

    @FXML
    public void onActionExit() {
    
        System.exit(0);
    
    }


}