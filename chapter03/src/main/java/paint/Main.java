package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(20);
		point1.setY(10);

		//point1.show();
		drawPoint(point1);

		Point point2 = new Point(50, 100);
		drawPoint(point2);
		point2.show(false);
	}
	

	public static void drawPoint(Point point) {
		point.show();
	}
}
