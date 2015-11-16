package codingBat;

public class problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//plusOut("12xy34", "xy");
	//	plusOut("12xy34xyabcxy", "xy");
	//	plusOut("abXYabcXYZ", "abc");
	//	plusOut("abXYxyzXYZ", "XYZ");
	//	plusOut("aaxxxxbb", "xx");
	//	plusOut("123123", "3");
		xyzMiddle("AxyzBBB");
	}
	public static boolean xyzMiddle(String str) {
			String wI = str;		  
        if(str.length() > 5){
        	wI = str.substring(str.length()/2-2, str.length()/2+2);  
        } 
        String wO = wI.replace("xyz" , "");
        int place = str.indexOf("xyz")+1;
       	int mid = wO.length()/2;
       	boolean returnVal = false;
       	System.out.println(place + " " + mid + " " + (mid+1) + " " + (mid-1));
       	if(place < mid + 2 && place > mid - 2){
        	returnVal = true;
        }
       	if(str.length() < 3){
       		returnVal = false;
       	}
     	System.out.println(returnVal);
        return returnVal;
	}
	public static String plusOut(String str, String word) {
		  String returnVal = "";
		  int i = 0;
		  int previ = 0;
		  String cont1;
		  String cont2;
		  while(i < str.length()-1){
			  cont1 = str.substring(i, i+word.length());
			  if(cont1.equals(word)){
				  returnVal = returnVal + str.substring(i, i+word.length());
				 // System.out.println(returnVal);
				  System.out.println(i);
				  previ = i+word.length();
				  i += word.length();
			  } else {
				  returnVal = returnVal + "+";
				  //System.out.println(returnVal);
				  System.out.println(i);
				  i++;
		   }
		  }
		  System.out.println(returnVal + "  final");  
		  return returnVal;
		    
		}

}
