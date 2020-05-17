import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            Character c = num.charAt(i);
            while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // for corner case like '11111'
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // build the string
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        // remove leading zeros
        // find first non zero index
        int firstNonZeroIdx = -1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                firstNonZeroIdx = i;
                break;
            }
        }

        String result = "0";

        if (firstNonZeroIdx >= 0 && sb.length() > 0) {
            result = sb.substring(firstNonZeroIdx).toString();
        }

        return result;
    }
}