package ddraw4US;

import java.util.function.Function;

import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import view.DetailPaletteController;

public abstract class Tool {
	public static Paint fill;
	public static String fillName;
	public static Paint stroke;
	public static double lineWidth;
	public static double lineStyle;
	public static boolean startFromCenter;
	public Shape tool;
	
	public Tool() {
	}
	
	public Tool(Shape tool) {
		this.tool = tool;
	}
	
	public abstract void ajustOnDrag(double posXStart, double posYStart, double posXEnd, double posYEnd);
	
	public void fillShape() {
		if(this.tool!=null) {
			this.tool.setFill(fill);
			this.tool.setAccessibleText(fillName);
		}
	}
	public abstract void reset();
	public Shape getTool() {
		return tool;
	}

	public void setTool(Shape tool) {
		this.tool = tool;
	}
	
	public abstract void setXPosTool(double value);
	public abstract void setYPosTool(double value);
	public abstract void setWidthTool(double value);
	public abstract void setHeightTool(double value);
	public abstract void setRadiusTool(double value);
	public abstract void setLengthTool(double value);
	public void setAngleTool(double value) {
		tool.setRotate(value);
	}
	
	public abstract Function fillDetails(DetailPaletteController paletteDetailController, Shape nd);
}
