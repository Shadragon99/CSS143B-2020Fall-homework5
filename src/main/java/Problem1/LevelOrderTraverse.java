package Problem1;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nodeVal = new ArrayList<Integer>();

        if(root == null){
            return result;
        }
        LinkedList<TreeNode> c = new LinkedList<TreeNode>();
        LinkedList<TreeNode> n = new LinkedList<TreeNode>();
        c.add(root);

        while(!c.isEmpty()){
            TreeNode node = c.remove();

            if(node.left != null){
                n.add(node.left);
            }
            if(node.right != null){
                n.add(node.right);
            }

            nodeVal.add((Integer) node.val);
            if(c.isEmpty()){
                c = n;
                n = new LinkedList<TreeNode>();
                result.add(nodeVal);
                nodeVal = new ArrayList();
            }
        }
        return result;  // place holder
    }
}
