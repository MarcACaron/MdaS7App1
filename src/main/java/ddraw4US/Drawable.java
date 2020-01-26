package ddraw4US;

import javafx.scene.shape.Shape;
import javafx.util.Pair;

public interface Drawable {
	
	public Shape draw(Pair<Double, Double> startPositionXY, Pair<Double, Double> finalPositionXY);

}
