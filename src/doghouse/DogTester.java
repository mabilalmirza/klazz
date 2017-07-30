package doghouse;

public class DogTester {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		GermanShephered gs = new GermanShephered();
		Hound h = new Hound();
		KameenaKutta kk = new KameenaKutta();
		
		Dog[] dogHouse = new Dog[4];
		dogHouse[0] = d;
		dogHouse[1] = gs;
		dogHouse[2] = h;
		dogHouse[3] = kk;
		
		
		for (int i = 0; i < dogHouse.length; i++) {
			Dog dog = dogHouse[i];
			dog.bark();
		}
		
	}

}
