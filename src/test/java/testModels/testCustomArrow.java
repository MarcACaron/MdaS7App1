package testModels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import models.CustomArrow;


public class testCustomArrow {
	
	private CustomArrow arrow;
	
	@Test
	@DisplayName("customArrow Constructor()")
	public void customArrow_Test() {
		arrow = new CustomArrow();
		assertEquals(arrow.getStartX(), 0);
		assertEquals(arrow.getStartY(), 0);
		assertEquals(arrow.getEndX(), 0);
		assertEquals(arrow.getEndY(), 0);
	}
	
	@Test 
	@DisplayName("TO DO - customArrow Constructor(double, double, double, double)")
	public void customArrow2_Test() {/*TO DO*/}
	
	@Test 
	@DisplayName("TO DO - setStartX(double)")
	public void setStartX_Test() {}
	
	@Test 
	@DisplayName("TO DO - setStartY(double)")
	public void setStartY_Test() {}
	
	@Test 
	@DisplayName("TO DO - setEndX(double)")
	public void setEndX_Test() {}
	
	@Test 
	@DisplayName("TO DO - setEndY(double)")
	public void setEndY_Test() {}
	
	@Test 
	@DisplayName("TO DO - endAdjust(double, double, double, double)")
	public void endAdjust_Test() {}
	

}
