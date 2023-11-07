class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> outputList = new ArrayList<>();
        outputList.add(new ArrayList<>());
        outputList.add(new ArrayList<>());
        
        Integer[] nums1Arr = new Integer[nums1.length];
        int i = 0;
        for (int value : nums1) {
            nums1Arr[i++] = Integer.valueOf(value);
        }
        Integer[] nums2Arr = new Integer[nums2.length];
        int j = 0;
        for (int value : nums2) {
            nums2Arr[j++] = Integer.valueOf(value);
        }
        List<Integer> nums1List = Arrays.asList(nums1Arr);
        List<Integer> nums2List = Arrays.asList(nums2Arr);
        for(int elm: nums1) {
            if(!nums2List.contains(elm) && !outputList.get(0).contains(elm))
                outputList.get(0).add(elm);
        }
        
         for(int elm: nums2) {
            if(!nums1List.contains(elm) && !outputList.get(1).contains(elm))
                outputList.get(1).add(elm);
        }
        
        return outputList;
    }
}