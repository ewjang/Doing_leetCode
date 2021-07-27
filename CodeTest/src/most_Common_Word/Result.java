package most_Common_Word;

public class Result {
	
	public static void main(String[] args) {
		
		Solution solution =new Solution();
		
		String para = "`Bob hit a ball, the hit BALL flew far after it was hit.'";
		String [] banned = {"hit"};
		System.out.println(solution.mostCommonWord(para, banned));
	}

}
