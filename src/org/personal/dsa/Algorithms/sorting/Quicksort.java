package org.personal.dsa.Algorithms.sorting;

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
    }

    private void swap(int[] arr, int start, int end) {
        if (start != end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }
}
