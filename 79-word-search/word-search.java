class Solution {
    private boolean func(int i,int j,int index,char[][] board,String word){
        if(index==word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] ==' ' || board[i][j]!=word.charAt(index) ) return false;

        char ch = board[i][j];
        board[i][j] = ' ';

        // Traverse Up Down Left Right
        boolean ans = func(i-1,j,index+1,board,word) || func(i+1,j,index+1,board,word) || func(i,j-1,index+1,board,word) || func(i,j+1,index+1,board,word);

        board[i][j] = ch;
        return ans;
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (func(i, j, 0, board, word))
                        return true;
                }
            }
        }
        return false;
    }
}