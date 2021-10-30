package org.personal.dsa.recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums).forEach(e-> System.out.println(e));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        allPermutations(nums, res,freq,ans);

        return ans;
    }

    private static void allPermutations(
            int[] nums, List<Integer> res, boolean[] freq, List<List<Integer>> ans){
        if(res.size() == nums.length){
            ans.add(new ArrayList<Integer>(res));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(!freq[i]){
                res.add(nums[i]);
                freq[i] = true;
                allPermutations(nums, res, freq, ans);
                res.remove(res.size()-1);
                freq[i] = false;
            }
        }
    }
        /*
        We have nums.length number of decisions to make
        while branching the trees from nums
        Similar to keypad ques but not subsequences; need
        all permutations
        num.length! combinations will be there
        Maintain 2 arrays -> 1 containing res & other having choice of selection
        When res is full -> print/store res; res will be of length nums.length;
        then while going up the tree unmark the recent added choice
        This way we can reach every permutation
        */
}
