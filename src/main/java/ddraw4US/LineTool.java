package ddraw4US;

import java.util.function.Function;

import javafx.scene.Node;
import javafx.scene.shape.Shape;
import models.CustomLine;
import models.CustomRectangle;
import view.DetailPaletteController;

public class LineTool extends Tool{

	public LineTool() {
		this.tool = new CustomLine();
	}

	@Override
	public void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		if(startFromCenter) {
			((CustomLine) this.tool).setStartX(posXEnd);
			((CustomLine) this.tool).setStartY(posYEnd);
			((CustomLine) this.tool).setEndX(2*posXStart-posXEnd);
			((CustomLine) this.tool).setEndY(2*posYStart-posYEnd);
		}else {
			((CustomLine) this.tool).setStartX(posXStart);
			((CustomLine) this.tool).setStartY(posYStart);
			((CustomLine) this.tool).setEndX(posXEnd);
			((CustomLine) this.tool).setEndY(posYEnd);
		}
		
	}

	@Override
	public void reset() {
		this.tool = new CustomLine();
		this.tool.setStroke(stroke);
		this.tool.setStrokeWidth(lineWidth);
	}

	@Override
	public Function fillDetails(DetailPaletteController pc, Shape nd) {
		return (y) -> {
			pc.select(true, true, true, false, false);
			CustomLine line = (CustomLine)nd;
			pc.setTextField(line.getStartX(), line.getStartY(), 0.0, 0.0, 0.0, Math.sqrt(Math.pow((line.getStartX()-line.getStartY()), 2) + Math.pow((line.getEndX()-line.getEndY()), 2)), line.getRotate());
			return y;
			};
	}

	@Override
	public void setXPosTool(double value) {
		((CustomLine)tool).setStartX(value);
	}

	@Override
	public void setYPosTool(double value) {
		((CustomLine)tool).setStartY(value);
	}

	@Override
	public void setWidthTool(double value) {
	}

	@Override
	public void setHeightTool(double value) {
	}

	@Override
	public void setRadiusTool(double value) {
	}

	@Override
	public void setLengthTool(double value) {
		((CustomLine)tool).setEndX(((CustomLine)tool).getStartX()+Math.cos(((CustomLine)tool).getRotate())*value);
		((CustomLine)tool).setEndX(((CustomLine)tool).getStartX()+Math.cos(((CustomLine)tool).getRotate())*value);
	}
}
