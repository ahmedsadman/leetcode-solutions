import java.util.*;

class MinStack {

    private Stack<Integer> stack;
    private Stack<int[]> minStack; // 0 -> value, 1 -> count

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        // always push to main
        stack.push(x);

        // add to stack if min stack is empty or less then the top
        if (minStack.isEmpty() || x < minStack.peek()[0])
            minStack.push(new int[] { x, 1 });

        // if already exists, then increase the count
        else if (minStack.peek()[0] == x)
            minStack.peek()[1]++;
    }

    public void pop() {
        // remove from the main stack
        int x = stack.pop();

        // now remove from in stack if condition meets
        if (minStack.peek()[0] == x)
            minStack.peek()[1]--;

        // if the count reaches 0, pop it
        if (minStack.peek()[1] == 0)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek()[0];
    }
}