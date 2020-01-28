package ddraw4US;

import java.util.function.Function;

import javafx.scene.Node;
import javafx.scene.shape.Shape;
import models.CustomRectangle;
import view.DetailPaletteController;

public class SelectionTool extends Tool {

	public SelectionTool() {
		// TODO Auto-generated constructor stub
	}

	public SelectionTool(Shape tool) {
		super(tool);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		
	}

	@Override
	public void reset() {
		this.tool = null;
	}

	@Override
	public Function fillDetails(DetailPaletteController pc, Shape nd) {
		return (y) -> {
			pc.paletteDisable(true);
			pc.setTextField(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			
			return y;
			};
	}

	@Override
	public void setXPosTool(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setYPosTool(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWidthTool(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeightTool(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRadiusTool(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLengthTool(double value) {
		// TODO Auto-generated method stub
		
	}
	
}
