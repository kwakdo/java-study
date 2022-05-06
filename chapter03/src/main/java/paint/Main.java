package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(20);
		point1.setY(10);
<<<<<<< HEAD
		
		point1.show();
	}
	
	//public static void drawPoint(Point point) 
		
}

=======

		// point1.show();
		drawPoint(point1);

		Point point2 = new Point(50, 100);
		drawPoint(point2);
		point2.show(false);

		Point point3 = new ColorPoint(40, 50, "red");
		drawPoint(point3);
		// point3.show(true);
		
		Triangle triangle = new Triangle();
		drawShape(triangle);
	
		Rectangle rectangle = new Rectangle();
		drawShape(rectangle);
		
		Circle circle = new Circle();
		drawShape(circle);
		}
	private static void drawTriangle(Triangle triangle) {
		
	}

	public static void drawPoint(Point point) {
		point.show();
	}
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	// Triangle triangle = new drawPoint(Point point) {
	//	point.show();
	// }
	// private static void drawColorPoint(ColorPoint point) {
	// point.show();

	// }
	public static void drawRectangle(Rectangle rectangle){
		
	}
}
>>>>>>> refs/remotes/origin/master
