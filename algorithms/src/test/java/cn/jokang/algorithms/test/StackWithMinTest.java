package cn.jokang.algorithms.test;

import cn.jokang.algorithms.StackWithMin;
import org.junit.Assert;
import org.junit.Test;

public class StackWithMinTest {

  @Test
  public void test1() {
    StackWithMin<Integer> stack = new StackWithMin<>();
    stack.push(3);
    Assert.assertEquals(3, stack.min().intValue());

    stack.push(4);
    Assert.assertEquals(3, stack.min().intValue());

    stack.push(2);
    Assert.assertEquals(2, stack.min().intValue());

    stack.push(1);
    Assert.assertEquals(1, stack.min().intValue());

    stack.pop();
    Assert.assertEquals(2, stack.min().intValue());

    stack.pop();
    Assert.assertEquals(3, stack.min().intValue());

    stack.push(0);
    Assert.assertEquals(0, stack.min().intValue());
  }
}
