class Solution {
    public int pivotIndex(int[] nums) {
        int sumTotal = 0;
        for(int elm: nums) {
            sumTotal += elm;
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++) {
            rightSum = sumTotal - nums[i] - leftSum;
            
            if(rightSum == leftSum)
                return i;
            
            leftSum += nums[i];
        }
        return -1;
    }
}