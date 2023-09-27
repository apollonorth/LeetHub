
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && i < nums.length - 1) {
                if(nums [i + 1] == 0) {
                   for(int j = i + 2; j < nums.length; j++) {
                        if(nums[j] != 0) {
                            nums[i] = nums[j];
                            nums[j] = 0;
                            break;
                        }
                    }
                }
            else {
                nums[i] = nums[i + 1];
                nums[i + 1] = 0;
            }
            }
        }
    }
}
