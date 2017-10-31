/**
 * 根节点到叶子节点的最小长度
 * @author wh
 *
 */
public class MinimumDepth {
	public static void main(String[] args) {
		
	}
	
	
	public static int minDepth(TreeNode root){
		if(root == null) return 0;
		if(root.left == null) return minDepth(root.right) + 1;
		if(root.right == null) return minDepth(root.left) + 1;
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}
