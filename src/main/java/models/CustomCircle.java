package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ddraw4US.customSerializable;
import ddraw4US.*;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class CustomCircle extends Circle implements customSerializable, Drawable {

	private static final long serialVersionUID = 2672929896832129863L;

	public CustomCircle() {
		// TODO Auto-generated constructor stub
	}

	public CustomCircle(double radius) {
		super(radius);
	}

	public CustomCircle(double radius, Paint fill) {
		super(radius, fill);
		// TODO Auto-generated constructor stub
	}

	public CustomCircle(double centerX, double centerY, double radius) {
		super(centerX, centerY, radius);
		// TODO Auto-generated constructor stub
	}

	public CustomCircle(double centerX, double centerY, double radius, Paint fill) {
		super(centerX, centerY, radius, fill);
		// TODO Auto-generated constructor stub
	}

	private void readObject(final ObjectInputStream ois) throws IOException, ClassNotFoundException {
		this.setRadius((double) ois.readObject());
		this.setCenterX((double) ois.readObject());
		this.setCenterY((double) ois.readObject());
		
		//Structure commune
		shapeRead(ois, this);
		
	}

	private void writeObject(final ObjectOutputStream oos) throws IOException {
		oos.writeObject(this.getRadius());
		oos.writeObject(this.getCenterX());
		oos.writeObject(this.getCenterY());
		
		//Structure commune
		shapeWrite(oos,this);
	}
	
	public Shape ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		double width = Math.abs(posXEnd - posXStart);
		double height = Math.abs(posYEnd - posYStart);
		double cote = Math.min(width, height);
		double posX = posXEnd<posXStart?(posXStart-cote):(posXStart+cote);
		double posY = posYEnd<posYStart?(posYStart-cote):(posYStart+cote);
		return new CustomRectangle(posX, posY, cote, cote);
	}

	@Override
	public void endAjust(double posXStart, double posYStart, double posXEnd, double posYEnd) {

		double width = Math.abs(posXEnd - posXStart);
		double height = Math.abs(posYEnd - posYStart);
		double cote = Math.min(width, height);
		double centerX = posXEnd<posXStart?(posXStart-cote/2):(posXStart+cote/2);
		double centerY = posYEnd<posYStart?(posYStart-cote/2):(posYStart+cote/2);
		this.setCenterX(centerX);
		this.setCenterY(centerY);
		this.setRadius(cote/2);
		
		
	}
}
