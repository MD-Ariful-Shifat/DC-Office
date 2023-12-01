/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.EI;
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
public class ADCEICTdashboardController implements Initializable {

    private EI user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
   
    
     
    }  
    
    public EI getUser() {
        return user;
    }

    public void setUser(EI user) {
        this.user = user;
    } 

    @FXML
    private void eduimOnClick(ActionEvent event) throws IOException {  
        Parent root = FXMLLoader.load(getClass().getResource("EI_ Education Improvement.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Education Improvement");
                window.setScene(scene);
                window.show();
        
    }

    @FXML
    private void cudeOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("EI_Rural development.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Education Improvement");
                window.setScene(scene);
                window.show();
        
    }

    @FXML
    private void ictOnClick(ActionEvent event) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("EI_ICT.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Education Improvement");
                window.setScene(scene);
                window.show();
        
    }

    @FXML
    private void egovOnClick(ActionEvent event) throws IOException {
        
        
         Parent root = FXMLLoader.load(getClass().getResource("EI_E_government services.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("EI_govment services");
                window.setScene(scene);
                window.show();        
    }

    @FXML
    private void daocdOnClick(ActionEvent event) throws IOException {
       
         Parent root = FXMLLoader.load(getClass().getResource("EI_Development activities of Curriculum Development.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Development activities of Curriculum Development");
                window.setScene(scene);
                window.show();   
        
        
    }

    @FXML
    private void dihitalOnClick(ActionEvent event) throws IOException {
        
        
         Parent root = FXMLLoader.load(getClass().getResource("EI_Digital literacy.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("EI_Digital literacy");
                window.setScene(scene);
                window.show();   
        
    }

    @FXML
    private void teacherOnClick(ActionEvent event) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("EI_Teachers Training program.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("EI_Teachers Training program");
                window.setScene(scene);
                window.show();  
    }

    @FXML
    private void educationalinsOnClick(ActionEvent event) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("EI_ Educational Institutions.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("EI_Educational Institutions");
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
    
}
