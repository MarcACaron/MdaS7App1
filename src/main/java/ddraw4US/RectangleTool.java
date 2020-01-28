package ddraw4US;

import models.CustomRectangle;

public class RectangleTool extends Tool {

	public RectangleTool() {
		this.tool = new CustomRectangle();
	}

	@Override
	public void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		double posX;
		double posY;
		double width;
		double height;
		if(startFromCenter) {

			posX = Math.min(posXEnd, 2*posXStart-posXEnd);
			posY = Math.min(posYEnd, 2*posYStart-posYEnd);
			width = Math.abs(2*(posXEnd-posXStart));
			height = Math.abs(2*(posYEnd-posYStart));
		}else {
			posX = Math.min(posXStart, posXEnd);
			posY = Math.min(posYStart, posYEnd);
			width = Math.abs(posXEnd - posXStart);
			height = Math.abs(posYEnd - posYStart);
		}
		((CustomRectangle) this.tool).setX(posX);
		((CustomRectangle) this.tool).setY(posY);
		((CustomRectangle) this.tool).setWidth(width);
		((CustomRectangle) this.tool).setHeight(height);
	}

	@Override
	public void reset() {
		this.tool = new CustomRectangle();
		this.fillShape();
		this.tool.setStroke(stroke);
		this.tool.setStrokeWidth(lineWidth);
	}

}
