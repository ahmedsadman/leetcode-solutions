import java.util.*;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int totalCost = 0;

        // sort the array based on delta
        Arrays.sort(costs, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        });

        for (int i = 0; i < costs.length; i++) {
            totalCost += (i < costs.length / 2) ? costs[i][0] : costs[i][1];
        }
        // System.out.println(totalCost);
        return totalCost;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
        sol.twoCitySchedCost(arr);
    }

}