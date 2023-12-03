/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.SAC;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SACViewCompalinController implements Initializable {

    private SAC user;
    @FXML
    private TableColumn<SACViewComplainModel, String> complainColumn;
    @FXML
    private TableColumn<SACViewComplainModel, String> contactColumn;
    @FXML
    private TableColumn<SACViewComplainModel, String> addressColumn;
    @FXML
    private TableColumn<SACViewComplainModel, String> personcolumn;
    @FXML
    private TableView<SACViewComplainModel> complainTable;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField personTextField;
    @FXML
    private TextField contacTextField;
    @FXML
    private TextField complainTextField;

    /**
     * Initializes the controller class.
     */
    @Override
     public void initialize(URL url, ResourceBundle rb) {
        
        complainColumn.setCellValueFactory(new PropertyValueFactory<SACViewComplainModel,String>("complainColumn"));
        contactColumn.setCellValueFactory(new PropertyValueFactory<SACViewComplainModel,String>("contactColumn"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<SACViewComplainModel,String>("addressColumn"));
        personcolumn.setCellValueFactory(new PropertyValueFactory<SACViewComplainModel,String>("personcolumn"));

         
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
     private void loadOnClick(MouseEvent event) {
        complainTable.getItems().clear();
        complainTable.refresh();
        ObjectInputStream ois=null;
         try {
            SACViewComplainModel complainlist;
            ois = new ObjectInputStream(new FileInputStream("Complain.bin"));
            while(true){
                complainlist = (SACViewComplainModel) ois.readObject();
                complainlist.display();
                complainTable.getItems().add(complainlist);
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
             complainTable.refresh();
         }
    }

    @FXML
    private void saveOnClick(MouseEvent event) {
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        SACViewComplainModel complainlist = new SACViewComplainModel(  
                    complainTextField.getText(),
                    contacTextField.getText(),
                    addressTextField.getText(),
                    personTextField.getText()

                );
        complainTextField.setText(null);    contacTextField.setText(null);   addressTextField.setText(null); personTextField.setText(null);
        
        try {           
            File f = new File("Complain.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(complainlist);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
