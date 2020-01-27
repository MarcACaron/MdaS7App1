package ddraw4US;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;

public abstract class Tool {
	public static Paint fill;
	protected Shape tool;
	
	public Tool() {
	}
	
	public Tool(Shape tool) {
		this.tool = tool;
	}
	
	public abstract void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd);
	
	public void fillShape(Paint paint) {
		if(this.tool!=null) {
			this.tool.setFill(paint);
		}
	}
	public abstract void reset();
	public Shape getTool() {
		return tool;
	}

	public void setTool(Shape tool) {
		this.tool = tool;
	}	
}
