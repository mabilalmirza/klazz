import java.util.Scanner;

public class Chawal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = "yes";
		
		do {
			System.out.print("Are you idiot? ");
			input = scanner.nextLine();
			
		} while(!"yes".equals(input));
		
		System.out.println("Idiot e oye...");
		
		scanner.close();
		
	}
	
}
