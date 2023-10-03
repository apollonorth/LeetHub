class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for(int elm: gain) {
            currentAltitude += elm;
            if(currentAltitude > maxAltitude)
                maxAltitude = currentAltitude;
        }
        return maxAltitude;
    }
}