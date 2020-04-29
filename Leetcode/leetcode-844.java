class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    private String build(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c != '#')
                stack.push(c);
            else if (!stack.empty())
                stack.pop();
        }

        return String.valueOf(stack);
    }
}