package ddraw4US;

import java.io.IOException;

import controllers.DZController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.DrawingZone;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private DrawingZone drawingZone;
    private DZController dZController;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ddraw4US");
        
        initRootLayout();
        showMainOverview();
    }
    
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../view/RootLayout.fxml"));
            //../
            rootLayout = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    /*public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    
    public void showMainOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            drawingZone = new DrawingZone();
            dZController = new DZController();
            loader.setLocation(MainApp.class.getResource("../view/MainOverview.fxml"));
            AnchorPane MainOverview = (AnchorPane) loader.load();
            loader.setController(dZController);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(MainOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {return primaryStage;}
    public DrawingZone getDrawingZone(){return drawingZone;}

    public static void main(String[] args) {
        launch(args);
    }
}