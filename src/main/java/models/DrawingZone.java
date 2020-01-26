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
    public DrawingZone(int numberOfCanvas, int sizeX, int sizeY) {
    	size = new int[2];
    	size[0] = sizeX;
    	size[1] = sizeY;
    	
    	canvases = new Canvas[numberOfCanvas];
    	for (int i = 0; i < numberOfCanvas; i++) {
    		canvases[i] = new Canvas(size[0], size[1]);
    	}
    	
    	pane = new Pane();
    	
    	for (int i = 0; i < numberOfCanvas; i++) {
    		pane.getChildren().add(canvases[i]);
    	}
    }
    
    public void setSize(int inputSize[]) { this.size = inputSize;}
    public int[] getSize() {return this.size;}
    
    public void setPane(Pane inputPane) {this.pane = inputPane;}
    public Pane getPane() {return this.pane;}
    
    public void setCanvas(int canvasNumber, Canvas inputCanvas) {this.canvases[canvasNumber] = inputCanvas;}
    public Canvas getCanvas(int canvasNumber) {return this.canvases[canvasNumber];}
    
    public Canvas[] getCanvases() {return canvases;}
    
    public void clearCanvas(int canvasNumber) {
    	canvases[canvasNumber].getGraphicsContext2D().clearRect(size[0], size[1], canvases[canvasNumber].getWidth(), canvases[canvasNumber].getHeight());
    }
}
