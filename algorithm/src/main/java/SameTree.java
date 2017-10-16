/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * @author wh
 *
 */
public class SameTree {
	
	public static void main(String[] args) {
		TreeNode1 node1 = new TreeNode1(1);
		TreeNode1 node2 = new TreeNode1(2);
		TreeNode1 node3 = new TreeNode1(3);
		node1.left = node2;
		node1.right = node3;
		
		TreeNode1 node4 = new TreeNode1(4);
		
		boolean flag = sameTree(node1,node1);
		System.out.println(flag);
	}
	
	public static boolean sameTree(TreeNode1 p,TreeNode1 q){
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		if(p.val == q.val)
			return sameTree(p.left,q.left) && sameTree(p.right,q.right);
		return false;
	}

}
class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1(int x) { val = x; }
}