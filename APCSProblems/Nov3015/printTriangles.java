import java.util.Arrays;

public class printTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangles(5);
	}
		public static String Triangles( int n){
			if(n == 0){
				 return ""; 
			 }
			return(Triangles(n-1) + "*");
		}
	}