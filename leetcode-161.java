// leetcode premium, so couldn't use judge to verify
// ques link: https://leetcode.jp/problemdetail.php?id=161

class Solution {
    public boolean oneEditDistance(String first, String second) {
        if (first.length() == second.length())
            return oneEditReplace(first, second);
        else if (first.length() + 1 == second.length())
            return oneEditInsert(first, second);
        else if (first.length() - 1 == second.length())
            return oneEditInsert(second, first);
        return false;
    }

    private boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference)
                    return false;
                foundDifference = true;
            }
        }
        return true;
    }

    // combine remove and insert into one func, because remove is inverse of insert
    private boolean oneEditInsert(String s1, String s2) {
        int i1 = 0;
        int i2 = 0;

        while (i1 < s1.length() && i2 < s2.length()) {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                if (i1 != i2)
                    return false;
                i2++;
            } else {
                i1++;
                i2++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "bale";
        String s2 = "pale";
        System.out.println(sol.oneEditDistance(s1, s2));
    }
}