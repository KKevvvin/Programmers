package Programmers;

import java.util.Arrays;

public class P0_짝수홀수 {
	
	public static void main(String[] args) {
		int[] answer = solution1(new int[] {1,2,3,4,5});
		System.out.println(Arrays.toString(answer));
	}

	
	
	    //나의 문제풀이 
	    public static int[] solutionYE(int[] num_list) {
	        int evenNum = 0; //짝수
	        int oddNum = 0; //홀수 
	        for(int i = 0; i < num_list.length; i++){
	            if(num_list[i] %2 ==0) evenNum++;
	            else oddNum++;
	        }
	        int[] answer = new int[2];
	        answer[0] = evenNum;
	        answer[1] = oddNum;

	        return answer;
	    }
	    
	    
		//재밌는  문제풀이 
	    public static int[] solution1(int[] num_list) {
	        int[] answer = new int[2];

	        for(int i = 0; i < num_list.length; i++)
	            answer[num_list[i] % 2]++;

	        return answer;
	    }
	
	
	
}
