/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import Model.DC;
import Model.SAC;
import Model.AA;
import Model.EI;
import Model.DM;
import Model.SACEB;
import Model.Drro;
import Model.UNO;
import Model.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SignInPageController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField passTextField;
    @FXML
    private ComboBox<String> userComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] users = {"DC", "SAC", "AA", "EI", "DM", "SACEB", "UNO", "Drro"};
        userComboBox.getItems().addAll(users);
    }    

    @FXML
    private void signInOnClick(ActionEvent event) throws IOException {
        int id = Integer.parseInt(idTextField.getText());
        String password = passTextField.getText();
        String usertype = userComboBox.getValue();
        
        
        User loggedIn = User.login(id, password);
        if (loggedIn == null){
            //error here
            return;
        } else if (usertype.equals("DC")) {
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DC Dashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            DCDashboardController p = someLoader.getController();
            p.setUser((DC) loggedIn);

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("SAC")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("SAC Dashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            SACDashboardController p = someLoader.getController();
            p.setUser((SAC) loggedIn);

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("AA")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DistrictAdministratordashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            /*SACDashboardController p = someLoader.getController();
            p.setUser((SAC) this.user);*/

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("EI")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("ADCEICTdashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            /*SACDashboardController p = someLoader.getController();
            p.setUser((SAC) this.user);*/

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("DM")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DMdashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            /*SACDashboardController p = someLoader.getController();
            p.setUser((SAC) this.user);*/

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("SACEB")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("SACEBdashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            /*SACDashboardController p = someLoader.getController();
            p.setUser((SAC) this.user);*/

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("Drro")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DrroDashboard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            /*SACDashboardController p = someLoader.getController();
            p.setUser((SAC) this.user);*/

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        else if (usertype.equals("UNO")){
            Parent root = null;
            FXMLLoader someLoader = new FXMLLoader(getClass().getResource("UNOdashBoard.fxml"));
            root = (Parent) someLoader.load();
            Scene someScene = new Scene(root);

            /*SACDashboardController p = someLoader.getController();
            p.setUser((SAC) this.user);*/

            Stage someStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        }
        
                
    }

    @FXML
    private void signupOnClick(ActionEvent event) {
        
        User.login(0, "2");
    
        
        
        
        LocalDate date1 = LocalDate.now();
        
        DC dc1 = new DC(100, "pass", "Shifat", "Bashundhara", "0170101010", date1, "Dhaka");
        DC dc2 = new DC(101, "password", "Shifat", "Bashundhara", "0170101010", date1, "Chittagong");
        DC dc3 = new DC(102, "password", "Shifat", "Bashundhara", "0170101010", date1, "Dhaka");
        SAC sac1 = new SAC(200, "word", "Shifat", "Bashundhara", "0170101010", date1, "Dhaka");
        
        SAC sac2 = new SAC(201, "password", "Shifat", "Bashundhara", "0170101010", date1, "Dhaka");
        SAC sac3 = new SAC(202, "password", "Shifat", "Bashundhara", "0170101010", date1, "Dhaka");

        AA aa1 = new AA(301, "password", "Sujana", "Bashundhara", "0170101010", date1, "Dhaka");
        EI ei1 = new EI(302, "password", "Sujana", "Bashundhara", "0170101010", date1, "Dhaka");
        
        DM dm1 = new DM(401, "password", "Sadia", "Bashundhara", "0170101010", date1, "Dhaka");
        SACEB saceb1 = new SACEB(402, "password", "Sadia", "Bashundhara", "0170101010", date1, "Dhaka");
        Drro drr1 = new Drro(501, "password", "Israt", "Bashundhara", "0170101010", date1, "Dhaka");
        UNO uno1 = new UNO(502, "password", "Israt", "Bashundhara", "0170101010", date1, "Dhaka");





        
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
            oos.writeObject(dc1);
            oos.writeObject(dc2);
            oos.writeObject(dc3);
            oos.writeObject(sac1);
            oos.writeObject(sac2);
            oos.writeObject(sac3);
            oos.writeObject(aa1);

            oos.writeObject(ei1);
            oos.writeObject(dm1);
            oos.writeObject(saceb1);
            oos.writeObject(drr1);
            oos.writeObject(uno1);
            oos.close();

        } catch (IOException ex) {} 
        finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {}
        }
        System.out.println("Users added successfully");
        
    }
    
}
