package com.company.nate.Tree;


/*给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：

[
  [3],
  [9,20],
  [15,7]
]*/


import java.util.List;

public class p50 {

    public static List<List<Integer>> levelOrder(TreeNode root) {


        return null;
    }


    public static void main(String[] args) {

        String str = "[3,9,20,null,null,15,7]";
        TreeNode root = BTreePrinter.stringToTreeNode(str);

        BTreePrinter.prettyPrintTree(root);

        System.out.println(levelOrder(root));

    }

}
