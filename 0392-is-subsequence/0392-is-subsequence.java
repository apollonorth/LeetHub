class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s == null || t == null)
           return false;
        
        int indexS = 0;
        int indexT = 0;
        
        while(indexT < t.length() && indexS < s.length()) {
            if(s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }
            indexT++;
        }
        
        return indexS == s.length();
    }
}