/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.AA;
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
 public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       * Initializes the controller class.
     */
    private AA user;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public AA getUser() {
        return user;
    }

    public void setUser(AA user) {
        this.user = user;
    } 

    @FXML
    private void sendnoticeOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AA_send notice.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("send notice");
                window.setScene(scene);
                window.show();   

    }

    @FXML
    private void officeOnClick(ActionEvent event) throws IOException {
              
        Parent root = FXMLLoader.load(getClass().getResource("AA_new supplies.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("new supplies");
                window.setScene(scene);
                window.show();
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn Page.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Sign In Page");
                window.setScene(scene);
                window.show();  
    }

    @FXML
    private void viaOnClick(ActionEvent event) throws IOException { 
        
               Parent root = FXMLLoader.load(getClass().getResource("AA_viaamail.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("viaa mail");
                window.setScene(scene);
                window.show();  
    }

    @FXML
    private void userOnClick(ActionEvent event) throws IOException {     
              
        Parent root = FXMLLoader.load(getClass().getResource("AA_Generate new user.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Generate new user");
                window.setScene(scene);
                window.show(); 
    }

    @FXML
    private void updateOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AA_updatingcalendar.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("updatingcalender");
                window.setScene(scene);
                window.show(); 
    }

    @FXML
    private void travelOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("AA_ travelarrangements.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("travelarrangements");
                window.setScene(scene);
                window.show(); 
    }

    @FXML
    private void reportOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("AA_Report Submitted Received.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Report Submitted Received");
                window.setScene(scene);
                window.show(); 
    }

    @FXML
    private void promptOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AA_ Promptcitizen.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Pomptcitizen");
                window.setScene(scene);
                window.show();
    }
    
}
