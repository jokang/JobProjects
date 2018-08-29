package cn.jokang.algorithms.traversal;

import cn.jokang.algorithms.datastructure.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

// https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
public class Inorder {

  private void recursive(TreeNode root) {
    if (null == root) {
      return;
    }
    recursive(root.left);
    System.out.print(root.val + ", ");
    recursive(root.right);
  }

  private void iterative(TreeNode root) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode processingNode = root;
    while (null != processingNode || !stack.isEmpty()) {
      while (null != processingNode) {
        stack.push(processingNode);
        processingNode = processingNode.left;
      }
      processingNode = stack.pop();
      System.out.print(processingNode.val + ", ");
      processingNode = processingNode.right;
    }
  }

  public static void main(String[] args) {
    TreeNode root = TreeUtils.build();
    Inorder inorder = new Inorder();
    inorder.recursive(root);
    System.out.println();
    inorder.iterative(root);
  }

}
