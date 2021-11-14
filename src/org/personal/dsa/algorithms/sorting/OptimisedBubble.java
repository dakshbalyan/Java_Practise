package org.personal.dsa.algorithms.sorting;

public class OptimisedBubble {
    public void optimumBubble(int[] arr) {
        while (true) {
            boolean swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public void recursiveBubble(int[] arr, int n) {
        if (n == 1)
            return;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }

        recursiveBubble(arr, n - 1);
    }
}
