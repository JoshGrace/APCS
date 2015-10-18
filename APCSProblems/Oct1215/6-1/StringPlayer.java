//Student name: Josh Grace
//Class: Java AP
//Date: Oct 17 15
//Assignment 1-6-1, Exercise 4
//Method StringPlayer: Given a string variable this method computes the length of the string

public class StringPlayer{
	public static void main(String[] args){
		String str;
		int len;
		str = new String("Glory be to the Father, and to the Son, and to the Holy Spirit, As it was in the beginning, is now and ever shall be, world without end…Amen.");
		len = str.length();
		System.out.println("The length is: " + len);
	}
}