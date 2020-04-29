class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int[] newArray = digits;

        int newValue = newArray[digits.length - 1] + 1;
        newArray[digits.length - 1] = newValue % 10;
        carry = newValue / 10;

        int i = digits.length - 2;
        while (carry > 0 && i >= 0) {
            int val = newArray[i] + carry;
            newArray[i] = val % 10;
            carry = val / 10;
            i--;
        }

        // if still carry exists, it means we need to extend array size
        if (carry > 0) {
            int[] extendedArr = new int[digits.length + 1];

            // copy the values
            for (int j = 1; j < (digits.length - 1); j++)
                extendedArr[j] = newArray[j];

            // finally, add the remaining carry in first position
            extendedArr[0] = carry;
            return extendedArr;
        }

        return newArray;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = { 9, 9, 9 };
        int[] newArr = sol.plusOne(digits);

        for (int a : newArr) {
            System.out.print(a);
        }
    }
}