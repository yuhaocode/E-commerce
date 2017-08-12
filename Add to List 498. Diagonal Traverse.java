public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int row = 0;
        int col = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ans = new int[m * n];
        int[][] dirs = {{-1, 1}, {1, -1}};
        
        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row += dirs[d][0];
            col += dirs[d][1];
            //in the right part
            if (row >= m) { row = m - 1; col += 2; d = 1 - d;}
            if (col >= n) { col = n - 1; row += 2; d = 1 - d;}
            //int the left part
            if (row < 0)  { row = 0; d = 1 - d;}
            if (col < 0)  { col = 0; d = 1 - d;}
        }
        
        return result;
        
    }
}
/*
x x x x
x x x x
x x x x
x x x x
    0,0
    0,1
    1,0
    2,0
    1,1
    0,2
    0,3
    1,2
    2,1
    3,0
    3,1
    2,2
    1,3
    2,3
    3,2
    3,3
*/
