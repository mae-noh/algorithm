import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution_letter_combinations_of_a_phone_number {

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        char[][] dial = {
            {},
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
        };

        recursive(dial, digits, new StringBuilder(), list, 0);
        return list;
    }

    public void recursive(char[][] dial, String digits, StringBuilder s, List<String> list, int index) {
        if(index == digits.length()) {
            list.add(s.toString());
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(index));
        for(char ch : dial[digit]){
            s.append(ch);
            recursive(dial, digits, s, list, index+1);
            s.deleteCharAt(s.length()-1);
        }
    }

    public static void main(String[] args) {
        solution_letter_combinations_of_a_phone_number solution = new solution_letter_combinations_of_a_phone_number();
    
        // Example 1
        List<String> output1 = solution.letterCombinations("2");
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        List<String> output2 = solution.letterCombinations("23");
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

    }
}

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
