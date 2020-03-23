import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        LinkedList<int[]> result = new LinkedList<>();
        Arrays.sort(points, (a, b) -> {
            return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
        });

        for (int i = 0; i < K; i++) {
            result.add(points[i]);
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        Solution sol = new Solution();
        int[][] result = sol.kClosest(points, 2);

        for (int[] i : result) {
            System.out.println(String.valueOf(i[0]) + ", " + String.valueOf(i[1]));
        }
    }
}