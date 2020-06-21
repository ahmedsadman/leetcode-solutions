class Solution {
    /*
     * Explanation:
     * https://leetcode.com/problems/permutation-sequence/discuss/22507/%22Explain-
     * like-I'm-five%22-Java-Solution-in-O(n)
     */
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        int[] factorials = new int[n + 1];

        // build the numbers to get indices from
        for (int i = 1; i <= n; i++)
            numbers.add(i);

        // factorial map to get factorials
        factorials[0] = 1;
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
            factorials[i] = f;
        }

        // make k 0-indexed
        k--;

        for (int i = 1; i <= n; i++) {
            int index = k / factorials[n - i];
            sb.append(numbers.remove(index));
            k -= index * factorials[n - i];
        }

        return String.valueOf(sb);
    }
}