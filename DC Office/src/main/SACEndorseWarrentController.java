/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author USER
 */
<<<<<<< HEAD:DC Office/src/main/FXMLDocumentController.java
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
=======
public class SACEndorseWarrentController implements Initializable {

    /**
     * Initializes the controller class.
     */
>>>>>>> fbd4bf661c29c23adf463a344614ec9a274de860:DC Office/src/main/SACEndorseWarrentController.java
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOnClick(ActionEvent event) {
    }
    
}
