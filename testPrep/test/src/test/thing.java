package test;

import java.util.ArrayList;

public class thing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message();
	}
	static ArrayList <String> climbList;
	public static void message(){
		climbList = new ArrayList <String>();
		climbList.add("algonquin");
		climbList.add("monadock");
		climbList.add("monadock");
		climbList.add("whiteface");
		addClimb("mona");
		for(String s : climbList){
			System.out.println(s);
		}
	}
	public static void addClimb(String peakName) {   
		for (int i = 0; i < climbList.size(); i++) {   
			System.out.println(peakName.compareTo(climbList.get(i)) );
			if (peakName.compareTo(climbList.get(i)) <= 0) {          
				climbList.add(i, peakName);          
				return;       
			}    
		}    
		climbList.add(peakName);
		}
}
