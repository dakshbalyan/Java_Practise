package org.personal.dsa.recursion.strings;

public class RemoveContiguousDuplicate {
    public static void removeDuplicates(char[] arr, int index){
        // base case
        if(index == arr.length || index == arr.length-1)
            return;
        // recursive call
        removeDuplicates(arr,index+1);
        // calculation
        if(arr[index] == arr[index+1]){
            shiftToLeftByOne(arr,index);
        }

        return;
    }

    private static void shiftToLeftByOne(char[] newArr, int index) {
        int i = index;
        // \u0000 is unicode for null character
        while(i < newArr.length-1){
            newArr[i] = newArr[i+1];
            i++;
        }
        newArr[i] = ' ';
    }
}
