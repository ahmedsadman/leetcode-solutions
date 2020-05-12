/*
 * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1] b = arr[j] ^ arr[j + 1] ^ ... ^
 * arr[k]
 * 
 * Assume a == b, thus a ^ a = b ^ a, thus 0 = b ^ a, (as a ^ a = 0) thus arr[i]
 * ^ arr[i + 1] ^ ... ^ arr[j - 1] ^ arr[j] ^ arr[j + 1] ^ ... ^ arr[k] = 0
 * 
 * So you just need to find all segments where XOR equals zero.
 * 
 * For all pairs of i and k, where arr[i] ^ arr[i + 1] ^ ... ^ arr[k] = 0, then any j (i < j <= k) will be good to set as the answer
 */
class Solution {
    public int countTriplets(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == 0)
                    ans += j - i;
            }
        }

        return ans;
    }
}