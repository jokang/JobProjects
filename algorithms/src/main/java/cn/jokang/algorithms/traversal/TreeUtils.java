package cn.jokang.algorithms.traversal;

import cn.jokang.algorithms.datastructure.TreeNode;

public class TreeUtils {

  public static TreeNode build() {
    TreeNode n1 = new TreeNode(4);
    TreeNode n2 = new TreeNode(5);
    TreeNode n3 = new TreeNode(2);
    n3.left = n1;
    n3.right = n2;
    TreeNode n4 = new TreeNode(3);
    TreeNode n5 = new TreeNode(1);
    n5.left = n3;
    n5.right = n4;
    return n5;
  }

}
