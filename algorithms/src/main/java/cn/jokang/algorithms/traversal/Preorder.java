package cn.jokang.algorithms.traversal;

import cn.jokang.algorithms.datastructure.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

// https://www.geeksforgeeks.org/iterative-preorder-traversal/
public class Preorder {

  private void recursive(TreeNode root) {
    if (root == null) {
      return;
    }

    System.out.print(root.val + ", ");
    recursive(root.left);
    recursive(root.right);

  }

  private void iterative(TreeNode root) {
    if (null == root) {
      return;
    }

    Deque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode processingNode = stack.pop();
      System.out.print(processingNode.val + ", ");
      if (null != processingNode.right) {
        stack.push(processingNode.right);
      }
      if (null != processingNode.left) {
        stack.push(processingNode.left);
      }
    }
  }

  public static void main(String[] args) {
    TreeNode root = TreeUtils.build();
    Preorder preorder = new Preorder();
    preorder.recursive(root);
    System.out.println();
    preorder.iterative(root);
  }
}
