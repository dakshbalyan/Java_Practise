package org.personal.foobar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Level1 {
    public static int[] solution(int[] data, int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (hmap.containsKey(data[i])) {
                hmap.put(data[i], hmap.get(data[i]) + 1);
            } else {
                hmap.put(data[i], 1);
            }
        }

        List<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < data.length; i++) {
            if (hmap.get(data[i]) <= n) {
                al.add(data[i]);
            }
        }
        int[] arr = new int[al.size()];
        int ptr = 0;
        for (Integer x : al) {
            arr[ptr++] = x;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int n = 1;
        int[] res = solution(arr, n);
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
