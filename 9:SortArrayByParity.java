/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
**/


class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int i = 0;
        int j = 0;
        while(i < length && j < length) {
            i = getPosition(A, i, true);
            j = getPosition(A, j, false);
            // System.out.println("even " + i);
            // System.out.println("odd " + j);
            if(i < length && j < length) {
                if(i > j) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                } else {
                    i++;
                }
            } else break;
        }
        return A;
    }
    private int getPosition(int[] arr, int posion, boolean isEven) {
        int length = arr.length;
        int comp = 0;
        if(!isEven)
            comp = 1;
        int i = posion;
        for(i = posion; i < length; i++){
            if(arr[i] % 2 == comp)
                break;
        }
        return i;
    }
}
