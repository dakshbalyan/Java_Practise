package org.personal.dsa.algorithms.sorting;

import java.util.Random;

public class Quicksort {
    Random random = new Random();

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);

            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        // GFG Method to put the elem at its correct position
        // while iterating over the arr
        /*
        int pivot = random.nextInt(end - start + 1) + start;
        swap(arr, pivot, end);
        pivot = arr[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);
        return i + 1;
         */

        // Normal method -> putting all elem less than
        // pivot on left and greater than on right
        int pivotIndex = random.nextInt(end - start + 1 ) + start;
        int pivot = arr[pivotIndex];
        int cntLessThan = 0;
        for (int i = start; i <= end; i++) {
            if(arr[i] <= pivot )
                cntLessThan++;
        }

        swap(arr, start+cntLessThan-1, pivotIndex);

        pivotIndex = start+cntLessThan-1;

        int i = start, j = end;
        while(i < pivotIndex && j > pivotIndex){
            if(arr[i] <= pivot){
                i++;
            }else if(arr[j] >= pivot){
                j--;
            }else{
                swap(arr, i , j);
            }
        }

        return pivotIndex;
    }

    private void swap(int[] arr, int start, int end) {
        if (start != end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }
}
