package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import models.DrawingZone;

import java.net.URL;
import java.util.ResourceBundle;

import ddraw4US.MainApp;

public class DZController{
	
	private MainApp mainApp;
	
	@FXML
	private Canvas canvas1;
	@FXML
	private Canvas canvas2;
	@FXML
	private Canvas canvas3;
	@FXML
	private Canvas canvas4;
	
	public DZController() {
		//mainApp.getDrawingZone().setCanvas(1, canvas1);
		//mainApp.getDrawingZone().setCanvas(2, canvas2);
		//mainApp.getDrawingZone().setCanvas(3, canvas3);
		//mainApp.getDrawingZone().setCanvas(4, canvas4);
		
		//canvas1.getGraphicsContext2D().setFill(Color.BLUE);
		//canvas1.getGraphicsContext2D().fillRect(100, 100, 100, 100);

	}
	
    @FXML
    public void initialize() {}
}
