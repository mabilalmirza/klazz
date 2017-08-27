package klazz.shapes.classes;

public class Triangle extends Shape {
	
	private int length;
	private int width;
	
	@Override
	double calculateArea() {
		return 0.5 * length * width;
	}
	
	@Override
	public void printDescription() {
		System.out.println("I am a triangle. See what I do.");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
