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
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
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
 * @author ASUS
 */
public class DrroBlanketDistributionController implements Initializable {

    @FXML
    private TextField AreaTextField;
    @FXML
    private TextField BlanketTextField;
    @FXML
    private DatePicker DatePicker;
    @FXML
    private TableView<DrroBlanketModel> BlanketTable;
    @FXML
    private TableColumn<DrroBlanketModel, String> AreaColumn;
    @FXML
    private TableColumn<DrroBlanketModel, LocalDate> DateColumn;
    @FXML
    private TableColumn<DrroBlanketModel, String> AmountColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        AreaColumn.setCellValueFactory(new PropertyValueFactory<DrroBlanketModel,String>("AreaColumn"));
        AmountColumn.setCellValueFactory(new PropertyValueFactory<DrroBlanketModel,String>("AmountColumn"));
        DateColumn.setCellValueFactory(new PropertyValueFactory<DrroBlanketModel,LocalDate>("DateColumn"));

        // TODO
    }    

    @FXML
    private void SaveBtnOnClick(MouseEvent event) {
        
        FileOutputStream  fos;
        ObjectOutputStream oos;
        
        DrroBlanketModel blanket = new DrroBlanketModel(AreaTextField.getText(),
                                       BlanketTextField.getText(),
                                       DatePicker.getValue()
                                    );
        //tableView.getItems().add(0,newPerson);
        BlanketTable.getItems().add(blanket);
    
        AreaTextField.setText(null);    BlanketTextField.setText(null); DatePicker.setValue(null);
        
        try {           
            File f = new File("BlanketDisrtribution.bin");   
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);                
            }
            oos.writeObject(blanket);
            System.out.println(oos.toString());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @FXML
    private void LoadTableBtnOnClick(MouseEvent event) {
        
        BlanketTable.getItems().clear();
        BlanketTable.refresh();
        ObjectInputStream ois=null;
         try {
            DrroBlanketModel blanket;
            ois = new ObjectInputStream(new FileInputStream("BlanketDisrtribution.bin"));
            while(true){
                blanket = (DrroBlanketModel) ois.readObject();
                blanket.display();
                BlanketTable.getItems().add(blanket);
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
             BlanketTable.refresh();
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
