package view;

import java.io.*;

import com.sun.javafx.geom.Shape;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import models.CustomCircle;
import models.CustomLine;
import models.CustomRectangle;
import models.Identifiable;
import models.ShapeType;
import models.XmlEncoder;

import java.io.File;

public class FileController {

	private static FileController instance = new FileController();

	public static FileController getInstance( ) {
		return instance;
	}


	private FileChooser fileChooser;
	private File currentFile;

	public Boolean AskForFile(Stage primaryStage) {
		
		fileChooser = new FileChooser();
		if (currentFile != null) {
			fileChooser.setInitialDirectory(currentFile.getParentFile());
		}
		
		fileChooser.setTitle("Save Drawing");
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("XML files", "*.xml");
		fileChooser.getExtensionFilters().add(extFilter);

		File fileCandidate = fileChooser.showSaveDialog(primaryStage);
		
		if (fileCandidate != null) {
			currentFile = fileCandidate;
			return true;
		}
		
		return false;

	}

	public void SaveDrawing(Pane pane) {
		ObservableList<Node> shapeList = pane.getChildren();

		XmlEncoder.createXML(shapeList, currentFile);

	}
	
	public File getCurrentFile() {
		return currentFile;
	}


}
