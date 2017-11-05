import java.util.Stack;


public class MaximumDepthBTree {
	
	public static void main(String[] args) {
		TreeNode1 node1 = new TreeNode1(1);
		TreeNode1 node2 = new TreeNode1(2);
		TreeNode1 node3 = new TreeNode1(3);
		TreeNode1 node4 = new TreeNode1(4);
		TreeNode1 node5 = new TreeNode1(4);
		TreeNode1 node6 = new TreeNode1(4);
		TreeNode1 node7 = new TreeNode1(4);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node2.left = node5;
		node5.left = node6;
		node6.left = node7;
		int flag = maxDepth2(node1);
		System.out.println(flag);
	}
	
	
	public static int maxDepth(TreeNode1 root){
		if(root == null) return 0;
		Stack<TreeNode1> nodeStack = new Stack<TreeNode1>();
		Stack<Integer> depStack = new Stack<Integer>();
		nodeStack.push(root);
		depStack.push(1);
		Integer depth = 0;
		while(!nodeStack.empty()){
			TreeNode1 node = nodeStack.pop();
			int tmp = depStack.pop();
			depth = Math.max(depth, tmp);
			if(node.left != null){
				nodeStack.push(node.left);
				depStack.push(tmp+1);
			}
			if(node.right != null){
				nodeStack.push(node.right);
				depStack.push(tmp+1);
			}
		}
		return depth;
	}
	public static int maxDepth2(TreeNode1 root){
		if(root == null) return 0;
		int depthLeft = maxDepth2(root.left) + root.val;
		int depthRight = maxDepth2(root.right) + root.val;
		return depthLeft > depthRight ? depthLeft : depthRight;
	}
	
	public static int maxDepth3(TreeNode1 root){
		if(root == null) return 0;
		Stack<TreeNode1> nodeStack = new Stack<TreeNode1>();
		nodeStack.push(root);
		int depth = 0;
		while(!nodeStack.isEmpty()){
			int size = nodeStack.size();
			while(size-- > 0){
				TreeNode1 node = nodeStack.pop();
				if(node.left != null){
					nodeStack.push(node.left);
				}
				if(node.right != null){
					nodeStack.push(node.right);
				}
			}
			depth++;
		}
		return depth;
	}

}
