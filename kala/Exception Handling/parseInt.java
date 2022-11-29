import java.util.Scanner;

public class ParsingInt {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter any number: ");
			try {
				number = Integer.parseInt(sc.next());
				System.out.println("You Entered: " + number);
				break;
			}
			catch ( NumberFormatException e) {
				System.out.println("NumberFormatException Occured");
			}
			
		}
		
	}
	
}
