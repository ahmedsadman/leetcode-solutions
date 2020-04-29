class Solution {
    int x; // grid width
    int y; // grid height
    int[][] g; // put a copy of grid for easier access between methods

    public int maxAreaOfIsland(int[][] grid) {
        g = grid;
        int area = 0;

        y = g.length; // grid height

        if (y == 0)
            return 0;

        x = g[0].length; // grid width

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (g[i][j] == 1) {
                    area = Math.max(area, dfs(i, j, 0));
                }
            }
        }

        return area;
    }

    private int dfs(int i, int j, int area) {
        // check for invalid indices of sites, or, that aren't land
        if (i < 0 || i >= y || j < 0 || j >= x || g[i][j] != 1)
            return area;

        // mark the site as visited
        g[i][j] = 0;
        area++;

        // recursively check adjacent sites
        area += dfs(i + 1, j, 0);
        area += dfs(i, j + 1, 0);
        area += dfs(i - 1, j, 0);
        area += dfs(i, j - 1, 0);

        return area;
    }
}