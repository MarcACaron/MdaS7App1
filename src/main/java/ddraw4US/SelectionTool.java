package ddraw4US;

import java.util.function.Function;

import javafx.scene.shape.Shape;
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
	public Function fillDetails(DetailPaletteController pc) {
		return (y) -> {
			pc.paletteState(true);
			return y;
			};
	}
	
}
