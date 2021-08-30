package programmers;

public class E05 {

	public static void main(String[] args) {
		String[] scores = {"BCD","ABB","FEE"};
		
		System.out.println(solution(scores));
	}
	
	public static int solution(String[] scores) {
        int answer = 0;
        
        for(int i=0; i<scores.length; i++) {
        	
        	int countA = 0;
        	int countF = 0;
        	int sum = 0;
        	double avg = 0;
        	int max = 0;
        	int min = 'A';
        	
        	for(int j=0; j<scores[i].length(); j++) {
        		if(scores[i].charAt(j) == 'F') countF++;
        		if(scores[i].charAt(j) == 'A') countA++;
        		
        		int num = 'F' - scores[i].charAt(j);
        		sum += num;
        		if(max < num) max = num; 
        		if(min > num) min = num;
        	}
        	
        	if(countF >= 2) continue;
        	if(countA >= 2) {
        		answer++;
        		continue;
        	}
        	
        	sum -= max;
        	sum -= min;        	
        	avg = (double)sum / (scores[i].length()-2);

        	if(avg >= 3) answer++;
        }
        
        return answer;
    }
	
}
