package ddraw4US;

import models.CustomCircle;

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
	public void fillDetails(String a) {
		// TODO Auto-generated method stub
		
	}

}
