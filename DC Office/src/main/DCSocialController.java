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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
public class DCSocialController implements Initializable {

    @FXML
    private TableView<DCSocialModel> eventTable;
    @FXML
    private TableColumn<DCSocialModel, String> eventColumn;
    @FXML
    private TableColumn<DCSocialModel, String> timeColumn;
    @FXML
    private TableColumn<DCSocialModel, String> dateColumn;
    @FXML
    private TableColumn<DCSocialModel, String> locationColumn;
    @FXML
    private TextField eventTextField;
    @FXML
    private TextField dateTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField locationTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eventColumn.setCellValueFactory(new PropertyValueFactory<DCSocialModel,String>("eventColumn"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<DCSocialModel,String>("timeColumn"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<DCSocialModel,String>("dateColumn"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<DCSocialModel,String>("locationColumn"));
    }    

    @FXML
    private void saveOnClick(MouseEvent event) {
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        DCSocialModel sociallist = new DCSocialModel(  
                    eventTextField.getText(),
                    timeTextField.getText(),
                    dateTextField.getText(),
                    locationTextField.getText()

                );
        eventTextField.setText(null);    timeTextField.setText(null);   dateTextField.setText(null); locationTextField.setText(null);
        
        try {           
            File f = new File("Social.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(sociallist);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void loadOnClick(MouseEvent event) {
        eventTable.getItems().clear();
        eventTable.refresh();
        ObjectInputStream ois=null;
         try {
            DCSocialModel sociallist;
            ois = new ObjectInputStream(new FileInputStream("Social.bin"));
            while(true){
                sociallist = (DCSocialModel) ois.readObject();
                sociallist.display();
                eventTable.getItems().add(sociallist);
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
             eventTable.refresh();
         } 
    }

    @FXML
    private void backOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DC Dashboard.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
        
    }
    
}
