package klazz.shapes;

public class ShaperTester {
	
	public static void main(String[] args) {
		
		Shape circle = new Shape();
		circle.setType(Shape.CIRCLE_TYPE);
		
		try {
			circle.setRadius(2);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(circle.calculateArea());
		
		Shape rectangle = new Shape();
		rectangle.setType(Shape.RECTANGLE_TYPE);
		try {
			rectangle.setWidth(10);
			rectangle.setLength(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(rectangle.calculateArea());
		
		
		Shape triangle = new Shape();
		triangle.setType(Shape.TRIANGLE_TYPE);
		try {
			triangle.setRadius(1);
			
			System.out.println(triangle.calculateArea());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
