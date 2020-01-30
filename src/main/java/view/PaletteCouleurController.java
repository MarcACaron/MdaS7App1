package view;

import ddraw4US.MainApp;
import ddraw4US.Tool;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

public class PaletteCouleurController {
	
	@FXML
    private Button fillAnanas;
	@FXML
    private Button fillDirt;
	@FXML
    private Button fillRed;	
	@FXML
    private ColorPicker stroke;
	@FXML
    private ChoiceBox<Double> lineWidth;
	@FXML
    private ChoiceBox<double[]> lineStyle;
	@FXML
    private ChoiceBox<int[]> policeText;
    @FXML
    private ImageView detailsImage;
	
	private MainApp mainApp;
		
	public PaletteCouleurController() {
	}
	
	@FXML
	private void zoomIn() {
		this.mainApp.drawingZoneController.zoomIn(1.1);
	}
	@FXML
	private void zoomOut() {
		this.mainApp.drawingZoneController.zoomOut(1.1);
	}
	@FXML
	private void ananas() {
		fillShape("ananas");
	}
	
	@FXML
	private void dirt() {
		fillShape("dirt");
	}
	
	@FXML
	private void red() {
		fillShape("rouge");
	}
	
	private void fillShape(String value) {
		if(value!="") {
			if(value=="rouge") {
			    Tool.fill = Color.RED;
			}else {
				String imagePath = "images/" + value + ".png";
				Image image = new Image(imagePath); 
			    ImagePattern radialGradient = new ImagePattern(image, 50, 50, 200, 200, false);
			    Tool.fill = radialGradient;
			}
		    Tool.fillName = value;
			if(this.mainApp.getTool().getTool()!=null) {
				
			    this.mainApp.getTool().fillShape();
			}
		}
		
	}
	
	public void setStroke(Color stroke) {
		this.stroke.setValue(stroke);
	}

	public void setLineWidth(double lineWidth) {
		this.lineWidth.setValue(lineWidth);
	}

	@FXML
	private void changeStrokeColor() {
		if(this.mainApp.getTool().getTool()!=null) {
			this.mainApp.getTool().getTool().setStroke(stroke.getValue());
		}
		Tool.stroke = stroke.getValue();
	}
	
	@FXML
	private void changeLineWidth() {
		if(this.mainApp.getTool().getTool()!=null) {
			this.mainApp.getTool().getTool().setStrokeWidth(lineWidth.getValue().doubleValue());
		}
		Tool.lineWidth = lineWidth.getValue().doubleValue();
	}
	
	@FXML
    private void initialize() {
		lineWidth.setItems(FXCollections.observableArrayList(1.0,3.0, 5.0, 7.0, 9.0));
		lineWidth.setOnAction((t)->{
			changeLineWidth();
		});
    }
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
		stroke.setValue(Color.BLACK);
		Tool.stroke = Color.BLACK;
		lineWidth.setValue(1.0);
		this.fillShape("ananas");
    }
}
