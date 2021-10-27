package org.personal.dsa.recursion.strings;

public class RemoveChar {
    public static void removeCharFromString(char[] arr, int index, char ch){
        // base case
        if( index == arr.length )
            return;

        // recursive call
        removeCharFromString(arr, index+1, ch);

        // calculation
        if(arr[index] == ch)
//            arr[index] = '*';
            shiftToLeftByOne(arr, index);

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
