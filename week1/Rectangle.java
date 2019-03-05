package week1;
/*this is the first week of CS_570
introduction to JAVA, syntax and etc
*/
public class Rectangle {
	// data field
	private double width;
	private double height;

	// constructor
	public Rectangle(double x, double y) {
		width = x;
		height = y;
	};

	// methods
	public double area() {
		return width * height;
	}

	public static double distance(Rectangle a, Rectangle b) {
		double x2 = (a.width - b.width) * (a.width - b.width) + (a.height - b.height) * (a.height - b.height);
		double x = Math.sqrt(x2);
		return x;
	}

	// Accessor + modifier
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	//toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
}
