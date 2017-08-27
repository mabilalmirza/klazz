package klazz.shapes.classes;

public class ShaperTester {
	
	public static void main(String[] args) {
		
		Shape[] box = createShapes();
		
		printArea(box);
		
		Shape s1 = new Circle();
		s1.printDescription();
		
		Shape s2 = new Rectangle();
		s2.printDescription();
		
		Shape s3 = new Triangle();
		s3.printDescription();
		
		
		Object o1 = s1;
		Object o2 = s2;
		Object o3 = s3;
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		
	}
	
	static Shape[] createShapes() {
		
		Circle circle = new Circle();
		circle.setRadius(2);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(10);
		rectangle.setWidth(5);
		
		Triangle triangle = new Triangle();
		triangle.setLength(10);
		triangle.setWidth(5);
		
		LangraAam a = new LangraAam();
		
		Shape[] box = new Shape[100];
		box[0] = circle;
		box[1] = rectangle;
		box[2] = triangle;
		box[3] = a;
		
		return box;
	}
	
	static void printArea(Shape[] box) {
		
		for (int i = 0; i < box.length; i++) {
			Shape s = box[i];
			
			try {
				System.out.println(s.calculateArea()); //polymorphism
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
	

}
