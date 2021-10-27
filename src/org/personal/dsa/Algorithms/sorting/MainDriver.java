package org.personal.dsa.Algorithms.sorting;

public class MainDriver {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();

//        Selection sort = new Selection();
//        sort.selectsort(arr);

//        OptimisedBubble sort = new OptimisedBubble();
//        sort.optimumBubble(arr);
//        sort.recursiveBubble(arr, arr.length);

//        Insertion sort = new Insertion();
//        sort.insertionSort(arr);

//        Quicksort sort = new Quicksort();
//        sort.quickSort(arr, 0 , arr.length - 1);

        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}
