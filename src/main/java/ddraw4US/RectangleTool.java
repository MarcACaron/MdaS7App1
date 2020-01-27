package ddraw4US;

import models.CustomRectangle;

public class RectangleTool extends Tool {

	public RectangleTool() {
		this.tool = new CustomRectangle();
	}

	@Override
	public void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		double posX = Math.min(posXStart, posXEnd);
		double posY = Math.min(posYStart, posYEnd);
		double width = Math.abs(posXEnd - posXStart);
		double height = Math.abs(posYEnd - posYStart);
		((CustomRectangle) this.tool).setX(posX);
		((CustomRectangle) this.tool).setY(posY);
		((CustomRectangle) this.tool).setWidth(width);
		((CustomRectangle) this.tool).setHeight(height);
	}

	@Override
	public void reset() {
		this.tool = new CustomRectangle();
		this.tool.setFill(fill);
	}

}
