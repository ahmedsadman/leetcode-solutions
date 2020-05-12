import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i = 0;
        int curr = 1;
        List<String> ops = new ArrayList<>();
        while (i < target.length) {
            ops.add("Push");

            if (target[i] != curr)
                ops.add("Pop");
            else
                i++;

            curr++;
        }

        return ops;
    }
}