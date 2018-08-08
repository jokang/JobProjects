package cn.jokang.algorithms;

import java.util.List;
import java.util.Stack;

/**
 * 判断是否是栈的弹出序列。
 * 《剑指Offer》题22
 * 1.合法的出栈序列是卡塔兰数；
 * 2.为什么规定没有相等元素？
 */
public class IsPopOrderOfStack {

  public boolean isPopOrderOfStack(List<Integer> stackData, List<Integer> popOrder) {
    if (stackData == null || popOrder == null || stackData.size() == 0 || popOrder.size() == 0
        || stackData.size() < popOrder.size()) {
      return false;
    }

    Stack<Integer> tmpStack = new Stack<>();
    int stackDataIdx = 0;
    int checkingPopOrderIdx = 0;
    while (checkingPopOrderIdx < popOrder.size()) {
      while (tmpStack.isEmpty() || !tmpStack.peek().equals(popOrder.get(checkingPopOrderIdx))) {
        if (stackDataIdx >= stackData.size()) {
          break; // 无元素可压栈
        }
        tmpStack.push(stackData.get(stackDataIdx));
        stackDataIdx++;
      }

      if (!tmpStack.peek().equals(popOrder.get(checkingPopOrderIdx))) {
        break;
      }

      tmpStack.pop();
      checkingPopOrderIdx += 1;
    }

    return checkingPopOrderIdx == popOrder.size();
  }

}
