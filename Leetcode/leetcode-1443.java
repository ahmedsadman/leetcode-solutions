import java.util.*;

class Solution {
    private Map<Integer, List<Integer>> treeMap;
    private List<Boolean> hasApple;

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        this.treeMap = buildTree(edges);
        this.hasApple = hasApple;
        return helper(0);
    }

    private int helper(int node) {
        int time = 0;

        for (int child : treeMap.getOrDefault(node, new LinkedList<>()))
            time += helper(child);

        // if any of the descendent has an apple, we have to add +2 along the way
        // if node == 0 (root) contains apple, we don't need to waste extra time
        if ((time > 0 || hasApple.get(node)) && node != 0)
            time += 2;

        return time;
    }

    private Map<Integer, List<Integer>> buildTree(int[][] edges) {
        Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int edge[] : edges) {
            tree.putIfAbsent(edge[0], new LinkedList<>());
            tree.get(edge[0]).add(edge[1]);
        }
        return tree;
    }
}