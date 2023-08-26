package Programmers;

import java.util.Arrays;

public class P0_배열뒤집기 {
	   public static int[] solution(int[] num_list) {
	        int answer[] = new int[num_list.length];
	        for (int i = 0; i < num_list.length; i++) {
	            answer[i] = num_list[num_list.length - i - 1];
	        }
	        return answer;
	    }

	    public static void main(String[] args) {
	        int[] answer = solution(new int[] { 1, 2, 3, 4, 5 });
	        System.out.println(Arrays.toString(answer));
	    }
	}
