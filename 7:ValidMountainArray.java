/*
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true
**/

class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int length = A.length;
        if(length < 3)
            return false;
        int mPoint = mountainPoint(A);
        if(mPoint >= length - 1 || mPoint == 0)
            return false;
        int i = mPoint;
        while(i < length - 1 && A[i] > A[i+1])
            i++;
        if(i == length - 1)
            return true;
        else return false;
    }
    public int mountainPoint(int[] A) {
        int i = 0;
        while(i < A.length - 1 && A[i] < A[i+1])
            i++;
        return i;
    } 
}
