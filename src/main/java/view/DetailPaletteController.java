package view;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DetailPaletteController {
	private MainApp mainApp;
	
	@FXML	private VBox detailPalette;
	@FXML	private VBox positionSection; 
	@FXML	private VBox dimensionSection;
	@FXML	private VBox angleSection;
	
	@FXML	private HBox xPos;
	@FXML	private HBox yPos;
	@FXML	private HBox width;
	@FXML	private HBox height;
	@FXML	private HBox radius;
	@FXML	private HBox length;
	@FXML	private HBox angle;
	
	@FXML	private TextField xPosText;
	@FXML	private TextField yPosText;
	@FXML	private TextField widthText;
	@FXML	private TextField heightText;
	@FXML	private TextField radiusText;
	@FXML	private TextField lengthText;
	@FXML	private TextField angleText;
	
	
	@FXML private void initialize() {
		detailPalette.setDisable(true);
	}
	
	public void setMainApp(MainApp inputMain){mainApp = inputMain;}
	
}
