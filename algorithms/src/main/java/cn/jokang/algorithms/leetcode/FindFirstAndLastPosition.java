package cn.jokang.algorithms.leetcode;

import java.util.Arrays;

// 34. Find First and Last Position of Element in Sorted Array
public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};

        int leftMostIdx = searchLeftMost(nums, target);
        int rightMostId = searchRightMost(nums, target);

        return new int[]{leftMostIdx, rightMostId};
    }

    private int searchLeftMost(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (target < nums[mid]) {
                r = mid - 1;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                if (mid - 1 >= 0 && nums[mid - 1] == target) {
                    r = mid - 1;
                } else {
                    l = mid;
                    break;
                }
            }
        }

        return (l >= 0 && l < nums.length && nums[l] == target) ? l : -1;
    }

    private int searchRightMost(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (target < nums[mid]) {
                r = mid - 1;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                if (mid + 1 < nums.length && nums[mid + 1] == target) {
                    l = mid + 1;
                } else {
                    r = mid;
                    break;
                }
            }
        }

        return (r >= 0 && r < nums.length && nums[r] == target) ? r : -1;
    }

    public static void main(String[] args) {
        FindFirstAndLastPosition f = new FindFirstAndLastPosition();
        System.out.println(f.searchLeftMost(new int[]{2}, 2));
        System.out.println(f.searchLeftMost(new int[]{2, 2}, 2));
        System.out.println(f.searchLeftMost(new int[]{2, 2}, 1));
        System.out.println(f.searchLeftMost(new int[]{1, 2, 2, 2, 3}, 2));
        System.out.println(f.searchLeftMost(new int[]{1, 2, 2, 2}, 2));
        System.out.println(f.searchLeftMost(new int[]{1, 2, 2, 2}, 5));
        System.out.println(f.searchLeftMost(new int[]{1, 2, 2, 2}, 0));

        System.out.println(f.searchRightMost(new int[]{2}, 2));
        System.out.println(f.searchRightMost(new int[]{2, 2}, 2));
        System.out.println(f.searchRightMost(new int[]{2, 2}, 1));
        System.out.println(f.searchRightMost(new int[]{1, 2, 2, 2, 3}, 2));

        System.out.println(Arrays.toString(f.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}
