package testControllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.testfx.*;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.util.WaitForAsyncUtils;

import ddraw4US.MainApp;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.testfx.api.FxAssert;


import view.DetailPaletteController;


public class testDetailPaletteController extends ApplicationTest{
	private MainApp mainApp;
	
	private MenuBar menuBar;

		private VBox detailPalette;
		private VBox positionSection; 
		private VBox dimensionSection;
		private VBox angleSection;
	
		private HBox xPos;
		private HBox yPos;
		private HBox width;
		private HBox height;
		private HBox radius;
		private HBox length;
		private HBox angle;
	
		private TextField xPosText;
		private TextField yPosText;
		private TextField widthText;
		private TextField heightText;
		private TextField radiusText;
		private TextField lengthText;
		private TextField angleText;

	
	@Override
	public void start(Stage stage) {
		mainApp = new MainApp();
		mainApp.start(stage);
		mainApp.getPrimaryStage().toFront();
	}
	
	public <T extends Node> T find(final String query) {
		return lookup(query).query();
	}
	
	@Test
	@DisplayName("TO DO - test_DetailPalette_Layout")
	public void test_DetailPalette_Layout() {
		
		final String[][] nameArray = 
			{	{"Position", "X:", "Y:"},
				{"Dimensions", "Width:", "Height:", "Radius:", "Length"},
				{"Rotation", "Angle"}};
		
		detailPalette = find("#detailPalette");
		positionSection = find("#positionSection");
		dimensionSection = find("#dimensionSection");
		angleSection = find("#angleSection");
		 
		 for (int i = 0; i < nameArray.length; i++) {
			 for (int j = 0; j < nameArray[i].length; j++) {
			 }
		 }
	}
	
	/*@Test
	public void paletteDisable_test() {
		detailPaletteController = new DetailPaletteController();
		
		detailPaletteController.paletteDisable(true);
		assertEquals(detailPaletteController.getPalette().isDisabled(), true);
		
		detailPaletteController.paletteDisable(false);
		assertEquals(detailPaletteController.getPalette().isDisabled(), false);
	}
	
	@Test
	public void select_test() {
		detailPaletteController.select(false, false, false, false, false);
		assertEquals(detailPaletteController.getXPosText(), false);
		assertEquals(detailPaletteController.getRadiusText(), false);
		assertEquals(detailPaletteController.getWidthText(), false);
		assertEquals(detailPaletteController.getHeightText(), false);
		assertEquals(detailPaletteController.getAngleText(), false);
		
		detailPaletteController.select(true, true, true, true, true);
		assertEquals(detailPaletteController.getXPosText(), true);
		assertEquals(detailPaletteController.getRadiusText(), true);
		assertEquals(detailPaletteController.getWidthText(), true);
		assertEquals(detailPaletteController.getHeightText(), true);
		assertEquals(detailPaletteController.getAngleText(), true);		
	}*/
}
