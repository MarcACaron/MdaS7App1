package view;

import java.util.Optional;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;

import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;


public class MenuController {
	
	private Pane pane;
	
	@FXML
	private MenuBar menuBar;
	
	@FXML private MenuItem menuItemNew;
	
	@FXML private MenuItem menuItemSave;
	
	@FXML private MenuItem menuItemSaveAs;
	
	private FileController fileController;
	
	@FXML
	private void clear() {
		pane.getChildren().clear();
	}
	
	private MainApp mainApp;
	
	public MenuController() {
		// TODO Auto-generated constructor stub
	
	}
	
	@FXML
    private void initialize() {	
		
		fileController = FileController.getInstance();
		
		menuItemNew.setOnAction(e -> {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("");
			alert.setHeaderText("");
			alert.setContentText("Do you want to save before creating a new draw?");
			
			ButtonType buttonTypeYes = new ButtonType("Yes");
			ButtonType buttonTypeNo = new ButtonType("No");
			ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
			
			alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == buttonTypeYes || result.get() == buttonTypeNo){
			    this.pane.getChildren().clear();
			} else if (result.get() == buttonTypeCancel) {
				
			}
			
		});
		
		menuItemSaveAs.setOnAction(e -> {
			
			if (fileController.AskForFile(mainApp.getPrimaryStage()));
				fileController.SaveDrawing(pane);
			
		});
		
		menuItemSave.setOnAction(e -> {
			
			if (fileController.getCurrentFile() == null) {
				if (fileController.AskForFile(mainApp.getPrimaryStage())) {
					fileController.SaveDrawing(pane);
				}
					
			}
			
		});
		
    }

	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
	
	public void setPane(Pane pane) {
		this.pane = pane;
	}
}
