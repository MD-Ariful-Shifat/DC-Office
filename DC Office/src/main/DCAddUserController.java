/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.DC;
import Model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DCAddUserController implements Initializable {
    private DC user;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField contactTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private ComboBox<String> usertypeCombo;
    @FXML
    private TextField passTextFiled;
    @FXML
    private TextField areaTextField;
    @FXML
    private DatePicker dobPicker;

    public DC getUser() {
        return user;
    }

    public void setUser(DC user) {
        this.user = user;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] users = {"DC", "SAC", "AA", "EI", "DM", "SACEB", "UNO", "DR"};
        usertypeCombo.getItems().addAll(users);
        // TODO
    }    


    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADC Dashboard.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);

        /*SomeFXMLController p = someLoader.getController();
        p.setUser(this.user);*/

        Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    @FXML
    /*private void addOnClick(ActionEvent event) {
        int id = Integer.parseInt(idTextField.getText());
        String name = nameTextField.getText();
        String password = passTextFiled.getText();
        String useraddress = addressTextField.getText();
        String usercontact = contactTextField.getText();
        String usertype = usertypeCombo.getValue();
        String userarea = areaTextField.getText();
        String userdob = dobPicker.getValue();*/


        


        /*Read text field for combo box*/
        User ToBeAdded = null;
        /* if user type = DC then ToBeAdded = New DC(...)*/
       /* if (usertype.equals("DC")) {
            ToBeAdded = new DC(id, password, name, useraddress, usercontact, DOB, userarea);
;
        }
         File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        try {
            f = new File("Users.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            oos.writeObject(ToBeAdded);

            oos.close();

        } catch (IOException ex) {} 
        finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {}
        }
        System.out.println("Users added successfully"); 


    }
*/
    
}
