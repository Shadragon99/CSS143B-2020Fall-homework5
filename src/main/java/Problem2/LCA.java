package Problem2;

import Problem1.TreeNode;

import java.util.ArrayList;

// I recieved help from
// https://github.com/awangdev/LeetCode/blob/master/Java/Lowest%20Common%20Ancestor%20of%20a%20Binary%20Search%20Tree.java

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        if (root == null || p == null || q == null){
            return null;
        }
        ArrayList<TreeNode> a1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> a2 = new ArrayList<TreeNode>();

         binarySearch(root, p, a1);
         binarySearch(root, q, a2);

         TreeNode g = root;
         int length;
         if (a1.size() > a2.size()){
             length = a2.size();
         }else{
             length = a1.size();
         }
         for(int i = 0; i < length; i ++){
             if(a1.get(i).val == a2.get(i).val){
                 g = a1.get(i);
             } else {
                 return g;
             }
         }
        // hint: pay attention to the assumptions of this problem.
        return g;
    }

    private static void binarySearch(TreeNode<Integer> root, TreeNode<Integer> target, ArrayList<TreeNode> list) {

        TreeNode node = root;

        while( node != null){
            list.add(node);
            if(node.val == target.val){
                return;
            }else if((int) node.val < (int) target.val){
                node = node.right;
            } else{
                node = node.left;
            }
        }

    }
}
