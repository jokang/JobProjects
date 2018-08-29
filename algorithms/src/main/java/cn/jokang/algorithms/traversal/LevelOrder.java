package cn.jokang.algorithms.traversal;

import cn.jokang.algorithms.datastructure.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

public class LevelOrder {

  private void travel(TreeNode root) {
    if (root == null) {
      return;
    }
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      System.out.print(node.val + ", ");
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }

  public static void main(String[] args) {
    TreeNode root = TreeUtils.build();
    LevelOrder levelOrder = new LevelOrder();
    levelOrder.travel(root);
  }

}
