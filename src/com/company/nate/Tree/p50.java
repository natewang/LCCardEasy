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


import java.util.LinkedList;
import java.util.List;

public class p50 {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        //使用队列收集下层的节点，并打印当前节点
        List<List<Integer>> res = new LinkedList<>();

        if (root == null) {
            return res;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Integer size = queue.size();
            //获取下层
            LinkedList currentRes = new LinkedList();

            LinkedList<Integer> valRes = new LinkedList();


            while (size > 0) {

                TreeNode current = queue.poll();
                valRes.add(current.val);

                if (current.left != null) {
                    currentRes.add(current.left);
                }

                if (current.right != null) {
                    currentRes.add(current.right);
                }

                size--;
            }

            queue.addAll(currentRes);
            res.add(valRes);
        }

        return res;
    }


    public static void main(String[] args) {

        String str = "[3,9,20,null,null,15,7]";
        TreeNode root = BTreePrinter.stringToTreeNode(str);

        BTreePrinter.prettyPrintTree(root);

        System.out.println(levelOrder(root));

    }

}
