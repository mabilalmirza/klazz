package klazz.shapes.classes;

public class Circle extends Shape {

	private int radius;
	
	@Override
	double calculateArea() {
		return (2 * 3.14 * radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
