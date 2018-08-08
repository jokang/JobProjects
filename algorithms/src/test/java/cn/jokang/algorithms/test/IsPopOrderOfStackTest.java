package cn.jokang.algorithms.test;

import cn.jokang.algorithms.IsPopOrderOfStack;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IsPopOrderOfStackTest {

  @Test
  public void test1() {
    IsPopOrderOfStack isPopOrderOfStack = new IsPopOrderOfStack();
    List<Integer> stackData = new ArrayList<Integer>() {{
      add(1);
      add(2);
      add(3);
      add(4);
      add(5);
    }};

    List<Integer> popOrder = new ArrayList<Integer>() {{
      add(4);
      add(5);
      add(3);
      add(2);
      add(1);
    }};

    Assert.assertTrue(isPopOrderOfStack.isPopOrderOfStack(stackData, popOrder));
  }

}
