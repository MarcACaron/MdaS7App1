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

public class testApplicationUI extends ApplicationTest{
	private MainApp mainApp;
	
	@Override
	public void start(Stage stage) {
		mainApp = new MainApp();
		mainApp.start(stage);
		mainApp.getPrimaryStage().toFront();
	}
	
	public <T extends Node> T find(final String query) {
		return lookup(query).query();
	}
	
}
