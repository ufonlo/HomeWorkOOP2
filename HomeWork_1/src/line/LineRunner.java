package line;

public class LineRunner {
	public static void main(String[] args) {
        Lines lines = new Lines();
        Line lineOne = new Line(1, 2, 3.5, 6.0, "LineOne");
        Line lineTwo = new Line(10, 22.5, 3.5, 6.0, "LineTwo");
        Line lineThree = new Line(5, 2.5, 7.5, 7.0, "LineThree");
        lines.addLine(lineOne);
        lines.addLine(lineTwo);
        lines.addLine(lineThree);

        System.out.println("Longest line is: " + lines.longesLine().getName());
        System.out.println("Length of second line is: " + lineTwo.lenghtOfLine());
    }

}
