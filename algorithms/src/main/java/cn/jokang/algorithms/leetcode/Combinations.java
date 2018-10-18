package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings({"Duplicates", "WeakerAccess", "SameParameterValue"})
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] current = new int[k];
        Set<Integer> s = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            s.add(i + 1);
        }
        backtrack(ans, 0, current, s);

        return ans;
    }

    private void backtrack(List<List<Integer>> ans, int depth, int[] current, Set<Integer> candidates) {
        if (current.length == depth) {
            List<Integer> solution = new ArrayList<>();
            for (int i : current) {
                solution.add(i);
            }
            ans.add(solution);
            return;
        }
        Set<Integer> cs = new HashSet<>(candidates);
        for (int n : candidates) {
            current[depth] = n;
            if (depth >= 1 && current[depth - 1] > n) continue;
            cs.remove(n);
            backtrack(ans, depth + 1, current, cs);
            cs.add(n);
        }
    }

    public static void main(String[] args) {
        Combinations c = new Combinations();
        System.out.println(c.combine(4, 2));
    }
}
