package cn.jokang.algorithms.test;

import cn.jokang.algorithms.JumpGame;
import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {
    private int[] nums1 = new int[]{2, 3, 1, 1, 4};
    private int[] nums2 = new int[]{3, 2, 1, 0, 4};

    @Test
    public void testBacktracking() {
        JumpGame jumpGame = new JumpGame();
        Assert.assertTrue(jumpGame.canJumpBacktracking(nums1));
        Assert.assertFalse(jumpGame.canJumpBacktracking(nums2));
    }

    @Test
    public void testTopDown() {
        JumpGame jumpGame = new JumpGame();

        Assert.assertTrue(jumpGame.canJumpTopDown(nums1));
        Assert.assertFalse(jumpGame.canJumpBacktracking(nums2));
    }


    @Test
    public void testBottomUp() {
        JumpGame jumpGame = new JumpGame();

        Assert.assertTrue(jumpGame.canJumpBottomUp(nums1));
        Assert.assertFalse(jumpGame.canJumpBottomUp(nums2));
    }


    @Test
    public void testGreedy() {
        JumpGame jumpGame = new JumpGame();

        Assert.assertTrue(jumpGame.canJumpGreedy(nums1));
        Assert.assertFalse(jumpGame.canJumpGreedy(nums2));
    }
}
