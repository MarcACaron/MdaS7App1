package view;

import ddraw4US.MainApp;
import ddraw4US.SelectionTool;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MenuController {
	
	private Pane pane;
	
	@FXML
	private MenuBar menuBar;
	
	@FXML MenuItem menuItemNew;
	
	@FXML
	private void clear() {
		pane.getChildren().clear();
	}
	
	private MainApp mainApp;
	
	public MenuController() {
		// TODO Auto-generated constructor stub
	
	}
	
	@FXML
    private void initialize() {
//		System.out.println(menuBar.getMenus().size());
//		
//		for (int i = 0; i < menuBar.getMenus().size(); ++i) {
//			
//			String menuText = menuBar.getMenus().get(i).getText();
//			System.out.println(menuText);
//			System.out.println(menuBar.getMenus().get(i).getText());
//			if (menuText == "File") {
//				
//				System.out.println("plzzz");
//				Menu fileMenu = menuBar.getMenus().get(i);
//				
//				for (int j = 0; j < fileMenu.getItems().size(); ++j) {
//					
//					if (fileMenu.getItems().get(0).getText() == "New") {
//						
//						MenuItem newMenuItem = fileMenu.getItems().get(0);
//						
//						newMenuItem.setOnAction(e -> {
//						    this.pane.getChildren().clear();
//						    System.out.println("je clique");
//						});
//						
//					}
//				}
//			}
//		}
		
		
		menuItemNew.setOnAction(e -> {
		    this.pane.getChildren().clear();
		});
		
    }

	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
	
	public void setPane(Pane pane) {
		this.pane = pane;
	}
}
