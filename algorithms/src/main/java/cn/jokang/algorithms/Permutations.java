package cn.jokang.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 打印排列。
 * 深度遍历一棵树。选择+递归+回溯
 */
public class Permutations {
    private List<List<Integer>> ret = new ArrayList<>();
    private int[] nums;
    private boolean[] used;
    private int[] currentPermutation; // 保存当前的探测路径

    public List<List<Integer>> permute(int[] nums) {
        if (null == nums || nums.length == 0) return Collections.emptyList();

        used = new boolean[nums.length];
        this.nums = nums;
        currentPermutation = new int[nums.length];

        recursivePermute(0);

        return ret;
    }

    private void recursivePermute(int currentIdx) {
        if (currentIdx == nums.length) {
            List<Integer> lst = new ArrayList<>();
            for (int i : currentPermutation) {
                lst.add(i);
            }
            ret.add(lst);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            currentPermutation[currentIdx] = nums[i];
            recursivePermute(currentIdx + 1);

            // 回溯
            used[i] = false;
        }
    }
}
