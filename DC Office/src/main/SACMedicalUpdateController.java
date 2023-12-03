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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SACMedicalUpdateController implements Initializable {

    @FXML
    private TableView<SACMedicalUpdateModel> medicalTable;
    @FXML
    private TableColumn<SACMedicalUpdateModel, String> mediColumn;
    @FXML
    private TableColumn<SACMedicalUpdateModel, String> hotColumn;
    @FXML
    private TableColumn<SACMedicalUpdateModel, String> locationColumn;
    @FXML
    private TextField medicalTextField;
    @FXML
    private TextField hotlineTextField;
    @FXML
    private TextField addressTextField;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         mediColumn.setCellValueFactory(new PropertyValueFactory<SACMedicalUpdateModel,String>("mediColumn"));
        hotColumn.setCellValueFactory(new PropertyValueFactory<SACMedicalUpdateModel,String>("hotColumn"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<SACMedicalUpdateModel,String>("locationColumn"));
    }    


    @FXML
    private void saveOnClick(MouseEvent event) {
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        SACMedicalUpdateModel medicallist = new SACMedicalUpdateModel(  
                    medicalTextField.getText(),
                    hotlineTextField.getText(),
                    addressTextField.getText()

                );
    medicalTextField.setText(null);   hotlineTextField.setText(null); addressTextField.setText(null);
        
        try {           
            File f = new File("Medical.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(medicallist);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void backOnClick(MouseEvent event) throws IOException {
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
        medicalTable.getItems().clear();
        medicalTable.refresh();
        ObjectInputStream ois=null;
         try {
            SACMedicalUpdateModel medicallist;
            ois = new ObjectInputStream(new FileInputStream("Medical.bin"));
            while(true){
                medicallist = (SACMedicalUpdateModel) ois.readObject();
                medicallist.display();
                medicalTable.getItems().add(medicallist);
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
             medicalTable.refresh();
         }    
        
    
    }

    
}
