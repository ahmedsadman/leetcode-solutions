import java.util.*;

class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] in_degree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        // create the adjacency list
        for (int[] pr : prerequisites) {
            List<Integer> list = graph.getOrDefault(pr[1], new ArrayList<>());
            list.add(pr[0]);
            in_degree[pr[0]]++;
            graph.put(pr[1], list);
        }

        // add the nodes with 0 indegree first
        for (int i = 0; i < in_degree.length; i++) {
            if (in_degree[i] == 0)
                q.add(i);
        }

        // search and decrement neighbor degress
        while (!q.isEmpty()) {
            int node = q.poll();
            // if (in_degree[node] == 0)
            // count++;
            count++;

            if (!graph.containsKey(node))
                continue;

            for (int nei : graph.get(node)) {
                in_degree[nei]--;
                if (in_degree[nei] == 0)
                    q.add(nei);
            }
        }

        return count == numCourses;
    }
}