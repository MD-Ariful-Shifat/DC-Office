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
public class AARespondToAppointmentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void seOnClick(ActionEvent event) {
    }

    @FXML
    private void cancelOnClick(ActionEvent event) {
    }


    @FXML
    private void tOnClick(ActionEvent event) {
    }

    @FXML
    private void dOnClick(ActionEvent event) {
    }

    @FXML
    private void cdtOnClick(ActionEvent event) {
    }

    @FXML
    private void noOnClick(ActionEvent event) {
    }

    @FXML
    private void backbutton(ActionEvent event) throws IOException {
                
        Parent root = FXMLLoader.load(getClass().getResource("DistrictAdministratordashboard.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Administrator dash board");
                window.setScene(scene);
                window.show();
    }
    
}
