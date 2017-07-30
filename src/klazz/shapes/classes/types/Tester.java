package klazz.shapes.classes.types;

public class Tester {
	
	
	public static void main(String[] args) {
		
		Human[] bus = new Human[5];
		
		Human a = new AsianHuman();
		bus[0] = a;
		
		Human b = new AfricanHuman();
		bus[1] = b;
		
		Human c = new EuropeanHuman();
		bus[2] = c;
		
		Human d = new Human();
		bus[3] = d;
		
		Human e = new AsianHuman();
		bus[4] = e;
	}
	

}
