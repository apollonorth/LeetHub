class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;

        while (index1 < length1 && index2 < length2) {
            if(nums1[index1] > nums2[index2]) {
                index2++;
            }
            else if (nums1[index1] < nums2[index2]) {
                index1++;
            }
            else { //else they are equal elements
                return nums1[index1];
            }
        }

        return -1;
    }
}