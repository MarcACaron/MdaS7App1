package testModels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import javafx.scene.paint.Color;
import models.CustomLine;
import models.FileGenerator;
import models.ShapeStorage;
import models.CustomArrow;
import models.CustomCircle;
import models.CustomRectangle;

public class TestFileGenerator {
	private static FileGenerator fg = new FileGenerator();
	
	@Test
	public void simpleLines() {
		ShapeStorage shapeSto = new ShapeStorage();
		shapeSto.addShape(new CustomLine());
		shapeSto.addShape(new CustomLine(1, 2, 3, 4));
		
		testFileGen(shapeSto);
	}

	@Test
	public void simpleArrows() {
		ShapeStorage shapeSto = new ShapeStorage();
		
		
		fg.saveDraw(shapeSto.getShapeCollection(),"ddraw4US.save");
		
		ShapeStorage shapeSto2 = new ShapeStorage();
		shapeSto2.setShapeCollection(fg.loadDraw("ddraw4US.save"));
		
		int taille = shapeSto.getShapeCollection().size();
		assertEquals(taille,shapeSto2.getShapeCollection().size());
		for(int i=0; i<taille; i++) {
			new CustomArrow();
			CustomLine body = ((CustomArrow) shapeSto.getShapeCollection().get(i)).getBodyLine();
			CustomLine rHead = ((CustomArrow) shapeSto.getShapeCollection().get(i)).getlHead();
			CustomLine lHead = ((CustomArrow) shapeSto.getShapeCollection().get(i)).getrHead();
			assertEquals(body.toString(),body.toString());
			assertEquals(body.getStroke(), body.getStroke());
			assertEquals(body.getStrokeDashArray().toString(), body.getStrokeDashArray().toString());
			assertEquals(body.getStrokeWidth(), body.getStrokeWidth());

			assertEquals(rHead.toString(),rHead.toString());
			assertEquals(rHead.getStroke(), rHead.getStroke());
			assertEquals(rHead.getStrokeDashArray().toString(), rHead.getStrokeDashArray().toString());
			assertEquals(rHead.getStrokeWidth(), rHead.getStrokeWidth());
			
			assertEquals(lHead.toString(),lHead.toString());
			assertEquals(lHead.getStroke(), lHead.getStroke());
			assertEquals(lHead.getStrokeDashArray().toString(), lHead.getStrokeDashArray().toString());
			assertEquals(lHead.getStrokeWidth(), lHead.getStrokeWidth());
		}
		assertEquals(shapeSto.getShapeCollection().toString(),shapeSto2.getShapeCollection().toString());
		testFileGen(shapeSto);
	}

	@Test
	public void simpleRectangles() {
		ShapeStorage shapeSto = new ShapeStorage();
		shapeSto.addShape(new CustomRectangle());
		shapeSto.addShape(new CustomRectangle(3, 4));
		shapeSto.addShape(new CustomRectangle(4, 5, Color.valueOf("red")));
		shapeSto.addShape(new CustomRectangle(1, 2, 3, 4));
		
		testFileGen(shapeSto);
	}

	@Test
	public void simpleCircles() {
		ShapeStorage shapeSto = new ShapeStorage();
		shapeSto.addShape(new CustomCircle());
		shapeSto.addShape(new CustomCircle(3.0));
		shapeSto.addShape(new CustomCircle(4, Color.valueOf("red")));
		shapeSto.addShape(new CustomCircle(3.0,4.0,5.0));
		shapeSto.addShape(new CustomCircle(5, 7, 9, Color.valueOf("red")));
		
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
