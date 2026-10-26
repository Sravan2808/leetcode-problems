class Solution {
    private boolean isValid(int nRow,int nCol,int n,int m){
        return nRow>=0&&nRow<n&&nCol>=0&&nCol<m;
    }
    private void dfs(int row,int col,boolean vis[][],char[][] board){
        int n = board.length;
        int m = board[0].length;

        vis[row][col] = true;

        int dRow[] = {-1,0,1,0};
        int dCol[] = {0,-1,0,1};

        for(int i=0;i<4;i++){
            int nRow = row+dRow[i];
            int nCol = col+dCol[i];

            if(isValid(nRow,nCol,n,m) && !vis[nRow][nCol] && board[nRow][nCol]=='O') dfs(nRow,nCol,vis,board);
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean vis[][] = new boolean[n][m];

        // Traverse the row
        for(int j=0;j<m;j++){
            // first row
            if(board[0][j]=='O' && !vis[0][j]) dfs(0,j,vis,board);
            
            // Last row
            if(board[n-1][j]=='O' && !vis[n-1][j]) dfs(n-1,j,vis,board);
        }

        // Traverse the col
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' && !vis[i][0]) dfs(i,0,vis,board);

            if(board[i][m-1] == 'O' && !vis[i][m-1]) dfs(i,m-1,vis,board);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !vis[i][j]) board[i][j] = 'X';
            }
        }

    }
}