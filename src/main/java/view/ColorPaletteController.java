package view;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ComboBox;
import ddraw4US.MainApp;
import models.ColorPalette;

public class ColorPaletteController {
    @FXML
    private MenuButton lineColor;
    @FXML
    private ComboBox formColor;

    //reference to the main Application
    private MainApp mainApp;
    
    public ColorPaletteController() {
    	
    }
    
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

    }    
}
