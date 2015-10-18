import java.util.*;

public class Dollars {
	static Scanner console = new Scanner(System.in); 
	public static void main(String[] args){
		double amount;
		int dollars; 
		int cents;
		System.out.println("What is the amount of money?");
		amount = console.nextDouble();
		dollars = (int) ((amount/100) + 0.5);
		cents = (int) ((amount % 100) + 0.5);
		System.out.println( dollars + " dollars and " + cents + " cents");
	}
}