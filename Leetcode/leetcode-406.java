import java.util.*;

class Solution {
    /*
     * Approach: Greedy (Leetcode Premium Solution):
     * 
     * Let's start from the simplest case, when all guys (h, k) in the queue are of
     * the same height h, and differ by their k values only (the number of people in
     * front who have a greater or the same height). Then the solution is simple:
     * each guy's index is equal to his k value. The guy with zero people in front
     * takes the place number 0, the guy with 1 person in front takes the place
     * number 1, and so on and so forth.
     * 
     * This strategy could be used even in the case when not all people are of the
     * same height. The smaller persons are "invisible" for the taller ones, and
     * hence one could first arrange the tallest guys as if there was no one else.
     * 
     * Let's now consider a queue with people of two different heights: 7 and 6. For
     * simplicity, let's have just one 6-height guy. First follow the strategy above
     * and arrange guys of height 7. Now it's time to find a place for the guy of
     * height 6. Since he is "invisible" for the 7-height guys, he could take
     * whatever place without disturbing 7-height guys order. However, for him the
     * others are visible, and hence he should take the position equal to his
     * k-value, in order to have his proper place.
     * 
     * Algorithm
     * 
     * Sort people:
     * 
     * In the descending order by height.
     * 
     * Among the guys of the same height, in the ascending order by k-values.
     * 
     * Take guys one by one, and place them in the output array at the indexes equal
     * to their k-values.
     * 
     * Return output array. Time complexity : (N^2). To sort people takes O(NlogN)
     * time. Then one proceeds to n insert operations, and each takes up to O(k)
     * time, where k is a current number of elements in the list.
     */
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        List<int[]> output = new LinkedList<>();

        for (int[] person : people) {
            // This method inserts an element at a specified index in the list. It shifts
            // the element currently at that position (if any) and any subsequent elements
            // to the right (will add one to their indices).
            output.add(person[1], person);
        }

        return output.toArray(new int[people.length][2]);
    }
}