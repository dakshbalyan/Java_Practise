package org.personal.dsa.Algorithms.sorting;

public class MergeSort {
    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int leftSize = m - l + 1;
        int rightSize = r - m;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j])
                arr[k] = left[i++];
            else
                arr[k] = right[j++];
            k++;
        }

        while (i < leftSize) {
            arr[k++] = left[i++];
        }

        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }
}
