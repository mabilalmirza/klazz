package klazz.shapes.classes;

public class Circle extends Shape {

	private int radius;
	
	@Override
	double calculateArea() {
		return (2 * 3.14 * radius);
	}
	
	@Override
	public void printDescription() {
		System.out.println("I am a Circle");
	}
	
	public void printSomething() {
		System.out.println("Here's something");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
