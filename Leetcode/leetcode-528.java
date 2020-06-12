/*
https://leetcode.com/problems/random-pick-with-weight/discuss/671445/Question-explained
*/

class Solution {
    private double[] probabilities;

    public Solution(int[] w) {
        this.probabilities = new double[w.length];
        double sum = 0;

        for (int weight : w)
            sum += weight;

        for (int i = 0; i < w.length; i++) {
            // get cumulative probabilities
            w[i] += (i == 0) ? 0 : w[i - 1];
            probabilities[i] = w[i] / sum;
        }
    }

    public int pickIndex() {
        // Math.random() -> generate a number between 0 and 1
        // Arrays.binarySearch -> returns found index. if not found, then it returns
        // -(insertion point) - 1;
        int index = Arrays.binarySearch(this.probabilities, Math.random());
        return Math.abs(index) - 1;
    }
}