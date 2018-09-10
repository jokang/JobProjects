package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    private List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (null == candidates || candidates.length == 0) return ret;

        Arrays.sort(candidates);
        int[] solution = new int[candidates.length];
        backtrack(candidates, solution, 0, target);

        return ret;
    }

    private void backtrack(int[] candidates, int[] solution, int k, int remain) {
        // k是要考察的candidate索引
        if (remain == 0) {
            // Find a solution.
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < solution.length; i++) {
                for (int j = 0; j < solution[i]; j++) {
                    l.add(candidates[i]);
                }
            }
            ret.add(l);
        } else if (remain < 0 || k == candidates.length) {
            // No more solution
            return;
        } else {
            for (int i = 0; i <= remain / candidates[k]; i++) {
                solution[k] = i;
                backtrack(candidates, solution, k + 1, remain - i * candidates[k]);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 7};
        int target = 7;
        CombinationSum c = new CombinationSum();
        System.out.println(c.combinationSum(nums, target));
    }
}
