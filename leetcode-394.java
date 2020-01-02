import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                // get the count and push to count stack
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
                continue; // to avoid index being added again at last
            } else if (s.charAt(index) == '[') {
                // push the existing string to stack
                strings.push(result);
                result = "";
            } else if (s.charAt(index) == ']') {
                // build the string and append
                StringBuilder temp = new StringBuilder(strings.pop());
                int count = counts.pop();

                for (int i = 0; i < count; i++) {
                    temp.append(result);
                }

                result = temp.toString();
            } else {
                // append char to res
                result += s.charAt(index);
            }

            index++;
        }

        return result;
    }
}