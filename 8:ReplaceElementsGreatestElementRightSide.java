/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.

Example 1:
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
**/

class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int tmp = arr[length-1];
        int max = tmp;
        arr[length - 1] = -1;
        for(int i = length - 2; i >= 0; i --) {
            tmp = arr[i];
            arr[i] = max;
            if(max < tmp)
                max = tmp;
        }
        return arr;
    }
}
