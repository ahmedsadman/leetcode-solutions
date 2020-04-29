class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(')
                s1.push(i);
            else if (chars[i] == ')') {
                if (!s1.isEmpty())
                    s1.pop();
                else if (!s2.isEmpty())
                    s2.pop();
                else
                    return false;
            } else if (chars[i] == '*')
                s2.push(i);
        }

        while (!s1.isEmpty() && !s2.isEmpty()) {
            Integer value = s2.pop();
            if (s1.peek() < value)
                s1.pop();
        }

        return s1.isEmpty();
    }
}