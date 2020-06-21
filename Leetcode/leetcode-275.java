class Solution {
    /*
     * h index value is the number where arr[hindex] == arr.size() - hindex (as
     * exactly N - h values are there with value less than h)
     * 
     * It is possible to not have an exact number which is our h index but a number
     * in between 2 values.
     */
    public int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (citations[mid] == citations.length - mid)
                return citations[mid];
            else if (citations[mid] > citations.length - mid)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return citations.length - left;
    }
}