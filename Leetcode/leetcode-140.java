import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> map = new HashMap<>();
        return backtrack(s, wordDict, map);
    }

    private List<String> backtrack(String s, List<String> wordDict, Map<String, List<String>> map) {
        if (map.containsKey(s))
            return map.get(s);

        List<String> result = new ArrayList<>();

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String next = s.substring(word.length());
                if (next.length() == 0)
                    result.add(word);
                else {
                    for (String sub : backtrack(next, wordDict, map)) {
                        result.add(word + " " + sub);
                    }
                }
            }
        }
        map.put(s, result);

        return result;
    }
}