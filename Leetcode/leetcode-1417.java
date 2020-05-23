import java.util.*;

class Solution {
    public String reformat(String s) {
        Stack<Character> charStack = new Stack<>();
        Stack<Character> numStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                charStack.push(c);
            else
                numStack.push(c);
        }

        if (((charStack.isEmpty() && numStack.size() > 1) || (numStack.isEmpty() && charStack.size() > 1))
                || Math.abs(numStack.size() - charStack.size()) > 1) {
            return "";
        }

        Stack<Character> max = charStack.size() >= numStack.size() ? charStack : numStack;
        Stack<Character> min = charStack.size() >= numStack.size() ? numStack : charStack;

        // System.out.println(max.peek());
        // System.out.println(min.peek());
        StringBuilder sb = new StringBuilder();
        while (!max.isEmpty() && !min.isEmpty()) {
            sb.append(max.pop());
            sb.append(min.pop());
        }

        if (!max.isEmpty())
            sb.append(max.pop());

        if (!min.isEmpty())
            sb.append(min.pop());

        String result = sb.toString();
        // System.out.println(result);
        return result;
    }
}