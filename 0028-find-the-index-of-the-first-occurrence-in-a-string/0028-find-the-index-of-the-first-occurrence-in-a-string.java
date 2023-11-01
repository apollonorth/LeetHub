
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean substring = true;
                for (int j = 0, k = i; j < needle.length(); j++, k++) {
                    if (k >= haystack.length() || haystack.charAt(k) != needle.charAt(j)) {
                        substring = false;
                        break;
                    }
                }
                if (substring) return i;
            }
        }
        return -1;
    }
}
