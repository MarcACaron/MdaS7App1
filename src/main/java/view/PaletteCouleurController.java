package view;

import java.nio.file.Paths;

import ddraw4US.MainApp;
import ddraw4US.Tool;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class PaletteCouleurController {
	
	@FXML
    private ChoiceBox<String> fill;
	@FXML
    private ColorPicker stroke;
	@FXML
    private ChoiceBox<Double> lineWidth;
	@FXML
    private ChoiceBox<double[]> lineStyle;
	@FXML
    private ChoiceBox<int[]> policeText;
	
	private MainApp mainApp;
		
	public PaletteCouleurController() {
	}
	
	@FXML
	private void fillShape() {
		System.out.println("Working Directory = " + Paths.get("").toAbsolutePath().toString());
		String imagePath = "images/" + fill.getValue() + ".png";
		Image image = new Image(imagePath); 
	    ImagePattern radialGradient = new ImagePattern(image, 50, 50, 200, 200, false);
		if(this.mainApp.getTool().getTool()!=null) {
			
		    this.mainApp.getTool().fillShape(radialGradient);
			//this.mainApp.getTool().fillShape(fill.getValue());
		}
	    Tool.fill = radialGradient;
	}
	
	@FXML
	private void changeStrokeColor() {
		if(this.mainApp.getTool().getTool()!=null) {
			this.mainApp.getTool().getTool().setStroke(stroke.getValue());
		}
	}
	
	@FXML
	private void changeLineWidth() {
		System.out.println("kjlkjhjh");
		if(this.mainApp.getTool().getTool()!=null) {
			this.mainApp.getTool().getTool().setStrokeWidth(lineWidth.getValue().doubleValue());
		}
	}
	
	@FXML
    private void initialize() {
		lineWidth.setItems(FXCollections.observableArrayList(1.0,3.0, 5.0, 7.0, 9.0));
		lineWidth.setOnAction((t)->{
			changeLineWidth();
		});
		fill.setItems(FXCollections.observableArrayList("ananas","dirt"));
		fill.setOnAction((t)->{
			fillShape();
		});
		
    }
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
		fill.setValue("ananas");
    }
}
