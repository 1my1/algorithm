/**
 * BTree is balanced?
 * @author wh
 *
 */
public class BalancedBTree {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(4);
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		node1.right = node5;
		node5.right = node6;
		node6.right = node7;
//		node1.right = node3;
//		node2.left = node4;
		System.out.println(isBalanced(node1));
	}
	public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public static int depth(TreeNode root){
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
