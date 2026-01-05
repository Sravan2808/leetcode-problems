class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    cnt++;
                }
                    min = Math.min(min, Math.abs(matrix[i][j]));
            }
        }

        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + Math.abs(matrix[i][j]);
            }
        }
        if(cnt%2 != 0) sum -= 2*min;

        return sum;
    }
}