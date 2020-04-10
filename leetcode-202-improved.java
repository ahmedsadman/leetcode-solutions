class Solution {
    // Using the concept of cycle detection in linked list
    // uses O(1) space
    public boolean isHappy(int n) {
        int x = n;
        int y = n;

        while (true) {
            x = calculate(x);
            if (x == 1)
                return true;

            y = calculate(calculate(y));
            if (y == 1)
                return true;

            if (x == y)
                return false;
        }
    }

    private int calculate(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last * last;
            n = n / 10;
        }

        return sum;
    }
}