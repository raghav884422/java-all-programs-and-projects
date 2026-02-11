package OtherCollectionProblem;

import java.util.*;
public class LevelOrderTraversalOfBinaryTree {

	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int val) {
	        this.val = val;
	        left =right=null;
	    }
	}

	class Main {
	    public static Queue<TreeNode> levelOrder(TreeNode root) {
	        //Write your code here
	        Queue<TreeNode> q = new PriorityQueue();
	        q.add(root);
	        while(!q.isEmpty()) {
	        	
	        
	        if(root.left!=null) {
	        	q.add(root);
	        }
	        else if(root.right!=null) {
	        	q.add(root);
	        }

	        }
	        return q;
	    }

	    public static void main(String[] args) {
	        // Building the binary tree structure
	        TreeNode root = new TreeNode(3);
	        root.left = new TreeNode(9);
	        root.right = new TreeNode(20);
	        root.right.left = new TreeNode(15);
	        root.right.right = new TreeNode(7);

	        // Calling the static method directly
	        Queue<TreeNode> result = levelOrder(root);

	        // Printing the result
	        System.out.println("Level Order Traversal: " + result);
	    }
	}


}
