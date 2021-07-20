package reverse_string;

public class Result {

	public static void main(String[] args) {
		
		Soulution sol = new Soulution();
		char[] charArray1 = new char[5];
		charArray1[0] = 'h';
		charArray1[1] = 'e';
		charArray1[2] = 'l';
		charArray1[3] = 'l';
		charArray1[4] = 'o';
		
		char[] charArray2 = new char[6];
		charArray2[0] = 'H';
		charArray2[1] = 'A';
		charArray2[2] = 'N';
		charArray2[3] = 'n';
		charArray2[4] = 'a';
		charArray2[5] = 'h';
		
		sol.reverseString(charArray1);
		sol.reverseString(charArray2);
	}

}
