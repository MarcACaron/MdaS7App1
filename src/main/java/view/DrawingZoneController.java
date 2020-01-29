package view;



import ddraw4US.MainApp;
import ddraw4US.SelectionTool;
import ddraw4US.Tool;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class DrawingZoneController {
	
	@FXML
	private Pane pane;
	
	private MainApp mainApp;
	double orgX, orgY;
	int childIndex;
	
	public DrawingZoneController() {
	}
	
	@FXML
    private void initialize() {
		pane.setOnMousePressed((t) -> {
			if(this.mainApp.getTool().getClass()==SelectionTool.class){// Mode selection	
				this.mainApp.getTool().fillDetails(this.mainApp.paletteDetailController, null).apply(null);
				this.mainApp.getTool().reset();
			}else {
				this.mainApp.getTool().reset();
				orgX = t.getX();
				orgY = t.getY();
				childIndex = pane.getChildren().size();
				pane.getChildren().add(this.mainApp.getTool().getTool());
			}
		});
		pane.setOnMouseDragged((t) -> {
			if(this.mainApp.getTool()==null) {// Mode selection
				
			}else {
				this.mainApp.getTool().ajustOnDrag(orgX, orgY, t.getX(), t.getY());
			}
		});
		pane.setOnMouseReleased((t) -> {
			if(this.mainApp.getTool().getClass()==SelectionTool.class) {// Mode selection
				
			}else {
				Shape sh = (Shape) pane.getChildren().get(childIndex);
				Tool tool = this.mainApp.getTool();
				sh.setOnMouseClicked((t2) -> {
					if(this.mainApp.getTool().getClass()==SelectionTool.class) {
						this.mainApp.getTool().setTool(sh);
						this.mainApp.paletteCouleurController.setLineWidth(sh.getStrokeWidth());
						this.mainApp.paletteCouleurController.setStroke((Color) (sh.getStroke()));
						this.mainApp.paletteCouleurController.setFill(sh.getAccessibleText()==null?"":sh.getAccessibleText());
						tool.fillDetails(this.mainApp.paletteDetailController, sh).apply(null);
					}
				});
			}
		});
		
    }
	
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        this.mainApp.menuController.setPane(pane);
    }
}
