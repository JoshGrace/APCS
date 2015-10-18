import java.util.*;

public class CircleArea {
	static Scanner console = new Scanner(System.in); 
	public static void main(String[] args){
		double r;
		double PI = 3.14159; 
		double a;
		System.out.println("The radius of the circle?");
		r = console.nextDouble();
		a = r*r*PI;
		System.out.println("The area of the circle is: " + a);
	}
}