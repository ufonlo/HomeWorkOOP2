package rectangle;

import java.util.ArrayList;

public class RectangleRunner {
	public static void main(String[] args) {
		Rectangles rectangles = new Rectangles();
		Rectangles rectanglesTwo = new Rectangles();

		Rectangle rectangleOne = new Rectangle(2.0, 3.0);
		Rectangle rectangleTwo = new Rectangle(5.0, 6.0);
		Rectangle rectangleThird = new Rectangle(11.0, 4.0);

		rectangles.addRectangel(rectangleOne);
		rectangles.addRectangel(rectangleTwo);
		System.out.println("Test perimeter is: " + rectangleOne.perimeter());
		System.out.println("First areas are: " + rectangles.sumOfRectanglesAreas());

		rectanglesTwo.addRectangel(rectangleThird);
		System.out.println("Second areas are: " + rectanglesTwo.sumOfRectanglesAreas());

	}
}
