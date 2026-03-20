class Solution {
    boolean solve(char[][] board, String word, int i, int j, int cnt) {
        if (cnt == word.length())
            return true;
        if (i == -1 || j == -1 || i == board.length || j == board[0].length || board[i][j] != word.charAt(cnt))
            return false;
        char temp = board[i][j];
        board[i][j] = '.';
        boolean isFound = solve(board, word, i, j - 1, cnt + 1) || solve(board, word, i, j + 1, cnt + 1)
                || solve(board, word, i + 1, j, cnt + 1) || solve(board, word, i - 1, j, cnt + 1);

        board[i][j] = temp;
        return isFound;
    }

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((board[i][j] == word.charAt(0)) && solve(board, word, i, j, 0))
                return true;
            }
        }
        return false;

    }
}