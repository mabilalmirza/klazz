import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner table = new Scanner(System.in);
		int no = 1 ;
		
		 do {
			System.out.print("Table of (Enter -1 to quit): ");
			no = table.nextInt();
				 
			if (no > 0)  {
				for (int i = 1; i <= 10 ; i++) {
					int z = no * i ;
					System.out.println( no + " X " + i +" = " + z);
				}
			}
			
		} while(no > 0) ;
		 
		table.close() ;
		System.out.print("The End");
		
		}	
		
	}