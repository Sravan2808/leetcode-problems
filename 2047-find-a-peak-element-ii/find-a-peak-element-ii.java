class Solution {
    private int maxElem(int mat[][],int col){
        int n = mat.length;
        int ele = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>ele){
                ele = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m =  mat[0].length;

        int low = 0;
        int high = m-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int row = maxElem(mat,mid);

            int left = mid-1>=0?mat[row][mid-1]:-1;
            int right = mid+1<m?mat[row][mid+1]:-1;

            if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row,mid};
            else if(left>mat[row][mid]) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
}