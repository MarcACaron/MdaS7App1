package testModels;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import models.DrawingZone;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

class DrawingZone_TestCase {
	int NUMBER_OF_CANVAS_MAX = 4,
		SIZE_X_OF_CANVAS = 300,
		SIZE_Y_OF_CANVAS = 300;
		

    @DisplayName("Correct Number of Canvas on DrawingZone.")
	@Test
	void testDrawingZoneConstructor() {
		DrawingZone zone;
		for (int i = 0; i < NUMBER_OF_CANVAS_MAX; i++) {
			zone = new DrawingZone(i, SIZE_X_OF_CANVAS, SIZE_Y_OF_CANVAS);
			assertEquals(zone.getCanvases().length, i);
			assertEquals(zone.getPane().getChildren().size(), i);
			for(int j = 0; j < i; j++) {
				assertEquals(zone.getCanvas(j).getWidth(), SIZE_X_OF_CANVAS);
				assertEquals(zone.getCanvas(j).getHeight(), SIZE_Y_OF_CANVAS);
			}
		}
	}
    
    @DisplayName("Correct Number of Canvas and Dimensions on DrawingZone.")
	@Test
	void test() {
    	
    }

}
