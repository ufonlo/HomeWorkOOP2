package rectangle;

public class Rectangle {
	private final double width;
	private final double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}
}
