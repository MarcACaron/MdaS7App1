package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class customRectangle extends Rectangle implements Serializable {

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
		this.setFill( Color.valueOf((String) ois.readObject()));
		String stroke = (String) ois.readObject();
		if(!stroke.contentEquals("null")) {
			this.setStroke( Color.valueOf(stroke));
			System.out.println("Y'a une couleur de trait");
		}
		int dashArraySize = (int)ois.readObject();
		for(int i=0; i<dashArraySize; i++) {
			this.getStrokeDashArray().add((double) ois.readObject());
		}
		this.setStrokeWidth((double) ois.readObject());
	}

	private void writeObject(final ObjectOutputStream oos) throws IOException {
		oos.writeObject(this.getX());
		oos.writeObject(this.getY());
		oos.writeObject(this.getWidth());
		oos.writeObject(this.getHeight());
		
		//Structure commune
		oos.writeObject(this.getFill().toString());
		if(this.getStroke()!=null)
			oos.writeObject(this.getStroke().toString());//Couleur des traits
		else
			oos.writeObject("null");
		oos.writeObject(this.getStrokeDashArray().size());
		for(int i=0; i<this.getStrokeDashArray().size(); i++) {
			oos.writeObject(this.getStrokeDashArray().get(i));
		}
		oos.writeObject(this.getStrokeWidth());
	}

}
