/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

<<<<<<< HEAD
import Model.DM;
=======
>>>>>>> 87888c5df118c19f3b0948846635f11dec22e405
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
 * @author sadia
 */
public class DMdashboardController implements Initializable {

    private DM user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
<<<<<<< HEAD
    }
    public DM getUser() {
        return user;
    }

    public void setUser(DM user) {
        this.user = user;
    }
    
    @FXML
    private void signoutOnClick(ActionEvent event) throws IOException {
        Parent root = null;
=======
    }    

    @FXML
    private void publicOnClick(ActionEvent event) {
    }

    @FXML
    private void dataOnClick(ActionEvent event) {
    }

    @FXML
    private void backOnClcik(ActionEvent event) throws IOException {
        /*Parent root = null;
>>>>>>> 87888c5df118c19f3b0948846635f11dec22e405
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("SignIn Page.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        System.out.println(this.user.toString());

        /*SomeFXMLController p = someLoader.getController();
<<<<<<< HEAD
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();

    }



=======
        p.setUser(this.user);

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();*/


    }

    @FXML
    private void budgetOnClick(ActionEvent event) {
       /* Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMBudgetandfin.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        System.out.println(this.user.toString());

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();*/

    }

    @FXML
    private void infrastructureOnClick(ActionEvent event) {
       /* Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMInfrastructure Development.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        
        System.out.println(this.user.toString());

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show(); */

    }

    @FXML
    private void legalOnClick(ActionEvent event) {
    }

    @FXML
    private void gdOnClick(ActionEvent event) {
    }

    @FXML
    private void citizenOnClick(ActionEvent event) {
    }

    @FXML
    private void fineOnClick(ActionEvent event) {
    }

    private class user {

        public user() {
        }
    }
>>>>>>> 87888c5df118c19f3b0948846635f11dec22e405
    
