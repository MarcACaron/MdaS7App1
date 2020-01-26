package view;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import models.CustomCircle;
import models.CustomLine;
import models.CustomRectangle;

public class PaletteFormeController {
	
	@FXML
    private ToggleButton pointeur;
	@FXML
    private ToggleButton rectangle;
	@FXML
    private ToggleButton circle;
	@FXML
    private ToggleButton line;
	@FXML
    private ToggleButton arrow;
	@FXML
    private ToggleButton text;
	
	@FXML
	private void choosePointer() {
		if(pointeur.isSelected()) {
			this.mainApp.setTool(null);
			System.out.println(this.mainApp.getTool()==null?"Selection":this.mainApp.getTool().getClass());
		}else {
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseRectangle() {
		if(rectangle.isSelected()) {
			this.mainApp.setTool(new CustomRectangle());
			System.out.println(this.mainApp.getTool().getClass());
		}else {
			this.mainApp.setTool(null);
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseCircle() {
		if(circle.isSelected()) {
			this.mainApp.setTool(new CustomCircle());
			System.out.println(this.mainApp.getTool().getClass());
		}else {
			this.mainApp.setTool(null);
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseLine() {
		if(line.isSelected()) {
			this.mainApp.setTool(new CustomLine());
			System.out.println(this.mainApp.getTool().getClass());
		}else {
			this.mainApp.setTool(null);
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseArrow() {
		if(arrow.isSelected()) {
			//this.mainApp.setTool(new CustomLine());
			//System.out.println(this.mainApp.getTool().getClass());
		}else {
			this.mainApp.setTool(null);
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseText() {
		if(text.isSelected()) {
			//this.mainApp.setTool(new CustomLine());
			//System.out.println(this.mainApp.getTool().getClass());
		}else {
			this.mainApp.setTool(null);
			pointeur.setSelected(true);
		}
		
	}
	private MainApp mainApp;
	
	public PaletteFormeController() {
	}
	
	@FXML
    private void initialize() {
    }
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
