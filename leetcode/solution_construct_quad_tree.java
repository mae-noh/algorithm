// Definition for a QuadTree node.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

}

class solution_construct_quad_tree {

    public Node construct(int[][] grid, int startY, int endY, int startX, int endX) {
        if(startY == endY && startX == endX) return new Node(grid[startY][startX] == 1, true);

        int midY = (startY + endY) / 2;
        int midX = (startX + endX) / 2;

        Node topLeft = construct(grid, startY, midY, startX, midX);
        Node topRight = construct(grid, startY, midY, midX + 1, endX);
        Node bottomLeft = construct(grid, midY + 1, endY, startX, midX);
        Node bottomRight = construct(grid, midY + 1, endY, midX + 1, endX);
        
        boolean isLeaf = topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && 
        topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val;

        if(isLeaf) {
            return new Node(topLeft.val, true);
        }

        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    public Node construct(int[][] grid) {
        return construct(grid, 0, grid.length - 1, 0, grid[0].length - 1);
    }

    public static void main(String[] args) {
        solution_construct_quad_tree solution = new solution_construct_quad_tree();
    
        // Example 1
        int[][] grid1 = {{0,1},{1,0}};
        Node output1 = solution.construct(grid1);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);
        System.out.println("Expected1: [[0,1],[1,0],[1,1],[1,1],[1,0]]");

        // Example 2
        int[][] grid2 = {{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0}};
        Node output2 = solution.construct(grid2);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);
        System.out.println("Expected2: [[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]");
        
    }
}
/*
https://leetcode.com/problems/construct-quad-tree/description/

Given a n * n matrix grid of 0's and 1's only. We want to represent grid with a Quad-Tree.

Return the root of the Quad-Tree representing grid.

A Quad-Tree is a tree data structure in which each internal node has exactly four children. Besides, each node has two attributes:

val: True if the node represents a grid of 1's or False if the node represents a grid of 0's. Notice that you can assign the val to True or False when isLeaf is False, and both are accepted in the answer.
isLeaf: True if the node is a leaf node on the tree or False if the node has four children.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;
}
We can construct a Quad-Tree from a two-dimensional area using the following steps:

If the current grid has the same value (i.e all 1's or all 0's) set isLeaf True and set val to the value of the grid and set the four children to Null and stop.
If the current grid has different values, set isLeaf to False and set val to any value and divide the current grid into four sub-grids as shown in the photo.
Recurse for each of the children with the proper sub-grid.
*/

/*
Input-Output

Input: grid = [[0,1],[1,0]]
Output: [[0,1],[1,0],[1,1],[1,1],[1,0]]
Explanation: The explanation of this example is shown below:
Notice that 0 represents False and 1 represents True in the photo representing the Quad-Tree.

Input: grid = [[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]]
Output: [[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]
Explanation: All values in the grid are not the same. We divide the grid into four sub-grids.
The topLeft, bottomLeft and bottomRight each has the same value.
The topRight have different values so we divide it into 4 sub-grids where each has the same value.
Explanation is shown in the photo below:

n == grid.length == grid[i].length
n == 2x where 0 <= x <= 6
 */