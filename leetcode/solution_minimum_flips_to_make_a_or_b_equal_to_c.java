class solution_minimum_flips_to_make_a_or_b_equal_to_c {

    public int minFlips(int a, int b, int c) {
        int bitFlip = 0;
        for(int i=0; i<32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;
            if((bitA|bitB) == bitC) continue;
            if((bitC == 0) && (bitA == 1) && (bitB == 1)) {
                bitFlip += 2;
            } else {
                bitFlip++;
            }
        }
        return bitFlip;
    }

    public static void main(String[] args) {
        solution_minimum_flips_to_make_a_or_b_equal_to_c solution = new solution_minimum_flips_to_make_a_or_b_equal_to_c();
    
        // Example 1
        int output1 = solution.minFlips(2,6,5);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.minFlips(4,2,7);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        // Example 3
        int output3 = solution.minFlips(7,3,9);
        System.out.println("Example 3");
        System.out.println("Output3: " + output3);
    }
}

// https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/
