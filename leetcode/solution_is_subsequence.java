import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class solution_is_subsequence {

    public void recursive(String s, int index, StringBuilder cur, HashSet<String> set) {
        if(index == s.length()) {
            set.add(cur.toString());
            return;
        }        

        // 현재 문자를 선택하지 않고 다음 인덱스로 이동
        recursive(s, index + 1, cur, set);

        // 현재 문자를 선택하고 다음 인덱스로 이동
        cur.append(s.charAt(index));
        recursive(s, index + 1, cur, set);
        cur.deleteCharAt(cur.length()-1);
    }

    public boolean isSubsequence(String s, String t) {
        HashSet<String> set = new HashSet<>();
        StringBuilder current = new StringBuilder();

        // 문자열 s의 모든 부분 문자열을 생성하여 set에 추가
        recursive(s, 0, current, set);
        
        // 문자열 t가 생성된 부분 문자열 중에 포함되어 있는지 확인
        return set.contains(t);
    }

    public static void main(String[] args) {
        solution_is_subsequence solution = new solution_is_subsequence();
    
        // Example 1
        boolean output1 = solution.isSubsequence("abc", "ahbgdc");
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);        

        // Example 2
        boolean output2 = solution.isSubsequence("axc", "ahbgdc");
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);        
        
    }
}

// https://leetcode.com/problems/climbing-stairs/description/
