    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author genop
 */
// #ffa781 : orange
// #5b0e2d : red
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
 
        try {
            Parent root =FXMLLoader.load(getClass().getResource("login_page.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("Style/controls.css").toExternalForm());
            //primaryStage.setTitle("Hello World!");
            //remove titlebare
           primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
