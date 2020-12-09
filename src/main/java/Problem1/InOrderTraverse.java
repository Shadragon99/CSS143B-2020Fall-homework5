package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        TreeNode<Integer> mid = root;

        while(mid != null) {
            stack.push(mid);
            mid = mid.left;
        }

        while(!stack.isEmpty()){

            TreeNode node = stack.pop();
            result.add((Integer) node.val);

            node = node.right;
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            /*
            //left
            if(node.left != null){
                result.add(node.left);
            }
            //middle
            System.out.println(node.val);

            //right
            if(node.right != null){
                result.add(node.right);
            }
            */

        }
        return result;  // place holder
    }
}
