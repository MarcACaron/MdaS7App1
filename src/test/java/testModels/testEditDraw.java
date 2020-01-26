package testModels;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import javafx.scene.shape.Shape;
import models.CustomArrow;
import models.EditDraw;
import models.EditMode;

public class testEditDraw {
		
	@Test
	public void sameShape() {
		EditDraw ed = new EditDraw();
		Shape sh = new CustomArrow();
		ed.setActualShape(sh);
		assertEquals(true, sh.equals(ed.getActualShape()));
		
		
	}
	
	@Test
	public void unselect() {
		EditDraw ed = new EditDraw();
		Shape sh = new CustomArrow();
		ed.setActualShape(sh);
		ed.setActualShape(null);
		assertEquals(false, sh == null);
		assertEquals(true, ed.getActualShape() == null);
	}
	
	@Test
	public void goodMode() {
		EditDraw ed = new EditDraw();
		assertEquals(true, EditMode.SELECTION.equals(ed.getEditMode()));
		EditMode em = EditMode.CIRCLE;
		ed.setEditMode(em);
		assertEquals(true, em.equals(ed.getEditMode()));
	}
}
