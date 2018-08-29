package cn.jokang.algorithms.traversal;

import cn.jokang.algorithms.datastructure.TreeNode;

// https://www.geeksforgeeks.org/iterative-postorder-traversal/
public class Postorder {

  private void recursive(TreeNode root) {
    if (null == root) {
      return;
    }

    recursive(root.left);
    recursive(root.right);
    System.out.println(root.val);
  }

  private void iterative(TreeNode root) {

  }

  public static void main(String[] args) {
    TreeNode root = TreeUtils.build();
    Postorder postorder = new Postorder();
    postorder.recursive(root);
    System.out.println();
    postorder.iterative(root);
  }
}
