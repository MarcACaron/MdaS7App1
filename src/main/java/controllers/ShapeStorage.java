package controllers;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.shape.*;

public class ShapeStorage {
	private List<Shape> shapeCollection;
	
	public ShapeStorage() {
		this.shapeCollection = new ArrayList<Shape>();
	}
	
	public void addShape(Shape sh) {
		this.shapeCollection.add(sh);
	}
	
	public List<Shape> getShapeCollection() {
		return shapeCollection;
	}

	public void setShapeCollection(List<Shape> shapeCollection) {
		this.shapeCollection = shapeCollection;
	}	   
	
}
