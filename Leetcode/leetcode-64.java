class Solution {
    int[][] g;
    int[][] mem;
    int x; // grid width
    int y; // grid height

    public int minPathSum(int[][] grid) {
        this.g = grid;
        this.y = grid.length;

        if (this.y == 0)
            return 0;

        this.x = grid[0].length;

        // memoization
        this.mem = new int[this.y][this.x];

        // fill value with -1
        for (int i = 0; i < mem.length; i++) {
            for (int j = 0; j < mem[0].length; j++)
                mem[i][j] = -1;
        }

        return recursion(0, 0);
    }

    private int recursion(int i, int j) {
        if (i >= this.y || j >= this.x)
            return Integer.MAX_VALUE;

        /*
         * edge case: if both i,j are out of bounds, the min value returned will be
         * Integer.MAX_VALUE + Something (which will overflow). So we need to check if
         * both are out of bounds
         */
        if (i == this.y - 1 && j == this.x - 1)
            return this.g[i][j];

        if (this.mem[i][j] != -1)
            return this.mem[i][j];

        int sum = this.g[i][j] + Math.min(recursion(i + 1, j), recursion(i, j + 1));
        this.mem[i][j] = sum; // record the value to use later

        return sum;
    }
}