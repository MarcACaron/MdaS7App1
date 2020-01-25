package models;

import java.io.Serializable;

import javafx.scene.shape.Shape;

public class CustomArrow extends Shape implements Serializable{

	private static final long serialVersionUID = -2975806758564858636L;
	private CustomLine bodyLine;
	private CustomLine rHead;
	private CustomLine lHead;
	private double startX, startY, endX, endY;
	
	public CustomArrow() {
		this.bodyLine = new CustomLine();
		this.rHead = new CustomLine();
		this.lHead = new CustomLine();
		this.startX = 0;
		this.startY = 0;
		this.endX = 0;
		this.endY = 0;
	}
	
	public CustomArrow(double startX, double startY, double endX, double endY) {
		this.bodyLine = new CustomLine(startX, startY, endX, endY);
		double length = Math.sqrt(Math.pow(endY-startY, 2)+Math.pow(endX-startX, 2));
		this.rHead = new CustomLine(endX, endY, Math.cos(45)*(startX-endX)*length/15+endX, Math.sin(45)*(startY-endY)*length/15+endY);
		this.lHead = new CustomLine(endX, endY, Math.cos(-45)*(startX-endX)*length/15+endX, Math.sin(-45)*(startY-endY)*length/15+endY);
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	public double getStartX() {
		return startX;
		
	}

	public void setStartX(double startX) {
		this.startX = startX;
		this.bodyLine.setStartX(startX);
		double length = Math.sqrt(Math.pow(this.endY-this.startY, 2)+Math.pow(this.endX-this.startX, 2));
		
		this.rHead.setEndX(Math.cos(45)*(startX-endX)*length/15+endX);
		this.rHead.setEndY(Math.sin(45)*(startY-endY)*length/15+endY);
		this.lHead.setEndX(Math.cos(-45)*(startX-endX)*length/15+endX);
		this.lHead.setEndY(Math.sin(-45)*(startY-endY)*length/15+endY);
	}

	public double getStartY() {
		return startY;
	}

	public CustomLine getBodyLine() {
		return bodyLine;
	}

	public CustomLine getrHead() {
		return rHead;
	}

	public CustomLine getlHead() {
		return lHead;
	}

	public void setStartY(double startY) {
		this.startY = startY;
		this.bodyLine.setStartY(startY);
		double length = Math.sqrt(Math.pow(this.endY-this.startY, 2)+Math.pow(this.endX-this.startX, 2));
		

		this.rHead.setEndX(Math.cos(45)*(this.startX-this.endX)*length/15+this.endX);
		this.rHead.setEndY(Math.sin(45)*(startY-this.endY)*length/15+this.endY);
		this.lHead.setEndX(Math.cos(-45)*(this.startX-this.endX)*length/15+this.endX);
		this.lHead.setEndY(Math.sin(-45)*(startY-this.endY)*length/15+this.endY);
	}

	public double getEndX() {
		return endX;
	}

	public void setEndX(double endX) {
		this.endX = endX;
		this.bodyLine.setEndX(endX);
		this.rHead.setStartX(endX);
		this.lHead.setStartX(endX);
		double length = Math.sqrt(Math.pow(this.endY-this.startY, 2)+Math.pow(this.endX-this.startX, 2));
		
		
		this.rHead.setEndX(Math.cos(45)*(this.startX-endX)*length/15+endX);
		this.rHead.setEndY(Math.sin(45)*(this.startY-this.endY)*length/15+this.endY);
		this.lHead.setEndX(Math.cos(-45)*(this.startX-endX)*length/15+endX);
		this.lHead.setEndY(Math.sin(-45)*(this.startY-this.endY)*length/15+this.endY);
	}

	public double getEndY() {
		return endY;
	}

	public void setEndY(double endY) {
		this.endY = endY;
		this.bodyLine.setEndY(endY);
		this.rHead.setStartY(endY);
		this.lHead.setStartY(endY);
		double length = Math.sqrt(Math.pow(this.endY-this.startY, 2)+Math.pow(this.endX-this.startX, 2));
		
		this.rHead.setEndX(Math.cos(45)*(this.startX-this.endX)*length/15+this.endX);
		this.rHead.setEndY(Math.sin(45)*(this.startY-endY)*length/15+endY);
		this.lHead.setEndX(Math.cos(-45)*(this.startX-this.endX)*length/15+this.endX);
		this.lHead.setEndY(Math.sin(-45)*(this.startY-endY)*length/15+endY);
	}
}
