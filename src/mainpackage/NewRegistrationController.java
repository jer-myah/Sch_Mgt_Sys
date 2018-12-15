/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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

    ObservableList gender = FXCollections.observableArrayList("Female", "Male");
    ObservableList nationality = FXCollections.observableArrayList("Nigeria",
            "Ghana");
    ObservableList state = FXCollections.observableArrayList("Abia", "Adamawa",
            "Akwa-Ibom");
    ObservableList disabilty = FXCollections.observableArrayList("Blind",
            "Deaf", "Dumb", "Lame");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        genderCombo.getItems().addAll(gender);
        nationalityCombo.getItems().addAll(nationality);
        stateCombo.getItems().addAll(state);
        disabilityCombo.getItems().addAll(disabilty);

    }

    @FXML
    public void closeWindow(ActionEvent evt) {
        if (evt.getSource() == closeReg) {
            Stage stg = new Stage();
            stg = (Stage) closeReg.getScene().getWindow();
            stg.close();
        }
    }

}
