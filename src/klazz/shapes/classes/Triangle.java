package klazz.shapes.classes;

public class Triangle extends Shape {
	
	private int length;
	private int width;
	
	@Override
	double calculateArea() {
		return 0.5 * length * width;
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
