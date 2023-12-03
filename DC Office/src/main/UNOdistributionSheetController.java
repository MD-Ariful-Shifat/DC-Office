/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class UNOdistributionSheetController implements Initializable {

    @FXML
    private TableView<DrroAllocateTable> AllocateTable;
    @FXML
    private TableColumn<DrroAllocateTable, String> AreaColumn;
    @FXML
    private TableColumn<DrroAllocateTable, String> CashColumn;
    @FXML
    private TableColumn<DrroAllocateTable, String> ItemColumn;
    @FXML
    private TableColumn<DrroAllocateTable, String> AmountFoodClm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        AreaColumn.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("AreaColumn"));
        CashColumn.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("CashColumn"));
        ItemColumn.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("ItemColumn"));
        AmountFoodClm.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("AmountFoodClm"));

         
        
        // TODO
    }    

    @FXML
    private void ShowTableBtnOnClick(MouseEvent event) {
        
        AllocateTable.getItems().clear();
        AllocateTable.refresh();
        ObjectInputStream ois=null;
         try {
            DrroAllocateTable cashitem;
            ois = new ObjectInputStream(new FileInputStream("AllocateItem.bin"));
            while(true){
                cashitem = (DrroAllocateTable) ois.readObject();
                cashitem.display();
                AllocateTable.getItems().add(cashitem);
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
             AllocateTable.refresh();
         }    
  
        
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
    private void confirmBtnOnClick(MouseEvent event) {
    }
    
}
