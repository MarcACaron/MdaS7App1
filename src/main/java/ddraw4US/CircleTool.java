package ddraw4US;

import java.util.function.Function;

import javafx.scene.Node;
import javafx.scene.shape.Shape;
import models.CustomCircle;
import models.CustomRectangle;
import view.DetailPaletteController;

public class CircleTool extends Tool{

	public CircleTool() {
		this.tool = new CustomCircle();
	}

	public void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd) {
		double radius;
		if(startFromCenter){
			radius = Math.sqrt(Math.pow(posXEnd-posXStart, 2)+Math.pow(posYEnd-posYStart, 2));
			((CustomCircle) this.tool).setCenterX(posXStart);
			((CustomCircle) this.tool).setCenterY(posYStart);
			((CustomCircle) this.tool).setRadius(radius);
		}else {
			radius = Math.sqrt(Math.pow(posXEnd-posXStart,2)+Math.pow(posYStart-posYEnd,2))/2;
			double cX = (posXEnd+posXStart)/2;
			double cY = (posYEnd+posYStart)/2;
			((CustomCircle) this.tool).setCenterX(cX);
			((CustomCircle) this.tool).setCenterY(cY);
			((CustomCircle) this.tool).setRadius(radius);
		}
		
	}
	
	@Override
	public void reset() {
		this.tool = new CustomCircle();
		this.fillShape();
		this.tool.setStroke(stroke);
		this.tool.setStrokeWidth(lineWidth);
	}

	@Override
	public Function fillDetails(DetailPaletteController pc, Shape nd) {
		return (y) -> {
			pc.select(true, true, false, true, true);
			CustomCircle circle = (CustomCircle)nd;
			pc.setTextField(circle.getCenterX(), circle.getCenterY(), 0.0, 0.0, circle.getRadius(), 0.0, circle.getRotate());
			return y;
			};
	}

	@Override
	public void setXPosTool(double value) {
		((CustomCircle)tool).setCenterX(value);
	}

	@Override
	public void setYPosTool(double value) {
		((CustomCircle)tool).setCenterY(value);
	}

	@Override
	public void setWidthTool(double value) {
	}

	@Override
	public void setHeightTool(double value) {
	}

	@Override
	public void setRadiusTool(double value) {
		((CustomCircle)tool).setRadius(value);
	}

	@Override
	public void setLengthTool(double value) {
	}
}
