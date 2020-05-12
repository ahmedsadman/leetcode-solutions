/*
 * In graph theory, we say the outdegree of a vertex (person) is the number of
 * directed edges going out of it. For this graph, the outdegree of the vertex
 * represents the number of other people that person trusts.
 * 
 * Likewise, we say that the indegree of a vertex (person) is the number of
 * directed edges going into it. So here, it represents the number of people
 * trusted by that person.
 */

class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] indegree = new int[N + 1];
        int[] outdegree = new int[N + 1];

        for (int[] relation : trust) {
            outdegree[relation[0]]++;
            indegree[relation[1]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (indegree[i] == N - 1 && outdegree[i] == 0)
                return i;
        }

        return -1;
    }
}