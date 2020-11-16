package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        TreeNode<Integer> node = new TreeNode(valToInsert);

        TreeNode t = root;

        TreeNode n = null;

        while(t != null){
            n = t;
            if(valToInsert < (int) t.val){
                t = t.left;
            } else{
                t = t.right;
            }
        }

        if (n == null) {
            n = node;

        } else if(valToInsert < (int) n.val){
            n.left = node;

        } else{
            n.right = node;
        }
    }
}
