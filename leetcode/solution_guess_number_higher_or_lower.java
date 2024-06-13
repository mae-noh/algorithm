class GuessGame {
    private int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    /**
     *  @param num   your guess
     *  @return -1 if the picked number is lower
     *           1 if the picked number is higher
     *           0 if the picked number is equal
     */
    public int guess(int num) {
        if (num < pick) {
            return 1;
        } else if (num > pick) {
            return -1;
        } else {
            return 0;
        }
    }
}

 public class solution_guess_number_higher_or_lower extends GuessGame {
    public solution_guess_number_higher_or_lower(int pick) {
        super(pick); // 부모 클래스의 생성자를 호출하여 pick 값을 전달
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        
        while(left <= right) {
            int mid = (left+right)/2;
            // int mid = left+(right-left)/2;

            int result = guess(mid);
            System.out.println("left>" + left + " right>" + right + " mid>" + mid + " result>" + result);
            if(result == 0) return mid;
            if(result == -1) right = mid - 1;
            if(result == 1) left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example 1
        solution_guess_number_higher_or_lower solution1 = new solution_guess_number_higher_or_lower(6);
        int output1 = solution1.guessNumber(10);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        solution_guess_number_higher_or_lower solution2 = new solution_guess_number_higher_or_lower(1);
        int output2 = solution2.guessNumber(2);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        // Example 3
        solution_guess_number_higher_or_lower solution3 = new solution_guess_number_higher_or_lower(1702766719);
        int output3 = solution3.guessNumber(2126753390);
        System.out.println("Example 3");
        System.out.println("Output3: " + output3);       
    }
}
// https://leetcode.com/problems/guess-number-higher-or-lower/description/
