import java.util.Stack;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * @author wh
 *
 */
public class SymmetricTree {
	
	public static void main(String[] args) {
		TreeNode1 node1 = new TreeNode1(1);
		TreeNode1 node2 = new TreeNode1(2);
		TreeNode1 node3 = new TreeNode1(2);
		node1.left = node2;
		node1.right = node3;
		
		TreeNode1 node4 = new TreeNode1(4);
		
		boolean flag = isSymmetricTree(node1);
		System.out.println(flag);
	}
	
	public static boolean isSymmetricTree(TreeNode1 node){
		
		if(node == null) return true;
		TreeNode1 left = node.left;
		TreeNode1 right = node.right;
		return isSameTree(left,right);
		
	}

	private static boolean isSameTree(TreeNode1 left, TreeNode1 right) {
		if(left == null || right == null) return left == right;
		if(left.val == right.val){
			return isSameTree(left.left, right.right) && isSameTree(left.right, right.left);
		}
		return false;
	}
	//non-recursive
	public static boolean isSymmetricTree2(TreeNode1 root){
		if(root == null) return true;
		Stack<TreeNode1> stack = new Stack<>();
		TreeNode1 left,right;
		if(root.left != null){
			if(root.right == null) return false;
			stack.push(root.left);
			stack.push(root.right);
		}else if(root.right != null){
			return false;
		}
		while(!stack.isEmpty()){
			if(stack.size()%2 != 0) return false;
			left = stack.pop();
			right = stack.pop();
			if(left.val != right.val) return false;
			if(left.left!=null){
	            if(right.right==null)   return false;
	            stack.push(left.left);
	            stack.push(right.right);
	        }
	        else if(right.right!=null){
	            return false;
	        }
	            
	        if(left.right!=null){
	            if(right.left==null)   return false;
	            stack.push(left.right);
	            stack.push(right.left);
	        }
	        else if(right.left!=null){
	            return false;
	        }
		}
		return true;
	}

}
