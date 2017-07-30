package klazz.shapes.classes;

public class ShaperTester {
	
	public static void main(String[] args) {
		
		Shape[] box = createShapes();
		
		printArea(box);
		
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
	
		Shape shape = new Shape();
		
		Shape[] box = new Shape[4];
		box[0] = circle;
		box[1] = rectangle;
		box[2] = triangle;
		box[3] = shape;
		
		return box;
	}
	
	static void printArea(Shape[] box) {
		
		
		for (int i = 0; i < box.length; i++) {
			Shape s = box[i];
			
			try {
				System.out.println(s.calculateArea());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
		
		//Eclipse: SHIFT + CTRL + / to comment
		
		/*for (int i = 0; i < box.length; i++) {
			Shape s = box[i];
			
			if (s instanceof Circle) {
				
				Circle c = (Circle) s;
				System.out.println(c.calculateArea());
				
			} else if (s instanceof Rectangle) {
				
				Rectangle r = (Rectangle) s;
				System.out.println(r.calculateArea());
			
			} else if (s instanceof Triangle){
				
				Triangle t = (Triangle) s;
				System.out.println(t.calculateArea());
			
			} else {
				System.out.println("Type not supported");
			}
		}*/
		
	}
	
	

}
