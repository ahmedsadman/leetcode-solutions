class Solution {
    /*
     * slope = (y1 - y0) / (x1 - x0) For three points to be equal, their slopes with
     * each other must be equal. For 3 points (x0, y0), (x1, y1) and (x, y) it is:
     * (y - y1) / (x - x1) = (y1 - y0) / (x1 - x0)
     * 
     * To avoid zero division, we use the multiplication form (x1 - x0) * (y - y1) =
     * (x - x1) * (y1 - y0). In this solution though, we don't use this. Rather, we
     * stick to calculating the slope for first two points, and comparing this to
     * other calcualted slopes
     */
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2)
            return true;

        double initialSlope = calculateSlope(coordinates[0], coordinates[1]);

        for (int i = 2; i < coordinates.length; i++) {
            double currentSlope = calculateSlope(coordinates[i], coordinates[i - 1]);
            if (currentSlope != initialSlope)
                return false;
        }

        return true;
    }

    private double calculateSlope(int[] a, int b[]) {
        double dx = b[0] - a[0]; // x1 - x0
        double dy = b[1] - a[1]; // y1 - y0
        return dy / dx;
    }
}