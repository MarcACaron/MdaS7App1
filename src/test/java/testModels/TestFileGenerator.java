package testModels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import models.FileGenerator;
import models.ShapeStorage;
import models.customCircle;
import models.customRectangle;

public class TestFileGenerator {
	private static FileGenerator fg = new FileGenerator();
	
	@Test
	public void simpleLines() {
		ShapeStorage shapeSto = new ShapeStorage();
		
		testFileGen(shapeSto);
	}

	@Test
	public void simpleArrows() {
		ShapeStorage shapeSto = new ShapeStorage();
		
		testFileGen(shapeSto);
	}

	@Test
	public void simpleRectangles() {
		ShapeStorage shapeSto = new ShapeStorage();
		shapeSto.addShape(new customRectangle());
		shapeSto.addShape(new customRectangle(3, 4));
		shapeSto.addShape(new customRectangle(4, 5, Color.valueOf("red")));
		shapeSto.addShape(new customRectangle(1, 2, 3, 4));
		
		testFileGen(shapeSto);
	}

	@Test
	public void simpleCircles() {
		ShapeStorage shapeSto = new ShapeStorage();
		shapeSto.addShape(new customCircle());
		shapeSto.addShape(new customCircle(3.0));
		shapeSto.addShape(new customCircle(4, Color.valueOf("red")));
		shapeSto.addShape(new customCircle(3.0,4.0,5.0));
		shapeSto.addShape(new customCircle(5, 7, 9, Color.valueOf("red")));
		
		testFileGen(shapeSto);
	}
	
	
	public static void testFileGen(ShapeStorage shapeSto) {
		
		
		fg.saveDraw(shapeSto.getShapeCollection(),"ddraw4US.save");
		
		ShapeStorage shapeSto2 = new ShapeStorage();
		shapeSto2.setShapeCollection(fg.loadDraw("ddraw4US.save"));
		
		int taille = shapeSto.getShapeCollection().size();
		assertEquals(taille,shapeSto2.getShapeCollection().size());
		for(int i=0; i<taille; i++) {
			assertEquals(shapeSto.getShapeCollection().get(i).toString(),shapeSto2.getShapeCollection().get(i).toString());
			assertEquals(shapeSto.getShapeCollection().get(i).getStroke(), shapeSto2.getShapeCollection().get(i).getStroke());
			assertEquals(shapeSto.getShapeCollection().get(i).getStrokeDashArray().toString(), shapeSto2.getShapeCollection().get(i).getStrokeDashArray().toString());
			assertEquals(shapeSto.getShapeCollection().get(i).getStrokeWidth(), shapeSto2.getShapeCollection().get(i).getStrokeWidth());
		}
		assertEquals(shapeSto.getShapeCollection().toString(),shapeSto2.getShapeCollection().toString());
	}
}
