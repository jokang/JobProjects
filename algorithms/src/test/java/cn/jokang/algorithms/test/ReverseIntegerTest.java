package cn.jokang.algorithms.test;

import cn.jokang.algorithms.ReverseInteger;
import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

  @Test
  public void testPositive() {
    ReverseInteger reverseInteger = new ReverseInteger();
    Assert.assertEquals(321, reverseInteger.reverse(123));
  }

  @Test
  public void testNegtive() {
    ReverseInteger reverseInteger = new ReverseInteger();
    Assert.assertEquals(-321, reverseInteger.reverse(-123));
  }

}
