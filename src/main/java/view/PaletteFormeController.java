package view;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class PaletteFormeController {
	
	@FXML
    private ToggleButton pointeur;
	@FXML
    private ToggleButton square;
	@FXML
    private ToggleButton circle;
	@FXML
    private ToggleButton line;
	@FXML
    private ToggleButton arrow;
	@FXML
    private ToggleButton text;
	
	private MainApp mainApp;
	
	public PaletteFormeController() {
	}
	
	@FXML
    private void initialize() {
		pointeur.setText("exemple");
    }
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
