import java.util.Stack;

/**
 * 找出二叉树中的一条和等于sum
 * @author wh
 *
 */
public class PathSum {
	public static void main(String[] args) {
		
		TreeNode treeNode = new TreeNode(1);
		TreeNode treeNode1 = new TreeNode(2);
		treeNode.left = treeNode1;
		System.out.println(hasPathSum(treeNode, 1));
		
	}
	
	public static boolean hasPathSum(TreeNode root, int sum){
		if(root == null) return false;
		if(root.left == null && root.right == null && sum - root.val == 0) return true;
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}
	public static int maxDepth2(TreeNode root, int sum){
		if(root == null) return 0;
		int depthLeft = maxDepth2(root.left, sum) + root.val;
		int depthRight = maxDepth2(root.right, sum) + root.val;
		return sum == depthLeft ? depthLeft : depthRight;
	}
}
