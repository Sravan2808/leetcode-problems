class Solution {
    private int[][][] dp;

    private boolean solve(int row, int col, int count, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        count += (grid[row][col] == '(') ? 1 : -1;

        if (count < 0)
            return false;

        if (dp[row][col][count] != -1)
            return dp[row][col][count] == 1;

        if (row == n - 1 && col == m - 1) {
            dp[row][col][count] = (count == 0) ? 1 : 0;
            return count == 0;
        }

        boolean down = false;
        if (row + 1 < n) {
            down = solve(row + 1, col, count, grid);
        }

        boolean right = false;
        if (col + 1 < m) {
            right = solve(row, col + 1, count, grid);
        }

        dp[row][col][count] = (down || right) ? 1 : 0;

        return down || right;
    }

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int len = m + n - 1;

        if (len % 2 == 1)
            return false;

        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(')
            return false;

        dp = new int[101][101][201];

        for (int[][] arr : dp) {
            for (int[] row : arr) {
                Arrays.fill(row, -1);
            }
        }

        return solve(0, 0, 0, grid);
    }
}
