/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class UnoOrganizeEventsController implements Initializable {

    @FXML
    private TextField EventsTextField;
    @FXML
    private TextArea EventsTextArea;
    private ArrayList<DrroDevelopmentModel> EventArr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoadEventsBtnOnClick(MouseEvent event) {
        
        File f = new File("Events.txt");
        Scanner sc;
        String str = null;
        try{
            sc = new Scanner(f);
            EventsTextArea.setText(null);
            while(sc.hasNextLine()){
                str = sc.nextLine();
                EventsTextArea.appendText(str + "\n");
            }
        } catch (Exception e) {};

        
    }

    @FXML
    private void BackBtnOnClick(MouseEvent event) throws IOException {
        
        Parent parent = FXMLLoader.load(getClass().getResource("UNOdashBoard.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
        
    }

    @FXML
    private void SaveBtnOnClick(MouseEvent event) {
        
        String content = EventsTextField.getText();

        if (!content.isEmpty()) {
            // The file to write to
            File outputFile = new File("Events.txt");

            try {
                FileWriter writer = new FileWriter(outputFile);
                writer.write(content);
                writer.close();
                System.out.println("Proposal written");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Proposal is empty. Nothing to save.");
        }   
    }
    
}
