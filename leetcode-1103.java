class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i = 0;
        int j = 1;
        int[] arr = new int[num_people];

        while (candies > 0) {
            // distribute candies and update values
            arr[i++] += j;
            candies -= j;

            // check if we need to start from the first
            if (i > num_people - 1)
                i = 0;

            // check if we have enough candies to increment j
            // otherwise, assign remaining candies to j
            j = (j + 1 <= candies) ? j + 1 : candies;
        }
        return arr;
    }
}