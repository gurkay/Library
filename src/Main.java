import java.util.Scanner;

public class Main {

	private static Scanner input;
	
	public static void main(String[] args) {
		InterfaceLibrary bookObject = new DataBaseClass();
		input = new java.util.Scanner(System.in);
		
		boolean condition = true;
		
		do {
			System.out.println("Home Work 3");
			System.out.println("-----------");
			System.out.println("Press A to insert a book");
			System.out.println("Press D to delete a book");
			System.out.println("Press X to all display all books");
			System.out.println("Press L to display books of an author");
			System.out.println("Press M to display books with a keyword");
			System.out.println("Press Q to exit");
			System.out.print("Your choice: ");
			
			String key = input.next();
			char ch = key.charAt(0);
			
			switch (ch) {
			
			case 'A':
				
				String inputValues = input.nextLine();
				bookObject.inputValuesEnter(inputValues);
				
				break;

			case 'D':
				
				break;
				
			case 'X':

				bookObject.allTheBookNames();
				break;
				
			case 'L':

				
				break;
				
			case 'M':

				
				break;					
			case 'Q':
				condition = false;
				break;	
				
			default:
				System.out.println("Please enter Char only A, D, X, and Q");
				condition = true;
			}			
		} while (condition);

		System.exit(1);
	}

}


