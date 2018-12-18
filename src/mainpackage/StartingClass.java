
package mainpackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Myah
 */
public class StartingClass extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent parent = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        
        Scene scene = new Scene(parent, 1024, 650);
       
        primaryStage.setTitle("Myah Solution");
        primaryStage.setScene(scene);
        //primaryStage.setFullScreen(true);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
