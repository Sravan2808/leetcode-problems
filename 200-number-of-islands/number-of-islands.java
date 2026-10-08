class Solution {
    private void dfs(int i,int j,char grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        grid[i][j] = '2';
        int x[] = new int[]{-1,0,1,0};
        int y[] = new int[]{0,-1,0,1};
        for(int k=0;k<4;k++){
            int nbri = i+x[k];
            int nbrj = j+y[k];

            if(nbri>=0 && nbri<m && nbrj>=0 && nbrj<n && grid[nbri][nbrj]=='1'){
                dfs(nbri,nbrj,grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }
}