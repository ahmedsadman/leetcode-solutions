class Solution {
    /*
     * Let's figure out how to sort the input here. The input should be sorted by a
     * parameter which indicates a money lost for the company.
     * 
     * The company would pay anyway : price_A to send a person to the city A, or
     * price_B to send a person to the city B. By sending the person to the city A,
     * the company would lose price_A - price_B, which could negative or positive.
     * 
     * To optimize the total costs, let's sort the persons by price_A - price_B and
     * then send the first n persons to the city A, and the others to the city B,
     * because this way the company costs are minimal.
     */
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> ((a[0] - a[1]) - (b[0] - b[1])));
        int n = costs.length / 2;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            // send the first n persons to the city A
            // and the others to the city B
            totalCost += costs[i][0] + costs[i + n][1];
        }

        return totalCost;
    }
}