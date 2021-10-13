package org.personal.dsa.recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {5,1};
        System.out.println(isSortedUsingRecursion(0, arr));
    }
/* Now, why does this work?
  From what my understanding has developed, the following logic is to call the
  function for the right half of the array and check if the right is sorted or not.
  Question then comes to mind, how would we do this ?
  Again, the base condition that is when the index; which helps the function know what
  part of array it has to check; reaches either the last element of the list or the end
  then surely that 1 element will be sorted. Thus, we return true.
  Now, upon getting true if there was a single element in the arr. We move on to check if
  the element at the current index is less than or greater than its next element or not.
  If it is then we return false which gets carried over the recursion call stack and tells
  the calling function that the subarray for which you called the result for is not
  sorted.
  */
    private static boolean isSortedUsingRecursion(int index,int[] arr) {
        // base condition
        if(index == arr.length || index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index+1])
            return false;

        return isSortedUsingRecursion(index + 1, arr);
    }
}
