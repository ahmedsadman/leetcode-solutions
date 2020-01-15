// Explanation: https://www.geeksforgeeks.org/the-celebrity-problem

// Leetcode 277 - Find the celebrity
// Premium Question - Couldn't submit solution for judge verification

import java.util.*;

class Solution {
    // Person with 2 is celebrity
    // private int MATRIX[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, {
    // 0, 0, 1, 0 } };

    // private boolean knows(int a, int b) {
    // boolean res = (MATRIX[a][b] == 1) ? true : false;
    // return res;
    // }

    public int findCelebrity(int n) {
        Stack<Integer> stack = new Stack<>();

        // push all people to stack
        for (int i = 0; i < n; i++)
            stack.push(i);

        // check the stack for celebrity by comparing two person at once
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (knows(a, b)) {
                // 'a' is not celebrity, so 'b' might be
                stack.push(b);
            } else {
                // 'a' might be celebrity
                stack.push(a);
            }
        }

        // check if the final standing person is a celebrity
        int finalPerson = stack.pop();

        for (int i = 0; i < n; i++) {
            if (finalPerson != i && (knows(finalPerson, i) || !knows(i, finalPerson)))
                return -1;
        }

        return finalPerson;
    }

    // public static void main(String[] args) {
    // Solution sol = new Solution();
    // int n = 4;
    // int result = sol.findCelebrity(n);
    // if (result == -1) {
    // System.out.println("No Celebrity");
    // } else
    // System.out.println("Celebrity ID " + result);
    // }
}