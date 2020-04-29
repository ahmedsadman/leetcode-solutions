class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int[] hash = new int[256]; // to store letter count
        int count = p.length();

        if (s == null || s.length() == 0)
            return list;

        // fill up the hash data
        for (char c : p.toCharArray()) {
            hash[c]++;
        }

        while (right < s.length()) {
            // decrement the associated hash value as we move
            // if an anagram letter is found, decrement count as well
            if (hash[s.charAt(right++)]-- >= 1)
                count--;

            // if count gets to 0, it means we found an anagram permutation
            if (count == 0)
                list.add(left);

            // if anagram letter is not found within anagram length, narrow
            // window by updating 'left' value and reset hash by increasing hash count
            // Here the >=0 part ensures that we are dealing with a letter
            // from the anagram, because the anagram letter count will never
            // go below zero, as the working of the algorithm
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0)
                count++;
        }

        return list;
    }
}