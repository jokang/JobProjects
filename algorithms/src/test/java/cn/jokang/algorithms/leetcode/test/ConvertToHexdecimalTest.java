package cn.jokang.algorithms.leetcode.test;

import cn.jokang.algorithms.leetcode.ConvertToHexdecimal;
import org.junit.Assert;
import org.junit.Test;

public class ConvertToHexdecimalTest {

    @Test
    public void testPositive() {
        ConvertToHexdecimal c = new ConvertToHexdecimal();
        Assert.assertEquals("1", c.toHex(1));
        Assert.assertEquals("a", c.toHex(10));
    }
}
