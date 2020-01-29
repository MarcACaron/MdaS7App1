package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ddraw4US.customSerializable;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class CustomRectangle extends Rectangle implements customSerializable, Transformable {

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
	

	@Override
	public void setXPosTool(double value) {
		this.setX(value);
	}

	@Override
	public void setYPosTool(double value) {
		this.setY(value);
	}

	@Override
	public void setWidthTool(double value) {
		this.setWidth(value);
	}

	@Override
	public void setHeightTool(double value) {
		this.setHeight(value);
	}

	@Override
	public void setRadiusTool(double value) {
	}

	@Override
	public void setLengthTool(double value) {
	}

	@Override
	public void setRotationTool(double value) {
		this.setRotate(value);
		
	}
	
	
	

}
