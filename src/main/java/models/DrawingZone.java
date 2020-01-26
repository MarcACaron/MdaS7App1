package models;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class DrawingZone {
	//Properties
	private int[] size;//[x, y]
	private Pane pane;
    private Canvas[] canvases;
    
    //Methods
    public DrawingZone() {
    	canvases = new Canvas[4];
    }
    
    public void setSize(int inputSize[]) { this.size = inputSize;}
    public int[] getSize() {return this.size;}
    
    public void setPane(Pane inputPane) {this.pane = inputPane;}
    public Pane getPane() {return this.pane;}
    
    public void setCanvas(int canvasNumber, Canvas inputCanvas) {this.canvases[canvasNumber-1] = inputCanvas;}
    public Canvas getCanvas(int canvasNumber) {return this.canvases[canvasNumber];}
    
    public Canvas[] getCanvases() {return canvases;}
    
    public void clearCanvas(int canvasNumber) {
    	canvases[canvasNumber].getGraphicsContext2D().clearRect(size[0], size[1], canvases[canvasNumber].getWidth(), canvases[canvasNumber].getHeight());
    }
}
