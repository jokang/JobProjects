package cn.jokang.algorithms;

import java.util.Stack;

/**
 * 带有min函数的栈。 《剑指Offer》面试题21
 */
public class StackWithMin<E extends Comparable<E>> {

  /**
   * min栈中保存了数据栈每个元素入栈时对应的最小元素。
   */
  private Stack<E> minStack = new Stack<>();

  private Stack<E> dataStack = new Stack<>();

  public void push(E val) {
    dataStack.push(val);

    if (minStack.isEmpty() || minStack.peek().compareTo(val) > 0) {
      minStack.push(val);
    } else {
      minStack.push(minStack.peek());
    }
  }

  public E pop() {
    minStack.pop();
    return dataStack.pop();
  }

  public E min() {
    return minStack.peek();
  }

}
