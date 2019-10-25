package com.company.nate.Tree;
import java.util.ArrayList;
import java.util.Stack;

public class BTreePrinter {

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> resArr = new ArrayList();
        //直接借助java体系的stack类
        Stack<TreeNode> s1 = new Stack();
        Stack<TreeNode> s2 = new Stack();
        if(pRoot==null){
            return resArr;
        }
        s1.push(pRoot);

        //终止的条件是两个栈全为空，说明全部处理完成
        while (s1.size() != 0 || s2.size() != 0) {
            //s1每个出栈元素,先压左节点到B,再压右节点到B,具体看题目要求
            ArrayList<Integer> tmpA = new ArrayList<>();

            while (s1.size() != 0) {
                TreeNode top = s1.pop();
                tmpA.add(top.val);

                //左右子节点入B栈
                if (top.left != null) {
                    s2.push(top.left);
                }
                if (top.right != null) {
                    s2.push(top.right);
                }
            }
            //加入到resArr之前一定要判断是否为空
            if(tmpA.size()>0){
                resArr.add(tmpA);
            }

            //压入顺序与A相反
            ArrayList<Integer> tmpB = new ArrayList<>();
            while (s2.size() != 0) {
                TreeNode top = s2.pop();
                tmpB.add(top.val);

                if (top.right != null) {
                    s1.push(top.right);
                }
                if (top.left != null) {
                    s1.push(top.left);
                }
            }
            //加入到resArr之前一定要判断是否为空
            if(tmpB.size()>0){
                resArr.add(tmpB);
            }
        }
        return resArr;
    }


}
