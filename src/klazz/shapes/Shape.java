package klazz.shapes;

public class Shape {
	
	public static final String RECTANGLE_TYPE = "rectangle";
	public static final String TRIANGLE_TYPE = "triangle";
	public static final String CIRCLE_TYPE = "circle";
	
	private String type;	//circle, rectangle, triangle
	
	//for circle
	private int radius;
	
	//for ractangle/triangle
	private int length;
	private int width;
	
	double calculateArea() {
		
		double area;
		
		if ("circle".equals(type)) {
			area = 2 * 3.14 * radius;
			
		} else if (RECTANGLE_TYPE.equals(type)){
			area = length * width;
			
		} else {
			area = 1.0/2 * length * width;
		}
		
		return area;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception {
		if (CIRCLE_TYPE.equals(type)) {
			this.radius = radius;
		} else {
			throw new Exception("invalid type for radius");
		}
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) throws Exception {
		if (RECTANGLE_TYPE.equals(type) || TRIANGLE_TYPE.equals(type)) {
			this.length = length;
		} else {
			throw new Exception("Invalid type for length");
		}
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws Exception {
		if (RECTANGLE_TYPE.equals(type) || TRIANGLE_TYPE.equals(type)) {
			this.width = width;
		} else {
			throw new Exception("Invalid type for width");
		}
	}
	
	//Error => 1/0,
	//Exception
	

}
