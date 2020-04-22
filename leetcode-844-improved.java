class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        
        while (i >= 0 || j >= 0) {
            i = getSkipCount(S, i);
            j = getSkipCount(T, j);
            
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            
            // check if either string is exhausted
            if ((i >= 0) != (j >= 0))
                return false;
            
            i--;
            j--;
        }
        
        return true;
    }
    
    private int getSkipCount(String S, int i) {
        int skip = 0;
        while (i >= 0) {
            if (S.charAt(i) == '#') {
                skip++;
                i--;
            } else if (skip > 0) {
                skip--;
                i--;
            } else break;
        }
        return i;
    }
}