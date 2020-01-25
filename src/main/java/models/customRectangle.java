package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import ddraw4US.customSerializable;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class customRectangle extends Rectangle implements customSerializable {

	public customRectangle() {
		// TODO Auto-generated constructor stub
	}

	public customRectangle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public customRectangle(double width, double height, Paint fill) {
		super(width, height, fill);
		// TODO Auto-generated constructor stub
	}

	public customRectangle(double x, double y, double width, double height) {
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

}
