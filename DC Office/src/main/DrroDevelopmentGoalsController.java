/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DrroDevelopmentGoalsController implements Initializable {

    @FXML
    private TextField VillagersTextField;
    @FXML
    private TextField RoadsTextField;
    @FXML
    private TextField PondsTextField;
    @FXML
    private TextArea OutputTextArea;
    @FXML
    private TextField YearTextField;
    private ArrayList<DrroDevelopmentModel> DevArr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        DevArr = new ArrayList<DrroDevelopmentModel>();
        //mainSceneAnchorPane.setMaxSize(500, 600);
        VillagersTextField.getText();
        RoadsTextField.getText();
        PondsTextField.getText();
        YearTextField.getText();        

        // TODO
    }    

    @FXML
    private void SaveBtnOnClick(MouseEvent event) {
        
        DrroDevelopmentModel developmentModel = new DrroDevelopmentModel(
            VillagersTextField.getText(),
            RoadsTextField.getText(),
            PondsTextField.getText(),
            YearTextField.getText()
        );
        DevArr.add(developmentModel);

        // Save data to file (you may need to handle IOException properly)
        try (FileWriter fw = new FileWriter("DevelopmentGoals.txt", true)) {
            fw.write(developmentModel.getVillagersTextField() + "," +
                     developmentModel.getRoadsTextField() + "," +
                     developmentModel.getPondsTextField() + "," +
                     developmentModel.getYearTextField() + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        
    }

    @FXML
    private void ShowReportBtnOnClick(MouseEvent event) {
        
        File f = new File("DevelopmentGoals.txt");
        Scanner sc;
        String str = null;
        try{
            sc = new Scanner(f);
            OutputTextArea.setText(null);
            while(sc.hasNextLine()){
                str = sc.nextLine();
                OutputTextArea.appendText(str + "\n");
            }
        } catch (Exception e) {};

        
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
