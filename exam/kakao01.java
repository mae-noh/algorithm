package exam;

public class kakao01 {
	
	public static void main(String[] args) {
		int[] gift_cards = {5, 4, 5, 4, 5};
		int[] wants = {2, 4, 4, 5, 1};
		System.out.println(solution(gift_cards, wants));
	}
	
	public static int solution(int[] gift_cards, int[] wants) {
        int answer = gift_cards.length;
        int[] count = new int[100001];
        for(int i=0; i<gift_cards.length; i++) {
        	count[gift_cards[i]]++;
        }
        for(int i=0; i<wants.length; i++) {
        	if(count[wants[i]] > 0) {
        		count[wants[i]]--;
        		answer--;
        	}
        }
        return answer;
    }
}
