class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;
        String vowels = "AEIOUaeiou";
        for(int i = 0; i < s.length(); i++) {
            if(vowels.indexOf(s.charAt(i)) >= 0) {
                currentVowels++;
            }
            
            if(i >= k) {
                if(vowels.indexOf(s.charAt(i - k)) >= 0)
                    currentVowels--;
            }
               
            maxVowels = Math.max(currentVowels, maxVowels);
        }
        
        return maxVowels;
    }
}