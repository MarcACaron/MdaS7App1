package view;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MenuController {
	
	private Pane pane;
	
	@FXML
	private void clear() {
		pane.getChildren().clear();
	}
	
	private MainApp mainApp;
	
	public MenuController() {
		// TODO Auto-generated constructor stub
	}

	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
	
	public void setPane(Pane pane) {
		this.pane = pane;
	}
}
