public int addOdds(int n){
	for(int i = 1; i < n; i += 2){
		System.out.println(n);
	}
	return n;	
}

public static addIntUnder10(){
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
}