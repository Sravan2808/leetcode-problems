class Solution {
    private int[] delRow = {-1,0,1,0};
    private int[] delCol = {0,1,0,-1};

    private boolean isValid(int i,int j,int n,int m){
        if(i<0 || i>=n) return false;
        if(j<0 || j>=m) return false;
        return true;
    }

    private void dfs(int row,int col,int[][] ans,int[][] image,int color,int inColor){
        ans[row][col] = color;

        int n = image.length;
        int m = image[0].length;

        for(int i=0;i<4;i++){
            int nRow = row+delRow[i];
            int nCol = col+delCol[i];

            if(isValid(nRow,nCol,n,m) && image[nRow][nCol] == inColor && ans[nRow][nCol]!=color){
                dfs(nRow,nCol,ans,image,color,inColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inColor = image[sr][sc];
        int ans[][] = new int[image.length][image[0].length];
        
        for(int i=0;i<image.length;i++){
            ans[i] = Arrays.copyOf(image[i],image[i].length);
        }

        dfs(sr,sc,ans,image,color,inColor);
        return ans;
    }
}