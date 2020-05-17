class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        // using sorting
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean s1Breaks = true;
        boolean s2Breaks = true;

        for (int i = 0; i < s1.length() && (s1Breaks || s2Breaks); i++) {
            if (c1[i] < c2[i])
                s1Breaks = false;
            if (c2[i] < c1[i])
                s2Breaks = false;
        }

        return s1Breaks || s2Breaks;
    }
}