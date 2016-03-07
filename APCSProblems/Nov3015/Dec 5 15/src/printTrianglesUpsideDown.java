import java.util.Arrays;

public class printTrianglesUpsideDown {
	static int i = 0;
	static String x;
	public static String printTriangles( int n){
		char[] things = new char[n];
		Arrays.fill(things, '*');
		x = new String(things);
		return printTriangles(x);
	}
	public static String printTriangles( String n){
		if(n.length() == 0){
			 return ""; 
		 }
		return(printTriangles(n.substring(1, n.length())));
	}
}
