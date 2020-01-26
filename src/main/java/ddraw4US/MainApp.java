package ddraw4US;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
    public MainApp() {
	}
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ddraw4US");

        initRootLayout();

        //showPersonOverview();
        showMainOverview();
        showPaletteOverview();
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
    
    public void showMainOverview() {
        try {
            // Load person overview.
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(MainApp.class.getResource("../view/MainOverview.fxml"));
            AnchorPane MainOverview = (AnchorPane) loader1.load();
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(MainOverview);       
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showPaletteOverview() {
    	try {
        FXMLLoader loader1 = new FXMLLoader();
        FXMLLoader loader2 = new FXMLLoader();
        FXMLLoader loader3 = new FXMLLoader();    	
        loader1.setLocation(MainApp.class.getResource("../view/LastOverview.fxml"));
        loader2.setLocation(MainApp.class.getResource("../view/ColorPaletteOverview.fxml"));
        loader3.setLocation(MainApp.class.getResource("../view/FormPaletteOverview.fxml"));
        AnchorPane LastOverview = (AnchorPane) loader1.load();
        HBox ColorPaletteOverview = (HBox) loader2.load();    
        VBox FormPaletteOverview = (VBox) loader3.load();        
        
        // Set person overview into the center of root layout.
        rootLayout.setCenter(LastOverview);       
        rootLayout.setTop(ColorPaletteOverview);
        rootLayout.setLeft(FormPaletteOverview);
        
    } catch (IOException e) {
        e.printStackTrace();
    }        
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}