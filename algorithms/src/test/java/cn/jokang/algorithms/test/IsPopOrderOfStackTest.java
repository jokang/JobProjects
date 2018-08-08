package cn.jokang.algorithms.test;

import cn.jokang.algorithms.IsPopOrderOfStack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IsPopOrderOfStackTest {

  @Test
  public void test1() {
    IsPopOrderOfStack isPopOrderOfStack = new IsPopOrderOfStack();
    List<Integer> stackData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> popOrder = new ArrayList<>(Arrays.asList(4, 5, 3, 2, 1));
    Assert.assertTrue(isPopOrderOfStack.isPopOrderOfStack(stackData, popOrder));
  }

  @Test
  public void test2() {
    IsPopOrderOfStack isPopOrderOfStack = new IsPopOrderOfStack();
    List<Integer> stackData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> popOrder = new ArrayList<>(Arrays.asList(4, 3, 5, 1, 2));

    Assert.assertFalse(isPopOrderOfStack.isPopOrderOfStack(stackData, popOrder));
  }
}
