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
 * @author USER
 */
public class ADCDashboardController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void signoutOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("SignIn Page.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();


    }

    @FXML
    private void localOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Updates Notes.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void bangladeshOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC View Law.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void gdOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Criminal Record.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void taxOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Tax report.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void educationOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Educational Institute.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void socialOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Organizing.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void appointmentOnClick(ActionEvent event) {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Appointments and meetings.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }
    
}
