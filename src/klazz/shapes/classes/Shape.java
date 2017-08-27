package klazz.shapes.classes;

public abstract class Shape extends Object {
	
	abstract double calculateArea() throws Exception;
	
	
	public void printDescription() {
		System.out.println("I am a shape");
	}
	
	@Override
	public String toString() {
		return "Hi there, this is shape";
	}

}
