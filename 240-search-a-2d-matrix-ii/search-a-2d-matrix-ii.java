class Solution {
    // Better
    // boolean binarySearch(int mat[],int x){
    //     int low =0;
    //     int high = mat.length-1;
    //     while(low<=high){
    //         int mid = (low+high)/2;
    //         if(mat[mid] == x) return true;
    //         else if(mat[mid]>x) high=mid-1;
    //         else low=mid+1;
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute Force
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;

        // BetterApproach TC:O(n*logm) SC:O(1)
        // for(int i=0;i<matrix.length-1;i++){
        //     boolean flag=binarySearch(matrix[i],target);
        //     if(flag==true) return true;
        // }
        // return false;

        // OptimalApproach:O(log(n*m)) Sc:O(1)
        // int m = matrix.length;
        // int n = matrix[0].length;
        // int low = 0 , high = m*n-1;
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     int row = mid/n,col=mid%n;
        //     if(matrix[row][col] == target) return true;
        //     else if(matrix[row][col]>target) high=mid-1;
        //     else low=mid+1;
           
        // }
        // return false;
        
    }
}