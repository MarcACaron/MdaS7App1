package ddraw4US;

import java.util.function.Function;

import models.CustomLine;
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
	public Function fillDetails(DetailPaletteController pc) {
		return (y) -> {
			pc.select(true, true, true, false, false);
			return y;
			};
	}
		

}
