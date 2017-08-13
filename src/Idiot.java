import java.util.Scanner;

public class Idiot {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String input = "yes";
		
		while(!"yes".equals(input)) {
			System.out.print("Are you idiot? ");
			input = scanner.nextLine();
		}
		
		System.out.println("Idiot e oye...");
		
		scanner.close();
	}
	
	

}
