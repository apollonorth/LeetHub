class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        //Largest sum will decide largest average as all subarrays will be same length
        double maxSum = sum;

        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum / k;
    }
}