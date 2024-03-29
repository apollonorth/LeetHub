class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        n = len(nums)
            
        for i in range(n): 
            complement = target - nums[i]
            if complement in map and map[complement] != i:
                return [i, map[complement]]
            
            map[nums[i]] = i
            
        return []