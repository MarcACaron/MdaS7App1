package models;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Shape;

public class PatternApplier {
	
	public PatternApplier() {
		
	}
	
	public Shape setFill(Shape shape) {
		System.out.println(shape.getAccessibleText());
		if (shape.getAccessibleText().compareToIgnoreCase("rouge") == 0) {
			System.out.println("weird");
			shape.setFill(Color.RED);
			
		} else {
			String imagePath = "images/" + shape.getAccessibleText() + ".png";
			Image image = new Image(imagePath); 
		    ImagePattern radialGradient = new ImagePattern(image, 50, 50, 200, 200, false);
		    shape.setFill(radialGradient);
		}
		
		return shape;
	}

}
