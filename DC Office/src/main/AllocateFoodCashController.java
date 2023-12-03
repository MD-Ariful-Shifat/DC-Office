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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AllocateFoodCashController implements Initializable {

    @FXML
    private TextField AreaTextField;
    @FXML
    private TextField CashTextField;
    @FXML
    private TextField FoodItemTextField;
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
    @FXML
    private TextField FoodAmntTextFiled;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        AreaColumn.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("AreaColumn"));
        CashColumn.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("CashColumn"));
        ItemColumn.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("ItemColumn"));
        AmountFoodClm.setCellValueFactory(new PropertyValueFactory<DrroAllocateTable,String>("AmountFoodClm"));

         
        
        //Allow Salary status to be edittable
        AllocateTable.setEditable(true);
        CashColumn.setCellFactory(TextFieldTableCell.forTableColumn());        
        AmountFoodClm.setCellFactory(TextFieldTableCell.forTableColumn());        

        // TODO
    }    

    @FXML
    private void SaveBtnOnClick(MouseEvent event) {
        
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        DrroAllocateTable cashitem = new DrroAllocateTable(  
                    AreaTextField.getText(),
                    CashTextField.getText(),
                    FoodItemTextField.getText(),
                    FoodAmntTextFiled.getText()

                );
        AreaTextField.setText(null);    CashTextField.setText(null);   FoodItemTextField.setText(null); FoodAmntTextFiled.setText(null);
        
        try {           
            File f = new File("AllocateItem.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(cashitem);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
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
    private void BackbtnOnClick(MouseEvent event) throws IOException {
        
        Parent parent = FXMLLoader.load(getClass().getResource("DrroDashboard.fxml"));
         Scene scene = new Scene(parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.show();
        

        
    }
    
}
