package org.personal.dsa.algorithms.sorting;

public class Selection {
    public void selectsort(int[] arr) {
        int minIndex = 0;
        while (minIndex < arr.length) {
            int currMinIndex = 0, currMin = Integer.MAX_VALUE;
            for (int i = minIndex; i < arr.length; i++) {
                if (currMin > arr[i]) {
                    currMin = arr[i];
                    currMinIndex = i;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex++] = arr[currMinIndex];
            arr[currMinIndex] = temp;
        }
    }
}
