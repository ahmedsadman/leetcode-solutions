class Solution {
    public int maxDiff(int num) {
        String numStr = String.valueOf(num);
        String s1 = numStr;
        String s2 = numStr;

        for (int i = 0; i < numStr.length(); i++) {
            Character c = s1.charAt(i);
            if (c != '9') {
                s1 = s1.replace(c, '9');
                break;
            }
        }

        System.out.println(s1);

        Character c1 = s2.charAt(0);
        if (c1 > '1') {
            s2 = s2.replace(c1, '1');
        } else {
            // find first occurence which is neither 1 nor 0 and replace with 0
            for (int i = 1; i < s2.length(); i++) {
                c1 = s2.charAt(i);
                if (c1 > '1') {
                    s2 = s2.replace(c1, '0');
                    break;
                }
            }
        }

        System.out.println(s2);
        return Math.abs(Integer.valueOf(s1) - Integer.valueOf(s2));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxDiff(123456));
    }
}