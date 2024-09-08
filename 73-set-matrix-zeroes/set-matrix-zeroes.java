class Solution {
    public void setZeroes(int[][] matrix) {
        // BruteForce Approach Tc:O(n*m)*(n*m) SC: O(1)
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (matrix[i][j] == 0) {
    //                 markRow(i, matrix);
    //                 markCol(j, matrix);
    //             }
    //         }
    //     }
    //     for(int i = 0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==-1){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }

    // }

    // public void  markRow(int i,int[][] matrix){
    //         for(int j=0;j<matrix.length;j++){
    //             if(matrix[i][j]!=0){
    //                 matrix[i][j]=-1;
    //             }
    //         }
    //     }

    // public void  markCol(int j,int[][] matrix){
    //         for(int i=0;i<matrix.length;i++){
    //             if(matrix[i][j]!=0){
    //                 matrix[i][j]=-1;
    //             }
    //         }
    // }

    // Better Approach TC:O(n*m) ,Sc:O(n)+O(m)
    
    int row[]=new int[matrix.length];
    int col[] =new int[matrix[0].length];

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
    }
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(row[i] == 1 || col[j] == 1){
                matrix[i][j]=0;
            }
        }
    }
    }
       
}