class Solution {
    public int binaryGap(int N) {
        String binaryStr = Integer.toBinaryString(N);
        int start = -1;
        int end = -1;
        int count = 0;
        int i = 0;

        while (i < binaryStr.length()) {
            if (binaryStr.charAt(i) == '1') {
                start = i++;
                while (i < binaryStr.length()) {
                    if (binaryStr.charAt(i) == '1') {
                        end = i;
                        break;
                    }
                    i++;
                }
                count = Math.max(count, end - start);
            } else
                i++;
        }

        return count;
    }
}