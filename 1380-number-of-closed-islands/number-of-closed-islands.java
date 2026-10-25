class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    private boolean isValid(int row, int col, int m, int n) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }

    private boolean dfs(int i, int j, int grid[][], boolean visited[][], int m, int n) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i, j));
        visited[i][j] = true;
        boolean close = true;
        int dx[] = { -1, 0, 1, 0 };
        int dy[] = { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int x = p.x;
            int y = p.y;

            if (x == 0 || x == m - 1 || y == 0 || y == n - 1)
                close = false;
            for (int k = 0; k < 4; k++) {
                int row = x + dx[k];
                int col = y + dy[k];
                if (isValid(row, col, m, n) && grid[row][col] == 0 && visited[row][col] == false) {
                    q.offer(new Pair(row, col));
                    visited[row][col] = true;
                }
            }
        }
        return close;
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && grid[i][j] == 0) {
                    if (dfs(i, j, grid, visited, m, n))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}