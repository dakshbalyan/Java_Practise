package org.personal.dsa.Algorithms.sorting;

public class Insertion {
    public void insertionSort(int[] arr) {
        int ptr = 1;
        while (ptr < arr.length) {
            int minIndex = Integer.MAX_VALUE;
            for (int i = ptr - 1; i >= 0; i--) {
                if (arr[ptr] < arr[i])
                    minIndex = Math.min(i, minIndex);
            }
            pushForward(arr, minIndex, ptr++);
            System.out.print(ptr - 1 + " pass: ");
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    private void pushForward(int[] arr, int start, int end) {
        for (int i = end; i > start; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }
}
