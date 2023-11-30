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
    private void publicOnClick(ActionEvent event) throws IOException {
                Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMpublicservice.fxml"));
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
    private void budgetOnClick(ActionEvent event) throws IOException {
                Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMBudgetandfin.fxml"));
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
    private void dataOnClick(ActionEvent event) throws IOException {
                Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMdataandreport.fxml"));
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
    private void infrastructureOnClick(ActionEvent event) throws IOException {
                Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMInfratruture Development.fxml"));
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
    private void legalOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DM Legal And Regulatory Information.fxml"));
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
    private void backOnClcik(ActionEvent event) throws IOException {
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
    private void legalandOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DM Legal and Regulatory Information.fxml"));
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
    private void acceseeteOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMAccess resources related to education.fxml"));
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
    private void infradeveOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMInfratructure Development.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        System.out.println(this.user.toString());

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();

    }
    

}  
