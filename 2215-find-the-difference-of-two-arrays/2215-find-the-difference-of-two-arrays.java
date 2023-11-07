class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> outputList = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        for(int nums: nums1) {
            set1.add(nums);
        }
        
        for(int nums: nums2) {
            set3.add(nums);
        }
        
        for(int nums: nums2) {
            if(!set1.contains(nums))
                set2.add(nums);
        }
        
        set1.removeAll(set3);
        
        outputList.add(new ArrayList<>(set1));
        outputList.add(new ArrayList<>(set2));
        return outputList;
    }
}