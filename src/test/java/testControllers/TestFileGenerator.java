package testControllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import controllers.FileGenerator;
import controllers.ShapeStorage;
import controllers.customCircle;

public class TestFileGenerator {
	@Test
	public void testFileGen() {
		FileGenerator fg = new FileGenerator();
		ShapeStorage shapeSto = new ShapeStorage();
		shapeSto.addShape(new customCircle(3.0));
		fg.saveDraw(shapeSto.getShapeCollection(),"ddraw4US.save");
		
		ShapeStorage shapeSto2 = new ShapeStorage();
		shapeSto2.setShapeCollection(fg.loadDraw("ddraw4US.save"));
		
		int taille = shapeSto.getShapeCollection().size();
		assertEquals(taille,shapeSto2.getShapeCollection().size());
		assertEquals(shapeSto.getShapeCollection().toString(),shapeSto2.getShapeCollection().toString());
		for(int i=0; i<taille; i++) {
			assertEquals(shapeSto.getShapeCollection().get(i).toString(),shapeSto2.getShapeCollection().get(i).toString());
		}
	}
}
