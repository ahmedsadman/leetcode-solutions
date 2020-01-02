
// Explanation: https://www.youtube.com/watch?v=qli-JCrSwuk
import java.util.*;

class Solution {
    private int dfs(String data, int k, HashMap<Integer, Integer> map) {
        if (k == 0)
            return 1;

        int start = data.length() - k;

        if (map.containsKey(k))
            return map.get(k);

        if (data.charAt(start) == '0')
            return 0;

        int result = dfs(data, k - 1, map);
        if (k >= 2 && Integer.valueOf(data.substring(start, start + 2)) <= 26)
            result += dfs(data, k - 2, map);

        map.put(k, result);
        return result;
    }

    public int numDecodings(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return dfs(s, s.length(), map);
    }
}