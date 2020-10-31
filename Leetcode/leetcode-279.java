class Solution {
    private HashMap<Integer, Integer> map = new HashMap<>();

    public int numSquares(int n) {
        // base case: if n = 1, 2, 3 we can form n with 1, 2, 3 - 1's sum.
        if (n < 4)
            return n;

        if (map.containsKey(n))
            return map.get(n);

        int count = n;

        for (int i = 1; i * i <= n; i++) {
            // numSquares(n - i * i) + 1, here +1 is added to include the current selection
            count = Math.min(count, numSquares(n - i * i) + 1);
        }

        map.put(n, count);

        return count;
    }
}