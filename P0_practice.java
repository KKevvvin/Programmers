package Programmers;

public class P0_practice {
	public static void main(String[] args) {
		System.out.println(solution2("nice to meet"));
	}

	public static String solution(String my_string) {
		String[] vowel = { "i", "o", "e", "u" };
		for (int j = 0; j < vowel.length; j++) {
			my_string = my_string.replace(vowel[j], "");
		} 
		String answer = my_string;
		return answer;
	}
	
	public static String solution2(String mystring) {
		return mystring.replaceAll("[aeiou]","");
	}

}
