package org.mediaagility.training.assignments.first;

public class Print2DArray {
    public static void main(String[] args) {
        String[][] arr = new String[3][4];      // arr[rows][column]

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = String.valueOf(i).concat(String.valueOf(j));
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
