/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Myah
 */
public class NewRegistrationController implements Initializable {

    @FXML
    private AnchorPane Anchorpane;
    @FXML
    private Label disabilityStatus;
    @FXML
    private ComboBox<String> genderCombo;
    @FXML
    private ComboBox<String> nationalityCombo;
    @FXML
    private ComboBox<String> stateCombo;
    @FXML
    private ComboBox<String> disabilityCombo;
    @FXML
    private Button closeReg;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
    }     
   
    
}
