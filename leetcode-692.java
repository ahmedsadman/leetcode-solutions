import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        PriorityQueue<String> heap = new PriorityQueue<>(
                (a, b) -> count.get(a).equals(count.get(b)) ? b.compareTo(a) : count.get(a) - count.get(b));
        List<String> result = new ArrayList<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : count.keySet()) {
            heap.offer(word);
            // always keep the best k elements only
            if (heap.size() > k)
                heap.remove();
        }

        while (!heap.isEmpty()) {
            result.add(heap.remove());
        }

        // reverse the array, to get the best ones first
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        sol.topKFrequent(words, 2);
    }
}