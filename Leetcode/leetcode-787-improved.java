class Solution {
    /*
     * Solution using Priority Queue Similar to Dijkstr's Algorithm
     */

    // HashMap = src -> (dst -> price)
    private Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

    // PQ = [cost, src, stops], ordered by cost ascending
    private PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        constructAdjList(flights);

        // k + 1, because k total stops = k + 1 total edges
        pq.add(new int[] { 0, src, K + 1 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int city = curr[1];
            int stops = curr[2];

            if (city == dst)
                return cost;

            if (stops > 0) {
                // list of flights available from this 'city'
                Map<Integer, Integer> adj = graph.getOrDefault(city, new HashMap<>());

                for (int flight : adj.keySet())
                    pq.add(new int[] { cost + adj.get(flight), flight, stops - 1 });
            }
        }

        return -1;
    }

    private void constructAdjList(int[][] flights) {
        // create an adjancency list for easier representation of the graph
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new HashMap<>());
            graph.get(flight[0]).put(flight[1], flight[2]);
        }
    }
}