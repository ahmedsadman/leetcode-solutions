import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    /*
     * DFS Solution
     * 
     * Traverse all childs, and keep the minimum of ans
     */
    private HashMap<Integer, ArrayList<int[]>> graph = new HashMap<>();
    private int ans = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        constructAdjList(flights);
        dfs(src, dst, k + 1, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private void dfs(int src, int dst, int k, int cost) {
        if (k < 0)
            return;

        if (src == dst) {
            // we have reached the destination, store the answer
            ans = cost;
            return;
        }

        if (!graph.containsKey(src))
            return;

        for (int[] flight : graph.get(src)) {
            if (cost + flight[1] > ans)
                // if it doesn't contribute, skip it
                continue;

            dfs(flight[0], dst, k - 1, cost + flight[1]);
        }
    }

    private void constructAdjList(int[][] flights) {
        // create an adjancency list for easier representation of the graph
        // HashMap = src -> [[dst, cost]]
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(new int[] { flight[1], flight[2] });
        }
    }
}