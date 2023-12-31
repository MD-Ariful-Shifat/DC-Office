/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.DM;
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
public class DMdashboardController implements Initializable {

    private DM user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 public DM getUser() {
        return user;
    }

    public void setUser(DM user) {
        this.user = user;
    }


    private void backOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("SignIn Page.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Sign In Page");
                window.setScene(scene);
                window.show();
        

    }
    @FXML
    private void publicOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("DMpublicservice.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DMpublicservice");
                window.setScene(scene);
                window.show();
        

    
    }

    @FXML
    private void budgetOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DMBudgetandfin.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DMBudgetandfin");
                window.setScene(scene);
                window.show();
        
    

    
    }

    @FXML
    private void dataOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DMdataandreport.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DMdataandreport");
                window.setScene(scene);
                window.show();
        

    
    }

   
    
    

    
        

    
    


    


    


    @FXML
    private void backOnClcik(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn Page.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Sign In Page");
                window.setScene(scene);
                window.show();
        
        
    }

    @FXML
    private void legalandOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DM Legal and Regulatory Information.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DM Legal and Regulatory Information");
                window.setScene(scene);
                window.show();
        
        
    }

    @FXML
    private void acceseeteOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DMAccess resources related to education.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DMAccess resources related to education");
                window.setScene(scene);
                window.show();
        
    }

    @FXML
    private void infradeveOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DMInfrastructure Development.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DMInfrastructure Development");
                window.setScene(scene);
                window.show();
        
    
    }

    @FXML
    private void fineOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DMfine.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DMfine");
                window.setScene(scene);
                window.show();
        
    }

    @FXML
    private void communicationOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DM Communication and coordination.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("DM Communication and coordination");
                window.setScene(scene);
                window.show();
        
    }
    

}  
