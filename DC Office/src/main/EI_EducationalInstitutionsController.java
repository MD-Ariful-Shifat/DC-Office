/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class EI_EducationalInstitutionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void scOnClick(ActionEvent event) {
    }

    @FXML
    private void eiOnClick(ActionEvent event) {
    }

    @FXML
    private void mOnClick(ActionEvent event) {
    }

    @FXML
    private void collOnClick(ActionEvent event) {
    }

    @FXML
    private void backbutton(ActionEvent event) throws IOException {
                
        Parent root = FXMLLoader.load(getClass().getResource("ADCEICTdashboard.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("ADCEICT dash board");
                window.setScene(scene);
                window.show();
    }
    
}
