package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ddraw4US.customSerializable;
import ddraw4US.Drawable;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Pair;

public class CustomRectangle extends Rectangle implements customSerializable, Drawable {

	private static final long serialVersionUID = -5631325064753800206L;

	public CustomRectangle() {
		// TODO Auto-generated constructor stub
	}

	public CustomRectangle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public CustomRectangle(double width, double height, Paint fill) {
		super(width, height, fill);
		// TODO Auto-generated constructor stub
	}

	public CustomRectangle(double x, double y, double width, double height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	private void readObject(final ObjectInputStream ois) throws IOException, ClassNotFoundException {
		this.setX((double) ois.readObject());
		this.setY((double) ois.readObject());
		this.setWidth((double) ois.readObject());
		this.setHeight((double) ois.readObject());
		
		//Structure commune
		//Structure commune
		shapeRead(ois, this);
	}

	private void writeObject(final ObjectOutputStream oos) throws IOException {
		oos.writeObject(this.getX());
		oos.writeObject(this.getY());
		oos.writeObject(this.getWidth());
		oos.writeObject(this.getHeight());
		
		shapeWrite(oos, this);
	}
	
	public Shape draw(Pair<Double, Double> startPositionXY, Pair<Double, Double> finalPositionXY) {
		
		double startX = startPositionXY.getKey();
		double startY = startPositionXY.getValue();
		
		double finalX = finalPositionXY.getKey();
		double finalY = finalPositionXY.getValue();
		
		double width = Math.max(finalX, startX) - Math.min(finalX, startX);
		double height = Math.max(finalY, startY) - Math.min(finalY, startY);
		
		return new CustomRectangle(startX, startY, width, height);
	}

}
