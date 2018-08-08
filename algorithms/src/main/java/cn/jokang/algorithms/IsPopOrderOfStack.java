package cn.jokang.algorithms;

import java.util.List;
import java.util.Stack;

/**
 * 判断是否是栈的弹出序列。 《剑指Offer》22
 */
public class IsPopOrderOfStack {

  public boolean isPopOrderOfStack(List<Integer> stackData, List<Integer> popOrder) {
    boolean isPossible = false;

    if (stackData == null || popOrder == null || stackData.size() == 0 || popOrder.size() == 0
        || stackData.size() != popOrder.size()) {
      return false;
    }

    Stack<Integer> tmpStack = new Stack<>();
    int stackDataIdx = 0;
    int checkingPopOrderIdx = 0;
    while (stackDataIdx < stackData.size()) {
      if (tmpStack.size() > 0 && tmpStack.peek().equals(popOrder.get(checkingPopOrderIdx))) {
        tmpStack.pop();
        checkingPopOrderIdx += 1;
      } else {
        tmpStack.push(stackData.get(stackDataIdx));
        stackDataIdx += 1;
      }
    }

    return checkingPopOrderIdx == popOrder.size();
  }

}
