package cn.jokang.algorithms;

import com.sun.deploy.util.ArrayUtil;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap<>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int other = target - num;
      if (null != m.get(other)) {
        return new int[]{i, m.get(other)};
      } else {
        m.put(num, i);
      }

    }
    return new int[]{};
  }

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    int[] ret = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
    for (int idx : ret) {
      System.out.println(idx);
    }
  }
}
