/*
The final idea is to use index in nums as a hash key and
sign of the element as a hash value which is presence
detector.

For example, negative sign of nums[2] element means that
number 2 is present in nums. The positive sign of nums[3]
element means that number 3 is not present (missing) in
nums.

To achieve that let's walk along the array (which after
clean up contains only positive numbers), check each
element value elem and change the sign of element
nums[elem] to negative to mark that number elem is present
in nums. Be careful with duplicates and ensure that the
sign was changed only once.

Algorithm

Now everything is ready to write down the algorithm.

- Check if 1 is present in the array. If not, you're done and
1 is the answer.
- If nums = [1], the answer is 2.
- Replace negative numbers, zeros, and numbers larger than n
by 1s.
- Walk along the array. Change the sign of a-th element if
you meet number a. Be careful with duplicates : do sign
change only once. Use index 0 to save an information about
presence of number n since index n is not available.
- Walk again along the array. Return the index of the first
positive element.
- If nums[0] > 0 return n.
- If on the previous step you didn't find the positive
element in nums, that means that the answer is n + 1.
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean contains1 = false;
        int n = nums.length;

        for (int i : nums) {
            if (i == 1) {
                contains1 = true;
                break;
            }
        }

        if (!contains1)
            return 1;

        // data clean up
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            int a = Math.abs(nums[i]);
            if (a == n)
                nums[0] = -Math.abs(nums[0]);
            else
                nums[a] = -Math.abs(nums[a]);
        }

        for (int i = 1; i < n; i++)
            if (nums[i] > 0)
                return i;

        if (nums[0] > 0)
            return n;

        return n + 1;
    }
}