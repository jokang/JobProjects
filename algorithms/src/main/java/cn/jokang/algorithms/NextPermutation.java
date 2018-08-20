package cn.jokang.algorithms;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 1) return;

        // 1.找到最后的增序对
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverseToEnd(nums, i + 1);

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverseToEnd(int[] nums, int startIdx) {
        int endIdx = nums.length - 1;
        while (startIdx < endIdx) {
            swap(nums, startIdx, endIdx);
            startIdx++;
            endIdx--;
        }
    }
}
