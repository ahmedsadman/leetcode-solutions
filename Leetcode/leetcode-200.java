class Solution {
    int x; // grid width
    int y; // grid height
    char[][] g; // put a copy of grid for easier passing between methods

    /* The approach uses DFS. # of DFS calls = # of islands */

    public int numIslands(char[][] grid) {
        g = grid;
        int count = 0;

        y = g.length; // grid height

        if (y == 0)
            return 0;

        x = g[0].length; // grid width

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (g[i][j] == '1') {
                    dfs(i, j);
                    ++count;
                }
            }
        }

        return count;
    }

    private void dfs(int i, int j) {
        // check for invalid indices of sites, or, that aren't land
        if (i < 0 || i >= y || j < 0 || j >= x || g[i][j] != '1')
            return;

        // mark the site as visited
        g[i][j] = '0';

        // recursively check adjacent sites
        dfs(i + 1, j);
        dfs(i, j + 1);
        dfs(i - 1, j);
        dfs(i, j - 1);
    }
}