
package br.ufms.staff.app;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class StaffUpdate extends Application {

    @Override
    public void start(Stage primaryStage) {

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/fxml/StaffUpdateView.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(StaffUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
