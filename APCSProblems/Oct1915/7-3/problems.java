public class problems{
	public static void main(String[] args){
		int[] thin = createWedge(8);
		for(int z= 0; z < thin.length; z++){
			System.out.println(thin[z]);
		}
		System.out.println(computeScore("abcdefghijklmnopqrstuvwxyz"));
	}
	public static int[] createWedge(int n){
		int[] returnVal = new int[(n*2)-1];
		for(int i = 1; i < n+1; i++){
			returnVal[i-1] = i;
		}
		for(int i = 0; i < n; i++){
			returnVal[n + i-1] = n-i;
		}
		return returnVal;
	}
	public static int computeScore(String word){// i'm going to comment the code because it is very weird
		int[] numLetters = new int[27];
		char thing;
		int score = 0;
		String word2;
		int ot;
		for(int i = 0; i < 26; i++){//run through all letters
			ot = (int)97+i; // take ascii value of char and makes it char
			thing = (char)ot; // somehow prevents the lossy convertion error again no clue why
			word2 =  word.replaceAll(Character.toString(thing), ""); // replaces all of char i with nothing 
			numLetters[i] = word.length() - word2.length(); //compares length to find amount of chars
		}
		
		score = (1*numLetters[0]) + score;
		score = (3*numLetters[1]) + score; // takes amount of each char mults by char score and add to score
		score = (3*numLetters[2]) + score;
		score = (2*numLetters[3]) + score;
		score = (1*numLetters[4]) + score;
		score = (4*numLetters[5]) + score;
		score = (2*numLetters[6]) + score;
		score = (4*numLetters[7]) + score;
		score = (1*numLetters[8]) + score;
		score = (8*numLetters[9]) + score;
		score = (5*numLetters[10]) + score;
		score = (1*numLetters[11]) + score;
		score = (3*numLetters[12]) + score;
		score = (1*numLetters[13]) + score;
		score = (1*numLetters[14]) + score;
		score = (3*numLetters[15]) + score;
		score = (10*numLetters[16]) + score;
		score = (1*numLetters[17]) + score;
		score = (1*numLetters[18]) + score;
		score = (1*numLetters[19]) + score;
		score = (1*numLetters[20]) + score;
		score = (4*numLetters[21]) + score;
		score = (4*numLetters[22]) + score;
		score = (8*numLetters[23]) + score;
		score = (4*numLetters[24]) + score;
		score = (10*numLetters[25]) + score;

		return score;
	}
}