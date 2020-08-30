/*Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
**/

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] == 1) {
                count = consecutiveCount(nums, i, 1);
                //System.out.println("count " + count);
                i = i + count;
            }
            if (res < count)
                res = count;
        }
        return res;
    }
    public int consecutiveCount(int[] arr, int posion, int item) {
        int count = 0;
        for(int i = posion; i<arr.length; i++){
            if(arr[i] == item) {
                if(i < arr.length - 1 && arr[i] != arr[i+1]) {
                    count++;
                    break;
                } else count++; 
            }
        }
        return count;
    }
}
