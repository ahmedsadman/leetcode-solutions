class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        // store curently working index of a and b
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;

        while (indexA >= 0 || indexB >= 0) {
            int A_int = indexA >= 0 ? a.charAt(indexA--) - '0' : 0;
            int B_int = indexB >= 0 ? b.charAt(indexB--) - '0' : 0;
            int sum = A_int + B_int + carry;

            result.insert(0, String.valueOf(sum % 2));
            carry = sum / 2;
        }

        if (carry > 0) {
            result.insert(0, String.valueOf(carry));
        }
        return result.toString();
    }
}