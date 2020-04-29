// LeetCode 771 - Jewels and Stones

import java.util.*;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewels = 0;
        HashMap<Character, Integer> record = new HashMap<>();

        // create the hash record
        for (int i = 0; i < S.length(); i++) {
            // if record does not exist, create one, otherwise increment counter
            if (!record.containsKey(S.charAt(i))) {
                record.put(S.charAt(i), 1);
            } else {
                int counter = record.get(S.charAt(i));
                record.replace(S.charAt(i), counter + 1);
            }
        }

        // now count the desired jewels
        for (int i = 0; i < J.length(); i++) {
            if (record.containsKey(J.charAt(i))) {
                jewels += record.get(J.charAt(i));
            }
        }

        System.out.println(record);
        return jewels;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String J = "z";
        String S = "ZZ";
        int result = s.numJewelsInStones(J, S);
        System.out.println(result);
    }
}