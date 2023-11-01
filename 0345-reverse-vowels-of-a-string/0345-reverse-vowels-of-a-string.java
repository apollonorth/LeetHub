class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0)
            return s;
        String vowels = "aeiouAEIOU";
        char [] charArr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(right > left) {
            while (right > left && !vowels.contains(charArr[left] + ""))
                left++;
            
            while(right > left && !vowels.contains(charArr[right] + ""))
                right--;
            
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(charArr);
    }
}