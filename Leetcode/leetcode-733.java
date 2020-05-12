class Solution {
    private int[][] image;
    private int oldColor;
    private int X; // image width
    private int Y; // image height

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.image = image;
        this.X = image[0].length;
        this.Y = image.length;
        this.oldColor = image[sr][sc];

        // if colors are same, no need to change the image
        if (newColor == oldColor)
            return this.image;

        recursion(sr, sc, newColor);

        return this.image;
    }

    private void recursion(int r, int c, int newColor) {
        // check index validity
        if (r < 0 || r >= Y || c < 0 || c >= X || image[r][c] != oldColor)
            return;

        // change the color
        image[r][c] = newColor;

        // recursion
        recursion(r + 1, c, newColor);
        recursion(r, c + 1, newColor);
        recursion(r - 1, c, newColor);
        recursion(r, c - 1, newColor);
    }
}