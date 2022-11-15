package mumbaiADSPaper;

public class StringDuplicate {
	public static String removeDuplicate(String input,int index){
		if(index == input.length()-1) return input.charAt(index)+"";
		String remainingString = removeDuplicate(input,index+1);
		if(input.charAt(index) == remainingString.charAt(0)) {
			
			return remainingString;
			
		}else {
			return input.charAt(index) + remainingString;
		}
	}

	public static void main(String[] args) {
//		String input = "aabccba";
		String input = "xxxyyyzwwzzz";
		System.out.println(removeDuplicate(input,0));
	}

}
