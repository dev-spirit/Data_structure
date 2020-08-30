/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
**/

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int length = nums.length;
        
        int first = Integer.MIN_VALUE;
        int second = first;
        int third = second;
        
        if(length == 2) {
            if(nums[0] > nums[1])
                return nums[0];
            else return nums[1];
        }
        else {
            first = nums[0];
            second = first;
            third = second;
            int i = 1;
            while(first < second && i < length) {
                second = nums[i++];
            }
            System.out.println("second" + second);
            while(second < third && i < length) {
                third = nums[i++];
            }
            return third;
        }
    }
}
