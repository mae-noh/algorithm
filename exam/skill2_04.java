package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class skill2_04 {

	public static void main(String[] args) {
		
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		System.out.println(Arrays.toString(solution(5, words)));
		
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        int num = 0;
               
        for(int i=0; i<words.length; i++) {
        	// 중복된 단어가 나오는 경우.
        	if(list.contains(words[i])) {
        		num = i; break;
        	}
        	if(!list.contains(words[i])) list.add(words[i]);
        	
        	// 끝단어로 시작 안하는 경우.
        	int last = words[i].length()-1;
        	if(i+1 < words.length && words[i].charAt(last) != words[i+1].charAt(0)) {
        		num = i+1; break;
        	}        		
        }
        
        if(num != 0) {
        	answer[0] = num % n + 1;
        	answer[1] = num / n + 1;
        }

        return answer;
    }

}
