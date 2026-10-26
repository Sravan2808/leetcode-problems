class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    private boolean isValid(int row,int col,int m,int n){
        return row>=0 && row<m && col>=0 && col<n;
    }
    private long bfs(int grid[][],int i,int j,int m,int n,boolean[][] visited){
        long sum = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i,j));
        visited[i][j] = true;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        while(!q.isEmpty()){
            Pair p = q.poll();
            int x = p.i;
            int y = p.j;

            sum+=grid[x][y];

            for(int k=0;k<4;k++){
                int row = x+drow[k];
                int col = y+dcol[k];

                if(isValid(row,col,m,n) && grid[row][col]>0 && !visited[row][col]){
                     visited[row][col] = true;
                     q.offer(new Pair(row,col));
                }
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean visited[][] = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0 && !visited[i][j]){
                    long sum = bfs(grid,i ,j,m,n,visited);
                    if(sum%k==0) ans++;
                }
            }
        }
        return ans;
    }
}