package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    private List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ret = new ArrayList<>();
        backtracking(candidates, 0, target, ret, new ArrayList<>());
        return ret;
    }

    private void backtracking(int[] candidates, int start, int remain, List<List<Integer>> ret, List<Integer> tempList) {
        if (remain == 0) {
            ret.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
                tempList.add(candidates[i]);
                backtracking(candidates, i + 1, remain - candidates[i], ret, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
        // if (remain < 0) do nothing.
    }

    public static void main(String[] args) {
        CombinationSum2 c = new CombinationSum2();

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(c.combinationSum2(candidates, 8));
    }
}
