import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addIntUnder10();
	}
	public int addOdds(int n){
		for(int i = 1; i < n; i += 2){
			System.out.println(n);
		}
		return n;	
	}
	public int addIntUnder10(){
		int x = 0;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a positive integar under 10: ");
		int n = console.nextInt();
		for(int i = 1; i < n + 1; i++){
			x += i;
			if(i == n){
			
				System.out.print(i + " = " + x);
			} else {
				System.out.print(i + " + ");
			}
		}
		return x;
	}
}
