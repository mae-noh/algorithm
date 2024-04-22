class Solution {
    public String zigzagConversion (String s, int numRows) {
        int length = s.length();
        int row = 0;
        boolean flag = false;

        if (numRows == 1) {
            return s;
        }        

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        for (int i = 0; i < length; i++) {
            rows[row].append(s.charAt(i));

            if (row == numRows - 1) {
                flag = true;
            }
            if (row == 0) {
                flag = false;
            }
            row = flag ? row - 1 : row + 1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : rows) {
            result.append(builder);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
    
        // Example 1
        String s = "AB";
        int numRows = 1;
        String output1 = solution.zigzagConversion(s, numRows);
        System.out.println("Example 1:");
        System.out.println("s: " + s + " numRows: " + numRows);
        System.out.println("Output: " + output1);
        
    }
}

/*

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"

*/
