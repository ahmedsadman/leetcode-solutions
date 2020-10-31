class Solution {
    // Slightly modified version of Hierzolher's algorithm
    // https://leetcode.com/problems/reconstruct-itinerary/discuss/78768/Short-Ruby-Python-Java-C%2B%2B

    Map<String, PriorityQueue<String>> targets = new HashMap<>();
    List<String> routes = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        // create the graph
        for (List<String> ticket : tickets) {
            targets.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>()).add(ticket.get(1));
        }

        visit("JFK");
        return routes;
    }

    private void visit(String airport) {
        while (targets.containsKey(airport) && !targets.get(airport).isEmpty()) {
            String next_airport = targets.get(airport).poll();
            visit(next_airport);
        }

        routes.add(0, airport);
    }
}