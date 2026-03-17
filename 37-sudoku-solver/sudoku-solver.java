class Solution {
    public boolean isValid(char[][] board, int row, int col, char d) {
        // Row and Col Validation
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == d)
                return false;
            if (board[row][i] == d)
                return false;
        }
        // Box Validation
        int start_i = (row / 3) * 3;
        int start_j = (col / 3) * 3;

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (board[start_i + k][start_j + l] == d)
                    return false;
            }
        }
        return true;

    }

    boolean solve(char[][] board){
                for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char d = '1'; d <= '9'; d++) {
                        if (isValid(board, i, j, d)) {
                            board[i][j] = d;
                            // Explore
                            if (solve(board)==true)
                                return true;
                            else
                                board[i][j] = '.'; //Backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);

    }
}