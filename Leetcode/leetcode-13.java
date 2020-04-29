class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map;
        map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int sum = 0;
        int next = 0;
        int prev = map.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            next = map.get(s.charAt(i));
            if (prev < next) {
                sum -= prev;
            } else {
                sum += prev;
            }

            prev = next;
        }

        // the last char value needs to be added at the end
        sum += prev;
        return sum;
    }
}