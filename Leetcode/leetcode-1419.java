class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] letters = new int[5]; // CROAK
        int frogs = 0;
        int maxFrogs = 0;

        for (int i = 0; i < croakOfFrogs.length(); i++) {
            Character ch = croakOfFrogs.charAt(i);
            int charIndex = "croak".indexOf(ch);
            letters[charIndex]++;

            if (charIndex == 0) {
                // new frog encountered, so increase count
                frogs++;
                maxFrogs = Math.max(maxFrogs, frogs);
            } else if (--letters[charIndex - 1] < 0) {
                // if no frog sang the previous letter, then it's surely invalid sequence
                // ex: "croakcrook" is invalid sequence
                return -1;
            } else if (charIndex == 4) {
                // one frog finished croaking, so decrease no of frogs
                frogs--;
            }
        }

        // all frogs have to finish croaking, otherwise it's invalid
        // ex: "croakcroa" is invalid
        return (frogs == 0) ? maxFrogs : -1;
    }
}