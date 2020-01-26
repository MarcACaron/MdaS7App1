package view;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;

public class PaletteCouleurController {
	
	@FXML
    private ColorPicker fill;
	@FXML
    private ColorPicker stroke;
	@FXML
    private ComboBox<double[]> lineWidth;
	@FXML
    private ComboBox<double[]> lineStyle;
	@FXML
    private ComboBox<int[]> policeText;
	
	private MainApp mainApp;
	
	public PaletteCouleurController() {
	}
	
	@FXML
    private void initialize() {
		
    }
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
