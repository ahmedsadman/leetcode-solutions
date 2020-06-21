class Solution {
    /*
     * DFS SOLUTION:
     * 
     * Step 1). We select all the cells that are located on the borders of the
     * board.
     * 
     * Step 2). Start from each of the above selected cell, we then perform the DFS
     * traversal.
     * 
     * If a cell on the border happens to be O, then we know that this cell is
     * alive, together with the other O cells that are connected to this border
     * cell, based on the description of the problem. Two cells are connected, if
     * there exists a path consisting of only O letter that bridges between the two
     * cells.
     * 
     * Based on the above conclusion, the goal of our DFS traversal would be to mark
     * out all those connected O cells that is originated from the border, with any
     * distinguished letter such as E.
     * 
     * Step 3). Once we iterate through all border cells, we would then obtain three
     * types of cells:
     * 
     * The one with the X letter: the cell that we could consider as the wall.
     * 
     * The one with the O letter: the cells that are spared in our DFS traversal,
     * i.e. these cells has no connection to the border, therefore they are
     * captured. We then should replace these cell with X letter.
     * 
     * The one with the E letter: these are the cells that are marked during our DFS
     * traversal, i.e. these are the cells that has at least one connection to the
     * borders, therefore they are not captured. As a result, we would revert the
     * cell to its original letter O.
     */

    private char[][] board;
    private int rows;
    private int cols;

    public void solve(char[][] board) {
        this.board = board;
        this.rows = board.length;

        if (this.rows == 0)
            return;

        this.cols = board[0].length;

        // build and store the border values
        List<int[]> borders = new LinkedList<>();
        for (int row = 0; row < this.rows; row++) {
            borders.add(new int[] { row, 0 });
            borders.add(new int[] { row, this.cols - 1 });
        }

        for (int col = 0; col < this.cols; col++) {
            borders.add(new int[] { 0, col });
            borders.add(new int[] { this.rows - 1, col });
        }

        // mark the escaped cells
        for (int[] pair : borders)
            dfs(pair[0], pair[1]);

        // flip the cells to the final correct steps
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (board[i][j] == 'E')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }

    }

    private void dfs(int row, int col) {
        if (row < 0 || row >= this.rows || col < 0 || col >= this.cols || board[row][col] != 'O')
            return;

        board[row][col] = 'E';

        dfs(row + 1, col);
        dfs(row, col + 1);
        dfs(row - 1, col);
        dfs(row, col - 1);
    }
}