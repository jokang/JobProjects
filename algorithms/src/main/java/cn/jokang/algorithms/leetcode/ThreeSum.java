package cn.jokang.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 15
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ret = new ArrayList<>();

    Arrays.sort(nums);
    for (int aIdx = 0; aIdx < nums.length - 1; aIdx++) {
      if (nums[aIdx] > 0) {
        break;
      }

      if (aIdx > 0 && nums[aIdx - 1] == nums[aIdx]) {
        continue;
      }

      int target = 0 - nums[aIdx];
      int left = aIdx + 1;
      int right = nums.length - 1;
      while (left < right) {
        int val = nums[left] + nums[right];
        if (val == target) {
          // Found one.
          List<Integer> lst = new ArrayList<>(3);
          lst.add(nums[aIdx]);
          lst.add(nums[left]);
          lst.add(nums[right]);
          ret.add(lst);

          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }
          left++;
          right--;
        } else if (val > target) {
          right--;
        } else {
          left++;
        }
      }

    }

    return ret;
  }

}
