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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SACDischargePersonController implements Initializable {

    @FXML
    private TextArea outputTextArea;
    @FXML
    private TextField nameTextArea;
    @FXML
    private TextField crimeTextArea;
    @FXML
    private DatePicker datePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteOnClick(ActionEvent event) {
    }

    @FXML
    private void backOnClick(ActionEvent event) {
    }
    
}
