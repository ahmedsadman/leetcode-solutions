class Solution {
    // it's basically fibonacci numbers, with slight base case modifications
    public int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int a = 1;
        int b = 2;
        int total = 0;

        for (int i = 2; i < n; i++) {
            total = a + b;
            a = b;
            b = total;
        }

        return total;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.climbStairs(3));
    }
}