package cn.jokang.algorithms;

// LeetCode No.55
public class JumpGame {
    // 1. Recursive Backtrace
    public boolean canJumpBacktracking(int[] nums) {
        return canJumpFromPosition(nums, 0);
    }

    private boolean canJumpFromPosition(int[] nums, int position) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nums, nextPosition)) {
                return true;
            }
        }

        return false;
    }

    // 2. Dynamic Programming Top-down
    enum Status {
        UNKNOWN, GOOD, BAD
    }

    private Status[] memo;

    public boolean canJumpTopDown(int[] nums) {
        // Initialize
        memo = new Status[nums.length];
        for (int i = 0; i < nums.length; i++) {
            memo[i] = Status.UNKNOWN;
        }
        memo[memo.length - 1] = Status.GOOD;

        return canJumpFromPositionTopDown(nums, 0);

    }

    private boolean canJumpFromPositionTopDown(int[] nums, int position) {
        if (memo[position] != Status.UNKNOWN) {
            return memo[position] == Status.GOOD;
        }

        int furthest = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthest; nextPosition++) {
            if (canJumpFromPositionTopDown(nums, nextPosition)) {
                memo[position] = Status.GOOD;
                return true;
            }
        }

        memo[position] = Status.BAD;
        return false;
    }

    // 3. Bottom-up
    public boolean canJumpFromPosistionBottomup(int[] nums, int position) {
        Status[] memo = new Status[nums.length];
        for (Status m : memo) {
            m = Status.UNKNOWN;
        }
        memo[memo.length - 1] = Status.GOOD;

        for (int i = nums.length - 2; i >= 0; i--) {
            int furthestJump = Math.max(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthestJump; j++) {
                if (memo[j] == Status.GOOD) {
                    memo[i] = Status.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Status.GOOD;
    }

    public boolean canJumpBottomUp(int[] nums) {
        return canJumpFromPosition(nums, 0);
    }

    // 4. Greedy
    public boolean canJumpGreedy(int[] nums) {
        int lastPosition = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= lastPosition) {
                lastPosition = i;
            }
        }

        return lastPosition == 0;
    }
}
