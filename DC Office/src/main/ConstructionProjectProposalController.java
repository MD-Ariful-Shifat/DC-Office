/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ConstructionProjectProposalController implements Initializable {

    @FXML
    private TextField ProposalTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SaveBtnOnClick(MouseEvent event) {
        
        String content = ProposalTextField.getText() ;

    // The file to write to
    File outputFile = new File("Proposal.txt");

    try {
        FileWriter writer = new FileWriter(outputFile);
        writer.write(content);
        writer.close();
        System.out.println("Proposal written");
    } catch (IOException e) {
        e.printStackTrace();
    }
        // TODO
        
    }

    @FXML
    private void BackBtnOnClick(MouseEvent event) throws IOException {
        
        Parent parent = FXMLLoader.load(getClass().getResource("DrroDashboard.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
        
    }
    
}
