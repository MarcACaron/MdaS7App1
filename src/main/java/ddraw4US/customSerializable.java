package ddraw4US;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import models.customCircle;

public interface customSerializable extends Serializable {
	
		default public void shapeWrite(final ObjectOutputStream oos, Shape sh) {
			//Structure commune
			try {
				oos.writeObject(sh.getFill().toString());
				if(sh.getStroke()!=null)
					oos.writeObject(sh.getStroke().toString());//Couleur des traits
				else
					oos.writeObject("null");
				oos.writeObject(sh.getStrokeDashArray().size());
				for(int i=0; i<sh.getStrokeDashArray().size(); i++) {
					oos.writeObject(sh.getStrokeDashArray().get(i));
				}
				oos.writeObject(sh.getStrokeWidth());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		default public void shapeRead(final ObjectInputStream ois, Shape sh) {
			try {
				sh.setFill( Color.valueOf((String) ois.readObject()));
				String stroke = (String) ois.readObject();
				if(!stroke.contentEquals("null")) {
					sh.setStroke( Color.valueOf(stroke));
					System.out.println("Y'a une couleur de trait");
				}
				int dashArraySize = (int)ois.readObject();
				for(int i=0; i<dashArraySize; i++) {
					sh.getStrokeDashArray().add((double) ois.readObject());
				}
				sh.setStrokeWidth((double) ois.readObject());
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
