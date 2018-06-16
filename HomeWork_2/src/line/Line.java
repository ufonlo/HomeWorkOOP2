package line;

public class Line {
	private final Point startPoint;
	private final Point endPoint;
	private final String name;
	
	public Line(double xForStartPoint,double yForStartPoint,double xForEndPoint,
			double yForEndPoint,String name) {
		startPoint = new Point(xForStartPoint,yForStartPoint);
		endPoint = new Point(xForEndPoint,yForEndPoint);
		this.name = name;
	}
	public double lenghtOfLine() {
		return Math.sqrt((Math.pow((endPoint.getX() - startPoint.getX()), 2) + 
				Math.pow((endPoint.getY() - startPoint.getY()), 2)));
	}
	public String getName() {
		return name;
	}

}

