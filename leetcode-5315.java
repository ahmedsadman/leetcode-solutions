class Solution {
    public int maximum69Number(int num) {
        String numStr = Integer.toString(num);

        // find the first occurence of 6 from left
        int firstOccur = numStr.indexOf("6");

        // if firstOccur not found, return the original number
        if (firstOccur == -1)
            return num;

        char[] numChar = numStr.toCharArray();
        numChar[firstOccur] = '9';
        return Integer.valueOf(new String(numChar));

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maximum69Number(9669));
    }
}