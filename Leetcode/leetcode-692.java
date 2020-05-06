import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();

        // if counts match, we have to show in alphabetical order
        PriorityQueue<String> heap = new PriorityQueue<>(
                (a, b) -> count.get(a).equals(count.get(b)) ? a.compareTo(b) : count.get(b) - count.get(a));

        List<String> result = new ArrayList<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : count.keySet()) {
            heap.offer(word);
        }

        while (result.size() < k) {
            result.add(heap.remove());
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
        System.out.println(sol.topKFrequent(words, 4));
    }
}