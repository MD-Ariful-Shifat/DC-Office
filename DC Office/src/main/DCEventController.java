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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DCEventController implements Initializable {

    @FXML
    private TableView<DCEventModel> socialTable;
    @FXML
    private TableColumn<DCEventModel, String> eventTextField;
    @FXML
    private TableColumn<DCEventModel, String> dateTextField;
    @FXML
    private TableColumn<DCEventModel, String> timeTextFiled;
    @FXML
    private TableColumn<DCEventModel, String> locationTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private DatePicker datePicker;

  /**
     * Initializes the controller class.
     */
    @Override
     public void initialize(URL url, ResourceBundle rb) {
        eventTextField.setCellValueFactory(new PropertyValueFactory<DCEventModel,String>("eventTextField"));
        dateTextField.setCellValueFactory(new PropertyValueFactory<DCEventModel,String>("dateTextField"));
        timeTextFiled.setCellValueFactory(new PropertyValueFactory<DCEventModel,String>("timeTextFiled"));
        locationTextField.setCellValueFactory(new PropertyValueFactory<DCEventModel,String>("locationTextField"));
        
    }      

    @FXML
    private void saveOnClick(MouseEvent event) {
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        DCEventModel eventlist = new DCEventModel(  
                    eventTextField.getText(),
                    dateTextField.getText(),
                    timeTextFiled.getText(),
                    locationTextField.getText()

                );
        eventTextField.setText(null); dateTextField.setText(null); timeTextFiled.setText(null); locationTextField.setText(null);
        
        try {           
            File f = new File("Event.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(eventlist);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @FXML
    private void loadOnClick(MouseEvent event) {
         socialTable.getItems().clear();
        socialTable.refresh();
        ObjectInputStream ois=null;
         try {
            DCEventModel eventlist;
            ois = new ObjectInputStream(new FileInputStream("Event.bin"));
            while(true){
                eventlist = (DCEventModel) ois.readObject();
                eventlist.display();
                socialTable.getItems().add(eventlist);
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
             socialTable.refresh();
         }  
         
    }

    @FXML
    private void backOnClick(MouseEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("DC Dashboard.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
         
    }
    

    
}
