import java.util.*;

class Solution {
    public int findJudge(int N, int[][] trust) {
        // label -> (trusted by count, trusts count)
        // 3 -> (2, 0), meaning person 3 is trusted by 2 people, while 3 trusts 0 people
        if (trust.length == 0)
            return 1;

        HashMap<Integer, int[]> map = new HashMap<>();

        for (int[] i : trust) {
            map.putIfAbsent(i[0], new int[2]);
            map.putIfAbsent(i[1], new int[2]);

            // record the trusted by count (Label X trusted by N people)
            int[] val = map.get(i[1]);
            val[0] += 1;
            map.put(i[1], val);

            // record the trusts count (Label X trusts N people)
            val = map.get(i[0]);
            val[1] += 1;
            map.put(i[0], val);
        }

        // now check for condition:
        // people X trusted by N - 1 people, and he trusts 0 people, this is the judge
        for (int label : map.keySet()) {
            int[] counts = map.get(label);
            if (counts[0] == N - 1 && counts[1] == 0)
                return label;
        }

        return -1;
    }
}