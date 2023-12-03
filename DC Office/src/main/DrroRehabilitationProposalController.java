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
 * @author ASUS
 */
public class DrroRehabilitationProposalController implements Initializable {

    @FXML
    private TextField PeopleTextField;
    @FXML
    private TextField HouseTextField;
    @FXML
    private TextField BudgetTextField;
    @FXML
    private TableView<DrroRehabilitationModel> RehabilitationTable;
    @FXML
    private TableColumn<DrroRehabilitationModel, String> PeopleColumn;
    @FXML
    private TableColumn<DrroRehabilitationModel, String> HouseColumn;
    @FXML
    private TableColumn<DrroRehabilitationModel, String> BudgetClm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        PeopleColumn.setCellValueFactory(new PropertyValueFactory<DrroRehabilitationModel,String>("PeopleColumn"));
        HouseColumn.setCellValueFactory(new PropertyValueFactory<DrroRehabilitationModel,String>("HouseColumn"));
        BudgetClm.setCellValueFactory(new PropertyValueFactory<DrroRehabilitationModel,String>("BudgetClm"));

        
        // TODO
    }    

    @FXML
    private void SaveBtnonClick(MouseEvent event) {
        
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        DrroRehabilitationModel rehabitList = new DrroRehabilitationModel(  
                    PeopleTextField.getText(),
                    HouseTextField.getText(),
                    BudgetTextField.getText()

                );
        PeopleTextField.setText(null);    HouseTextField.setText(null);   BudgetTextField.setText(null);
        
        try {           
            File f = new File("rehabilitation.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(rehabitList);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @FXML
    private void ShowTableBtnOnClick(MouseEvent event) {
        RehabilitationTable.getItems().clear();
        RehabilitationTable.refresh();
        ObjectInputStream ois=null;
         try {
            DrroRehabilitationModel rehabitList;
            ois = new ObjectInputStream(new FileInputStream("rehabilitation.bin"));
            while(true){
                rehabitList = (DrroRehabilitationModel) ois.readObject();
                rehabitList.display();
                RehabilitationTable.getItems().add(rehabitList);
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
             RehabilitationTable.refresh();
         }    
        
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
