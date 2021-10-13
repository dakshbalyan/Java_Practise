package org.mediaagility.training.assignments.fourth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueIntegers {
    public static void main(String[] args) {
        List<Integer> list = new UniqueIntegers().generateRandomIntegers(10000);


        Set<Integer> set = new HashSet<>();
        for(Integer x : list) {
            set.add(x);
        }

        System.out.println("ListSize : "+list.size());
        System.out.println("SetSIze : "+set.size());
    }

    private List<Integer> generateRandomIntegers(int length){
        List<Integer> res = new ArrayList<>(length);

        for(int i = 0 ; i < length ; i++){
            int num = (int)(Math.random() * (1000 - 0)) + 0;
            res.add(num);
        }

        return res;
    }
}
