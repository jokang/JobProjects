package cn.jokang.algorithms.leetcode.test;

import cn.jokang.algorithms.leetcode.SumOfSquareNumbers;
import org.junit.Assert;
import org.junit.Test;

public class SumOfSquareNumbersTest {
    @Test
    public void test() {
        SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();
        Assert.assertTrue(sumOfSquareNumbers.judgeSquareSum(2));
        Assert.assertTrue(sumOfSquareNumbers.judgeSquareSum(4));
        Assert.assertTrue(sumOfSquareNumbers.judgeSquareSum(5));
        Assert.assertTrue(sumOfSquareNumbers.judgeSquareSum(1000));
        Assert.assertTrue(sumOfSquareNumbers.judgeSquareSum(100000));
        Assert.assertFalse(sumOfSquareNumbers.judgeSquareSum(999999999));
    }
}
