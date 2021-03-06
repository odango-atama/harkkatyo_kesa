/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harkkatyö;

import javafx.application.Application;
import static javafx.application.Platform.exit;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author camilla
 */
public class Harkkatyö extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TIMOTEI:D");
        Parent root = FXMLLoader.load(getClass().getResource("ikkunapohja.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sqlite sql = Sqlite.getInstance();
        launch(args);
        sql.closeDatabase();
        System.out.println("Closed database successfully");
        exit();
        
    }
    
}
