class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: nums) {
            queue.offer(num);
        }
        
        k = nums.length - k;
        
        for(int i = 0; i <= k; i++) {
            if(i == k)
                return queue.poll();
            else
                queue.poll();
        }
        
        return k;
    }
}