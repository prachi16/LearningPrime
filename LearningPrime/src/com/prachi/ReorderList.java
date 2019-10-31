package com.prachi;

/*Given a singly linked list L: L0→L1→ ... →Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→...

For example, given {1,2,3,4}, reorder it to {1,4,2,3}. You must do this in-place without altering the nodes' values.
*/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReorderList {

	public  ListNode head;
	
	public static void main(String args[]) {
		 	
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(6);
		head.next.next.next.next.next.next=null;
		
		printList(head);
		
		reorderList(head);
		
		printList(head);
	}

	
	public static void reorderList(ListNode head) {
	        
		ListNode slow=head,fast=head;
	        
			while(fast!=null&&fast.next!=null&&fast.next.next!=null) {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        }
	        ListNode mid=slow;
	       
	       
	        System.out.println("mid is:"+mid.val);
	        
	       ListNode rhead=slow.next;
	       mid.next=null;
	       ListNode rc=reverseLinkedList(rhead);
		 
		  System.out.println("Reverse list:");
		  printList(rc);
		  System.out.println();
		  
		  ListNode lc=head,ln,rn;
		  
		  while(rc!=null) { ln=lc.next; rn=rc.next;
		  
		  lc.next=rc; rc.next=ln;
		  
		  lc=ln; rc=rn; }
		 
	}
	
	public static void printList(ListNode node) 
    { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
  
	
	public static ListNode reverseLinkedList(ListNode head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode prev=null,next=null,current=head;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}

}
