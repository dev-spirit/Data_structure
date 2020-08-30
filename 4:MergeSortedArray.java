/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 

Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n
**/

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArray = new int[m+n];
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j])
                newArray[k++] = nums1[i++];
            else newArray[k++] = nums2[j++];
        }
        while(i < m)
            newArray[k++] = nums1[i++];
        while(j < n)
            newArray[k++] = nums2[j++];
        for(i=0; i < newArray.length; i ++)
            nums1[i] = newArray[i];
    }
}