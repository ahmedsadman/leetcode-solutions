class Solution {
    int x; // grid width
    int y; // grid height
    char[][] board;

    public boolean exist(char[][] board, String word) {
        this.x = board[0].length;
        this.y = board.length;
        this.board = board;

        for (int i = 0; i < this.y; i++) {
            for (int j = 0; j < this.x; j++) {
                if (this.backtrack(i, j, word, 0))
                    return true;
            }
        }

        return false;
    }

    private boolean backtrack(int i, int j, String word, int index) {
        // check if we can reach the bottom
        if (index >= word.length())
            return true;

        // check if the given board indexes are valid and word conditions match
        if (i < 0 || i >= this.y || j < 0 || j >= this.x || this.board[i][j] != word.charAt(index))
            return false;

        // mark this current point as visited
        this.board[i][j] = '0';

        // check the other neighbors
        boolean ret = false;
        int rowOffset[] = { 1, 0, -1, 0 };
        int colOffset[] = { 0, 1, 0, -1 };

        for (int d = 0; d < 4; d++) {
            ret = this.backtrack(i + rowOffset[d], j + colOffset[d], word, index + 1);
            if (ret)
                break;
        }

        // now clean up so that the board looks as shiny as new (as before)
        this.board[i][j] = word.charAt(index);
        return ret;
    }
}