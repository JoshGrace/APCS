/**
*This program prompts the user to enter his or her first name and last name
*and displays a message
*/
import java.util.Scanner;

public class Greetings2 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		System.out.println("enter your first name: ");
		String firstName = kboard.nextLine();
		System.out.println("enter your last name: ");
		String lastName = kboard.nextLine();
		System.out.println("Hello, " + firstName + " " + lastName);
		System.out.println("Welcome to Java!");
		kboard.close();

	}
}