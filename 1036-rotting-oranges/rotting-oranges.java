class Pair {
    int i;
    int j;
    int t;

    Pair(int i, int j, int t) {
        this.i = i;
        this.j = j;
        this.t = t;
    }
}

class Solution {
    private boolean isValid(int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m)
            return true;
        return false;
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    fresh++;
                else if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    grid[i][j] = 3;
                }
            }
        }

        if (fresh == 0)
            return ans;

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            ans = pair.t;

            int dx[] = new int[] { -1, 0, 1, 0 };
            int dy[] = new int[] { 0, -1, 0, 1 };

            for (int k = 0; k < 4; k++) {
                int nbri = pair.i + dx[k];
                int nbrj = pair.j + dy[k];

                if (isValid(nbri, nbrj, n, m) && grid[nbri][nbrj] == 1) {
                    q.add(new Pair(nbri, nbrj, pair.t + 1));
                    grid[nbri][nbrj] = 2;
                    grid[nbri][nbrj] = 3;
                    fresh--;
                }
            }
        }
        return fresh == 0 ? ans : -1;
    }
}