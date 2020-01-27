package view;

import ddraw4US.CircleTool;
import ddraw4US.LineTool;
import ddraw4US.MainApp;
import ddraw4US.RectangleTool;
import ddraw4US.SelectionTool;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

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
			this.mainApp.setTool(new SelectionTool());
			System.out.println("Selection");
		}else {
			pointeur.setSelected(true);
			this.mainApp.setTool(new SelectionTool());
		}
		
	}
	@FXML
	private void chooseRectangle() {
		if(rectangle.isSelected()) {
			this.mainApp.setTool(new RectangleTool());
			System.out.println(this.mainApp.getTool().getTool().getClass());
		}else {
			this.mainApp.setTool(new SelectionTool());
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseCircle() {
		if(circle.isSelected()) {
			this.mainApp.setTool(new CircleTool());
			System.out.println(this.mainApp.getTool().getTool().getClass());
		}else {
			this.mainApp.setTool(new SelectionTool());
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseLine() {
		if(line.isSelected()) {
			this.mainApp.setTool(new LineTool());
			System.out.println(this.mainApp.getTool().getTool().getClass());
		}else {
			this.mainApp.setTool(new SelectionTool());
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseArrow() {
		if(arrow.isSelected()) {
			//this.mainApp.setTool(new CustomLine());
			//System.out.println(this.mainApp.getTool().getTool().getClass());
		}else {
			this.mainApp.setTool(new SelectionTool());
			pointeur.setSelected(true);
		}
		
	}
	@FXML
	private void chooseText() {
		if(text.isSelected()) {
			//this.mainApp.setTool(new CustomLine());
			//System.out.println(this.mainApp.getTool().getTool().getClass());
		}else {
			this.mainApp.setTool(new SelectionTool());
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
		this.mainApp.setTool(new SelectionTool());
    }
}
