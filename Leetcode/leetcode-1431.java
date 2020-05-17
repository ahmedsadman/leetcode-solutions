import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>();

        for (int i : candies)
            max = Math.max(max, i);

        for (int i : candies) {
            if (max - i <= extraCandies)
                list.add(true);
            else
                list.add(false);
        }

        return list;
    }
}