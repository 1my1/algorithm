/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * @author wh
 *
 */
public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		LinkNode l1 = new LinkNode(1);
		LinkNode l12 = new LinkNode(3);
		LinkNode l13 = new LinkNode(5);
		l1.next = l12;
		l12.next = l13;
		
		LinkNode l2 = new LinkNode(2);
		LinkNode l21 = new LinkNode(4);
		LinkNode l22 = new LinkNode(6);
		
		l2.next = l21;
		l21.next = l22;
		
		LinkNode l3 = mergeTwoSortedList(l1, l2);
		
		while(l3 != null){
			System.out.println(l3.val);
			l3 = l3.next;
		}
		

	}
	
	public static LinkNode mergeTwoSortedList(LinkNode l1,LinkNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoSortedList(l1.next, l2);
			return l1;
		}else{
			l2.next = mergeTwoSortedList(l2.next ,l1);
			return l2;
		}
	}
	
	static class LinkNode{
		Integer val;
		LinkNode next;
		public LinkNode(Integer val) {
			this.val = val;
		}
	}

}
