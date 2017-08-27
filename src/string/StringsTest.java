package string;

public class StringsTest {
	
	public static void main(String[] args) {
		
		int id = 10;
		String name = "Muhammad Bilal";
		String city = "Lahore";
				
		String description = String.format("My name is %S, I live in %S. My identification number is %d%n", name, city, id);
		
		System.out.print(description);
		System.out.printf("My name is %S, I live in %S. My identification number is %d%n", name, city, id);
		
		int length = name.length();
		System.out.println(length);
		
		char c = name.charAt(0);
		System.out.println(c);
		
		int unicode = name.codePointAt(0);
		System.out.println(unicode);
		
		String concatinated = name.concat("gobhi");
		System.out.println(concatinated);
		
		int index = name.indexOf("a");
		System.out.println(index);
		
		int index2 = name.indexOf("a", 4);
		System.out.println(index2);
		
		int lastIndex = name.lastIndexOf("a");
		System.out.println(lastIndex);
		
		int indexOfBil = name.indexOf("Bil");
		System.out.println(indexOfBil);
		
		
		String spacy = "              Talha           Huzaifa        ";
		System.out.println(spacy.trim());
		
		String substring = name.substring(3, 10);
		System.out.println(substring);
		
	}

}
