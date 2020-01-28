package view;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.Transformable;

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
	
	public void paletteDisable(boolean pState) {
		if(detailPalette.isDisabled()!=pState) {
			detailPalette.setDisable(pState);
		}
	}
	public void select(boolean width, boolean height, boolean radius, boolean length, boolean angle) {
		paletteDisable(false);
		
		this.width.setDisable(width);
		this.height.setDisable(height);
		this.radius.setDisable(radius);
		this.length.setDisable(length);
		this.angle.setDisable(angle);
	}
	@FXML private void initialize() {
		detailPalette.setDisable(true);
	}
	@FXML 
	private void onXPosChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setXPosTool(Double.valueOf(xPosText.getText()));
	}

	@FXML 
	private void onYPosChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setYPosTool(Double.valueOf(yPosText.getText()));
	}

	@FXML 
	private void onWidthChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setWidthTool(Double.valueOf(widthText.getText()));
	}

	@FXML 
	private void onHeightChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setHeightTool(Double.valueOf(heightText.getText()));
	}

	@FXML 
	private void onRadiusChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setRadiusTool(Double.valueOf(radiusText.getText()));
	}

	@FXML 
	private void onLengthChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setLengthTool(Double.valueOf(lengthText.getText()));
	}

	@FXML 
	private void onRotateChange(){
		//this.mainApp.getTool().getTool().setTranslateX(xPosText);
		((Transformable)this.mainApp.getTool().getTool()).setRotationTool(Double.valueOf(angleText.getText()));
	}
	
	public void setMainApp(MainApp inputMain){mainApp = inputMain;}

	public void setTextField(double xPos, double yPos, double width, double height, double radius, double length, double angle) {
		xPosText.setText(String.valueOf(Math.floor(xPos * 100) / 100));
		yPosText.setText(String.valueOf(Math.floor(yPos * 100) / 100));
		widthText.setText(String.valueOf(Math.floor(width * 100) / 100));
		heightText.setText(String.valueOf(Math.floor(height * 100) / 100));
		radiusText.setText(String.valueOf(Math.floor(radius * 100) / 100));
		lengthText.setText(String.valueOf(Math.floor(length * 100) / 100));
		angleText.setText(String.valueOf(Math.floor(angle * 100) / 100));
		
	}
}
