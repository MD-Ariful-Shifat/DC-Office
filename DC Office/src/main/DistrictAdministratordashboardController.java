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
public class DistrictAdministratordashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendnoticeOnClick(ActionEvent event) throws IOException {
        /*Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("AA_send notice.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        System.out.println(this.user.toString());

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show(); 
        */

    }

    @FXML
    private void officeOnClick(ActionEvent event) {
    }

    @FXML
    private void backOnClick(ActionEvent event) {
    }

    @FXML
    private void viaOnClick(ActionEvent event) {
    }

    @FXML
    private void userOnClick(ActionEvent event) {
    }

    @FXML
    private void updateOnClick(ActionEvent event) {
    }

    @FXML
    private void travelOnClick(ActionEvent event) {
    }

    @FXML
    private void reportOnClick(ActionEvent event) {
    }

    @FXML
    private void promptOnClick(ActionEvent event) {
    }
    
}
