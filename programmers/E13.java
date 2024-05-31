package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class E13 {

	public static int solution(int K, String[] user_scores) {
		int answer = 0;

		/*
		 * 점수가 높은 유저의 랭킹이 더 높습니다. 점수가 같다면 해당 점수를 먼저 달성한 유저의 랭킹이 높습니다. 어떤 유저가 이전 기록보다 더
		 * 높은 점수를 달성하면, 이전 기록은 사라지고 새로운 기록이 랭킹에 반영됩니다. 어떤 유저가 이전 기록보다 더 낮거나 같은 점수를 달성했다면
		 * 이 기록은 무시합니다.
		 */

		// 1. 공백으로 나누어 Map <key, value> 저장
		// 2. key가 없으면 삽입 count++
		// 2. key가 있는 경우?

		Map<String, Integer> rank = new HashMap<String, Integer>();
		List<Map.Entry<String, Integer>> entryList1 = new LinkedList<>(rank.entrySet());

		int count = K;
		for (int i = 0; i < user_scores.length; i++) {
			String[] user = user_scores[i].split(" ");

			String name = user[0];
			int score = Integer.parseInt(user[1]);

			System.out.println(name + " " + score);
			rank.put(name, score);

			List<Map.Entry<String, Integer>> entryList2 = new LinkedList<>(rank.entrySet());
			entryList2.sort(new Comparator<Map.Entry<String, Integer>>() {
				@Override
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return o2.getValue() - o1.getValue();
				}
			});

			System.out.println(rank.size() + " " + K);

			List<String> s1 = new ArrayList<>();
			List<String> s2 = new ArrayList<>();

			if (rank.size() > K) {
				entryList2.remove(K);

				for (Map.Entry<String, Integer> entry : entryList1) {
					s1.add(entry.getKey());
				}
				for (Map.Entry<String, Integer> entry : entryList2) {
					s2.add(entry.getKey());
				}
				
				for(int j=0; j<s1.size(); j++) {
					if(!s1.get(j).equals(s2.get(j))) count++;
				}
			}
		}

		answer = count;

		return answer;

	}

	//

	private static boolean isPossible(Map<String, Integer> rank, int score) {
		// TODO Auto-generated method stub

		return false;
	}

	public static void main(String[] args) {
		int K = 3;
		String[] user_scores = { "alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300",
				"cheries2 110" };
//		String[] user_scores = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"};
//		int K = 2;
//		String[] user_scores = {"cheries2 200", "alex111 100", "coco 150", "puyo 120"};

		System.out.println(solution(K, user_scores));
	}

}
