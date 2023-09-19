class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMax(candies);
        LinkedList<Boolean> boolList = new LinkedList<>();
        for(int i=0;i<candies.length;i++) {
            if(candies[i] + extraCandies >= max) 
                boolList.add(true);
            else
                boolList.add(false);
        }
        return boolList;
    }

    public int findMax(int[] candies) {
        int max = candies[0];
        for(int i: candies) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
}