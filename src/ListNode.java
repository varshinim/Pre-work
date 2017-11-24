
public class ListNode {
	int val;
	ListNode next;
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	public String toString(){
		return this.val+"";
	}
	public ListNode subtract(ListNode A) {
        ListNode slowPtr = A;
		ListNode fastPtr = A.next;  
		  if(fastPtr == null ) {
		    return null;
		  }
		  while(fastPtr.next != null) {
		    slowPtr = slowPtr.next;
		    fastPtr = fastPtr.next;
		    if(fastPtr.next != null ) {
		      fastPtr = fastPtr.next;
		    }
		  }
		  slowPtr = reverse(slowPtr);
		  fastPtr = slowPtr;
		  
		  ListNode current = A;
		  while(fastPtr.next != null) {
		    current.val = fastPtr.val - current.val;
		    current = current.next;
		    fastPtr = fastPtr.next;
		  }
		  
		  reverse(slowPtr);
		  return A;
    }
    public ListNode reverse(ListNode node){
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
	}
	
	void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given a singly linked list, modify the value of first half nodes such that :
		// 1st node’s new value = the last node’s value - first node’s current value
		// 2nd node’s new value = the second last node’s value - 2nd node’s current value, and so on
		ListNode  modify = new ListNode(1,null);
		modify.next = new ListNode(2,null);
		modify.next.next = new ListNode(3,null);
		modify.next.next.next = new ListNode(4,null);
		modify.next.next.next.next = new ListNode(5,null);
		modify.next.next.next.next.next = new ListNode(6,null);
		modify.subtract(modify);
		modify.printList(modify);
	}
}
