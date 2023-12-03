/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DCEducationalInstituteController implements Initializable {

    @FXML
    private TextField schoolTextField;
    @FXML
    private TextField principalTextField;
    @FXML
    private TableView<DCEducationalInstituteModel> educationTable;
    @FXML
    private TableColumn<DCEducationalInstituteModel, String> schoolcolumn;
    @FXML
    private TableColumn<DCEducationalInstituteModel, String> principalColumn;
    @FXML
    private TableColumn<DCEducationalInstituteModel, String> hotlineColumn;
    @FXML
    private TableColumn<DCEducationalInstituteModel, String> addressColumn;
    @FXML
    private TextField hotTextField;
    @FXML
    private TextField addressTextField;


    /**
     * Initializes the controller class.
     */
    @Override
     public void initialize(URL url, ResourceBundle rb) {
        
        schoolcolumn.setCellValueFactory(new PropertyValueFactory<DCEducationalInstituteModel,String>("schoolcolumn"));
        principalColumn.setCellValueFactory(new PropertyValueFactory<DCEducationalInstituteModel,String>("principalColumn"));
        hotlineColumn.setCellValueFactory(new PropertyValueFactory<DCEducationalInstituteModel,String>("hotlineColumn"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<DCEducationalInstituteModel,String>("addressColumn"));

         
    }  

  

    @FXML
    private void LoadTableBtnOnClick(MouseEvent event) {
        
        educationTable.getItems().clear();
        educationTable.refresh();
        ObjectInputStream ois=null;
         try {
            DCEducationalInstituteModel institutelist;
            ois = new ObjectInputStream(new FileInputStream("Institute.bin"));
            while(true){
                institutelist = (DCEducationalInstituteModel) ois.readObject();
                institutelist.display();
                educationTable.getItems().add(institutelist);
            }    
           
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }    finally {
             educationTable.refresh();
         }    
        
    }

    @FXML
    private void BackBtnOnClick(MouseEvent event) throws IOException {
        
        Parent parent = FXMLLoader.load(getClass().getResource("DC Dashboard.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
        
    }

    @FXML
    private void SaveBtnOnClick(MouseEvent event) {
        
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        DCEducationalInstituteModel institutelist = new DCEducationalInstituteModel(  
                    schoolTextField.getText(),
                    principalTextField.getText(),
                    hotTextField.getText(),
                    addressTextField.getText()

                );
        schoolTextField.setText(null);    principalTextField.setText(null);   hotTextField.setText(null); addressTextField.setText(null);
        
        try {           
            File f = new File("Institute.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(institutelist);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

  
    }

        
    
    
}
