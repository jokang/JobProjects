package cn.jokang.algorithms.test;

import cn.jokang.algorithms.NextPermutation;
import org.junit.Assert;
import org.junit.Test;

public class NextPermutationTest {

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        Assert.assertArrayEquals(new int[]{1, 1}, nums);
    }
}
