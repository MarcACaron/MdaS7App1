package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ddraw4US.customSerializable;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class CustomCircle extends Circle implements customSerializable {

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
	
	
}
