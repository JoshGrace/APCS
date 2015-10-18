/**
*This program expects 2 command-line arguments -- a person's
*first name and list name fo example: C:/mywork> java Greetings Annabel Lee
*/
public class Greetings{
	public static void main(String[] args){
		String firstname = args[0];
		String lastname = args[1];
		System.out.println("Hello " + firstname + " " + lastname);
		System.out.println("Congratulations on your second program!");
	}
}