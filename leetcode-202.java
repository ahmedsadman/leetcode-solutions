import java.util.*;

class Solution {
    HashSet<Integer> records;

    public boolean isHappy(int n) {
        records = new HashSet<>();
        return recur(n);
    }

    private boolean recur(int n) {
        if (!this.records.add(n))
            return false;

        if (n == 1)
            return true;

        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last * last;
            n = n / 10;
        }
        return recur(sum);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isHappy(19));
    }
}