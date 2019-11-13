import java.util.*;

class Solution {
    public int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);

        int child = 0;

        for (int cookie = 0; child < children.length && cookie < cookies.length; cookie++) {
            if (cookies[cookie] >= children[child])
                child++;
        }

        return child;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] g = { 7, 8, 9, 10 };
        int[] s = { 5, 6, 7, 8 };
        System.out.println(sol.findContentChildren(g, s));
    }
}