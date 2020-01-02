import java.util.*;

// Explanation: https://www.youtube.com/watch?v=hLQYQ4zj0qg

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();
        return dfs(s, wordDict, map);
    }

    private boolean dfs(String str, List<String> dict, HashMap<String, Boolean> map) {
        if (str.equals(""))
            return true;

        if (map.containsKey(str))
            return map.get(str);

        for (int i = 1; i <= str.length(); i++) {
            if (dict.contains(str.substring(0, i)) && dfs(str.substring(i, str.length()), dict, map)) {
                map.put(str.substring(i, str.length()), true);
                return true;
            }
        }

        map.put(str, false);
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("bbb");
        list.add("bbbb");
        boolean result = sol.wordBreak("bb", list);
        System.out.println(result);
    }
}