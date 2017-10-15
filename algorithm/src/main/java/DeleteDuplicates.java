/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * @author wh
 *
 */
public class DeleteDuplicates {
	
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(4);
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(deleteDuplicates(node));
	}
	
	public static ListNode deleteDuplicates(ListNode head){
		ListNode first = head;
		while(first.next != null){
			if(first.val == first.next.val){
				first.next = first.next.next;
			}else{
				first = first.next;
			}
		}
		return head;
	}

}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
}
