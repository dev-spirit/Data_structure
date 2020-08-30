/*Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
**/

class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        for(int i=length -1; i>=0; i--)
            if(arr[i] == 0)
                shift(arr, i);
    }
    public void shift(int[] arr, int posion) {
        for(int i=arr.length-2; i>=posion; i--){
           arr[i+1] = arr[i]; 
        }
    }
}
