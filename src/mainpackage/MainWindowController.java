/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public Stage st = new Stage();;

    @FXML
    private MenuItem newRegistration;
    @FXML
    private MenuItem editRegistration;

    // Initializes the controller class.
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
       
    }    
      
    // OpenForm Method for New Registration
    public void OpenForm() throws IOException{
        Parent pt = FXMLLoader.load(getClass().getResource("NewRegistration.fxml"));
       
        Scene sc = new Scene(pt, 900, 450);
        st.initModality(Modality.APPLICATION_MODAL);
        //st.initStyle(StageStyle.UNDECORATED);
        st.setScene(sc);
        st.setResizable(false);
        //st.initOwner();
        //st.setAlwaysOnTop(true);
        st.showAndWait();
        
    }
    
    private void CloseNewReg(){
        newRegistration.setDisable(false);
    }
    
}
