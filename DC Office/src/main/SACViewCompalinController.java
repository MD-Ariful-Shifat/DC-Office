/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.SAC;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SACViewCompalinController implements Initializable {

    private SAC user;
    @FXML
    private TableColumn<?, ?> complainColumn;
    @FXML
    private TableColumn<?, ?> contactColumn;
    @FXML
    private TableColumn<?, ?> addressColumn;
    @FXML
    private TableColumn<?, ?> personcolumn;
    @FXML
    private TableView<?> complainTable;

    public SAC getUser() {
        return user;
    }

    public void setUser(SAC user) {
        this.user = user;
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("SAC Dashboard.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    private void loadOnClick(ActionEvent event) {
    }

    @FXML
    private void saveOnClick(ActionEvent event) {
    }
    
}
