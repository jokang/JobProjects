package cn.jokang.algorithms.leetcode;

// #53
@SuppressWarnings("WeakerAccess")
public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    // 记录以nums[i]结尾的最大子数组和
    int[] maxSums = new int[nums.length];
    int currentMax = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int candidate = nums[i] + maxSums[i - 1]; // 如果连上前一个字符得到的结果
      if (candidate > nums[i]) {
        maxSums[i] = candidate;
      } else {
        maxSums[i] = nums[i];
      }

      currentMax = maxSums[i] > currentMax ? maxSums[i] : currentMax;
    }

    return currentMax;
  }

  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    MaximumSubarray m = new MaximumSubarray();
    System.out.println(m.maxSubArray(nums));
  }
}
