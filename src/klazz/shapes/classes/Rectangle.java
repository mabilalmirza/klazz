package klazz.shapes.classes;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	@Override
	double calculateArea() {
		return length * width;
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
