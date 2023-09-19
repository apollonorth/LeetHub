import java.lang.StringBuilder;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder merged = new StringBuilder();
        for(int i = 0; i < length1 && i < length2; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(length1 > length2) {
            for(int i = length2; i < (length1); i++) {
                merged.append(word1.charAt(i));
            }
        }
        else if(length2 > length1) {
            for(int i = length1; i < (length2); i++) {
                merged.append(word2.charAt(i));
            }
        }
        return merged.toString();
    }
}