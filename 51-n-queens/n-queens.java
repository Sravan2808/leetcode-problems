class Solution {
    private boolean isSafe(List<String> board, int row, int col) {
        int r = row, c = col;
        // upperRight
        while (r >= 0 && c < board.get(0).length()) {
            if (board.get(r).charAt(c) == 'Q')
                return false;
            r--;
            c++;
        }

        r = row;
        c = col;
        // upper Left'
        while(r>=0 && c>=0){
            if(board.get(r).charAt(c)=='Q') return false;
            r--;
            c--;
        }

        r=row;
        c=col;

        // Top
        while(r>=0){
            if(board.get(r).charAt(c)=='Q') return false;
            r--;
        }

        return true;
    }

    private void func(int row, List<List<String>> ans, List<String> board) {
        if (row == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int col = 0; col < board.get(0).length(); col++) {
            if (isSafe(board, row, col)) {
                char rowArr[] = board.get(row).toCharArray();
                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));
                func(row + 1, ans, board);
                rowArr[col] = '.';
                board.set(row, new String(rowArr));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();

        // Making row wise column "."
        for (int row = 0; row < n; row++) {
            board.add(".".repeat(n));
        }

        func(0, ans, board);
        return ans;
    }
}