package ddraw4US;

import models.CustomLine;

public class LineTool extends Tool{

	public LineTool() {
		this.tool = new CustomLine();
	}

	@Override
	public void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		((CustomLine) this.tool).setStartX(posXStart);
		((CustomLine) this.tool).setStartY(posYStart);
		((CustomLine) this.tool).setEndX(posXEnd);
		((CustomLine) this.tool).setEndY(posYEnd);
	}

	@Override
	public void reset() {
		this.tool = new CustomLine();
	}
		

}
