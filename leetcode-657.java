class Solution {
    public boolean judgeCircle(String moves) {
        int[] coord = { 0, 0 };
        for (char c : moves.toCharArray()) {
            if (c == 'U')
                coord[1]++;
            else if (c == 'D')
                coord[1]--;
            else if (c == 'R')
                coord[0]++;
            else if (c == 'L')
                coord[0]--;
        }

        return (coord[0] == 0 && coord[1] == 0);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.judgeCircle("URULDD"));
    }
}