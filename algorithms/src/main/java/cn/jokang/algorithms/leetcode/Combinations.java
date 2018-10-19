package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"Duplicates", "WeakerAccess", "SameParameterValue"})
public class Combinations {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> solution = new ArrayList<>();
    backtrack(ans, solution, 1, n, k);

    return ans;
  }

  private void backtrack(List<List<Integer>> ans, List<Integer> solution, int start, int n, int remain) {
    if (remain == 0) {
      ans.add(new ArrayList<>(solution));
      return;
    }
    for (int i = start; i <= n; i++) {
      solution.add(i);
      backtrack(ans, solution, i + 1, n, remain - 1);
      solution.remove(solution.size() - 1);
    }
  }

  public static void main(String[] args) {
    Combinations c = new Combinations();
    System.out.println(c.combine(4, 2));
  }
}
