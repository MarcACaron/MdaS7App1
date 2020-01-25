package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ddraw4US.customSerializable;
import javafx.scene.shape.Line;

public class CustomLine extends Line implements customSerializable{

	public CustomLine() {
		// TODO Auto-generated constructor stub
	}

	public CustomLine(double startX, double startY, double endX, double endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}
	
	private void readObject(final ObjectInputStream ois) throws IOException, ClassNotFoundException {
		this.setStartX((double) ois.readObject());
		this.setStartY((double) ois.readObject());
		this.setEndX((double) ois.readObject());
		this.setEndY((double) ois.readObject());
		
		//Structure commune
		//Structure commune
		shapeRead(ois, this);
	}

	private void writeObject(final ObjectOutputStream oos) throws IOException {
		oos.writeObject(this.getStartX());
		oos.writeObject(this.getStartY());
		oos.writeObject(this.getEndX());
		oos.writeObject(this.getEndY());
		
		shapeWrite(oos, this);
	}
}