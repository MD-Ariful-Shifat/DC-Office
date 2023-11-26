/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.DC;
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
    private DC user;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public DC getUser() {
        return user;
    }

    public void setUser(DC user) {
        this.user = user;
    }


    @FXML
    private void signoutOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("SignIn Page.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        System.out.println(this.user.toString());

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();


    }

    @FXML
    private void localOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC updates notes.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void bangladeshOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC View law.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void gdOnClick(ActionEvent event) throws IOException {
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
    private void educationOnClick(ActionEvent event) throws IOException {
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
    private void socialOnClick(ActionEvent event) throws IOException {
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
    private void appointmentOnClick(ActionEvent event) throws IOException {
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

    @FXML
    private void addOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Add User.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        ADCAddUserController p = someLoader.getController();
        p.setUser( this.user);

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }
    
}
