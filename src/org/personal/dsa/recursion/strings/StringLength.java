package org.personal.dsa.recursion.strings;

public class StringLength {
    public static int findStringLength(char[] arr, int index){
        // base case
        if(index == arr.length || arr[index] == ' ')
            return 0;
        // recursive call
        int len = findStringLength(arr, index+1);
        // calculation
        return len+1;

        /*
        In the above approach, we are counting from last element. We trust that
        recursion will give us the length for the subarray we called it for. Then
        to return the final length we add 1 to the returned length by recursion.

        Same, could be done if index was passed as arr.length-1; we just had to call
        the subarray on the left of last element.
         */
    }
}
