import java.lang.StringBuilder;
class Solution {
    public String reverseWords(String s) {
        String[] split = s.split("\\s+");
        StringBuilder build = new StringBuilder();
        for(int i = split.length - 1; i>=0; i--) {
            build.append(split[i] + " ");
        }
        
        return build.toString().trim();
    }
}