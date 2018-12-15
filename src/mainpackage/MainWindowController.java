/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/** FXML Controller class
 * @author Myah */

public class MainWindowController implements Initializable {
    
    

    @FXML
    private MenuItem newRegistration;
    @FXML
    private MenuItem editRegistration;
    @FXML
    private MenuItem settings;

    // Initializes the controller class.
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
       
    }    
      
    // OpenForm Method for New Registration
    @FXML
    public void OpenForm(ActionEvent event) throws IOException{
        Stage st;
        Parent pt;
        if (event.getSource() == newRegistration){
            st = new Stage();
            pt = FXMLLoader.load(getClass().getResource("NewRegistration.fxml"));
            Scene sc = new Scene(pt, 900, 450);
            st.setScene(sc);
            st.initModality(Modality.APPLICATION_MODAL);
            st.initStyle(StageStyle.UNDECORATED);
            //st.initOwner(newRegistration.getParentPopup().getOwnerWindow());
            st.showAndWait();
        }
        else if (event.getSource() == settings) {
            st = new Stage();
            pt = FXMLLoader.load(getClass().getResource("Setting.fxml"));
            Scene sc = new Scene(pt, 600, 450);
            st.setScene(sc);
            st.initModality(Modality.APPLICATION_MODAL);
            st.showAndWait();
        }
    }
    
    private void CloseNewReg(ActionEvent evt){
        
        
    }
    
}
