/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * @author wh
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class BTreeSerialize {
    StringBuffer sb = new StringBuffer();
    int index = -1;
    String Serialize(TreeNode root) {
        if(root == null) sb.append("#,");
        else{
            sb.append(root.val+",");
            Serialize(root.left);
            Serialize(root.right);
        }
        return sb.toString();
  	}
    TreeNode Deserialize(String str) {
       index++;
       String[] strs = str.split(",");
       if("#".equals(strs[index])) return null;
       TreeNode node = new TreeNode(Integer.valueOf(strs[index]));
       node.left = Deserialize(str);
       node.right = Deserialize(str);
       return node;
  	}
}