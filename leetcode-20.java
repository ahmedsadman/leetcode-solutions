import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            // if current char is closing bracket, then stack cannot be empty
            // because empty means there was no opening bracket earlier
            if (stack.isEmpty())
                return false;

            if (c == ')' && stack.pop() != '(') {
                return false;
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
