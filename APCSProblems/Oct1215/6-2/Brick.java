//Student Name: josh grace 
//Class: Java AP 
//Date: Oct 17 15
//Assignment 1-12, Exercise 1
//Method Brick: Given the number of seconds, this method computes the speed of a 
//falling brick (in feet per second). 

import java.util.*; 
public class Brick { 
static Scanner console = new Scanner(System.in); 
public static void main (String[] args) { 
 		double v;
		double g; 
		double t;
       	g=32.174;
		System.out.println("The time of the falling object?");
		t = console.nextDouble();
		v = g*(t*t)/2;
		System.out.println("The velocity of the falling object is " + v + " Feet per second");
	}
}
