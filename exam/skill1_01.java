package exam;

public class skill2_01 {
	
	public static void main(String[] args) {
		String[] arr = {"Jane","Kim"};
		System.out.println(solution(arr));
	}
	
	public static String solution(String[] seoul) {
        String answer = "김서방은 ";
        
        int rank = 0;
        
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		rank = i;
        		break;
        	}
        }
        
        answer += rank + "에 있다";
        
        return answer;
    }
	
}
