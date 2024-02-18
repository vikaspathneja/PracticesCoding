package LinkListQs;

import java.util.LinkedList;

class LLNode {
	LLNode next;
	int data;

	public LLNode(int no) {
		this.data = no;
		next = null;// TODO Auto-generated constructor stub
	}
}

public class LinkListBasicExample {
	static int size;
	static int circularLLSize=0;

	public static void main(String[] args) {
		LLNode head = null;
		head = insertAtBegging(4, head);
		head = insertAtBegging(3, head);
		head = insertAtBegging(2, head);
		head = insertAtBegging(1, head);
//		head = insertAtLast(5, head);				
//		head = insertAtLast(6, head);
//		head = insertAtLast(7, head);
//		head = insertAtLast(8, head);
//		head = insertAtLast(9, head);
//		head = insertAtLast(10, head);
//		head = insertAtLast(11, head);
//		System.out.println("-----printll-----");
//		printLL(head);
//		System.out.println("---before circurlar---");
		
//		head=makeCircular(head);
		
//		head=insertAtLocation(5,5,head);
//		head=printLL(head);
//		System.out.println();
//		head=reverseLL(head);
//		System.out.println();
//		printLL(head);
//		System.out.println();
//		head=deleteFromBegging(head);
//		printLL(head);
//		head=deleteFromlast(head);
//		System.out.println();
//		int element=findMiddleElementOfBySize(head);
//		int element=findMiddleElement(head);
//		boolean iscircular=isLLCircular(head);
//		System.out.println("iscircular link list:"+iscircular);
//		System.out.println("circularLLSize="+circularLLSize);
		
//		head=exchangeFirstLastElement(head);
//		System.out.println("----after exchange element of circular link list only--");
//		printLL(head);
//		System.out.println(element);
		printLL(head);
		LLNode newhead= reverseList(head);
		printLL(newhead);
	}

	public static LLNode reverseList(LLNode temp) {
		LLNode head=temp;
		if(head==null || head.next==null){
			return head;
		}
		LLNode node=reverseList(head.next);
//		System.out.println("q val="+q.data);
		head.next.next=head;
		head.next=null;
		return node;
	}

	private static LLNode makeCircular(LLNode head) {
		LLNode curr=head;
		while(curr!=null && curr.next!=null) {
			curr=curr.next;
		}
		curr.next=head;
		return head;
	}

	private static boolean isLLCircular(LLNode head) {
		if(head==null)
			return false;
			circularLLSize++;
			LLNode node=head.next;
			while(node!=null && node!=head) {
				node=node.next;
				circularLLSize++;
			}
			return node!=null?true:false;
	}
	private static LLNode exchangeFirstLastElement(LLNode head) {
		if(head==null)
			return null;
			circularLLSize++;
			LLNode node=head.next;
			while(node!=null && node!=head) {
				if(node.next==head) {
					int lastnodedata=node.data;
					node.data=head.data;
					head.data=lastnodedata;
				}				
				node=node.next;
				circularLLSize++;
			}
			return  head;
	}

	private static int findMiddleElementOfBySize(LLNode head) {
		int counter=1;
		int length=0;
		if(head==null)
			return 0;
		else {
			while(counter<(size/2)+1) {
				head=head.next;
				counter++;
			}
			return head.data;
		}
			
	}
	private static int findMiddleElement(LLNode head) {
			if(head==null)
				return 0;
			LLNode simple=head;
			LLNode dbl=head;
			while(dbl!=null && dbl.next!=null) {
				dbl=dbl.next.next;
				simple=simple.next;
			}
			return simple.data;
			
	}
	
	
	private static LLNode deleteFromBegging(LLNode head) {
		if(head!=null && size>0) {
		head=head.next;
		size--;
		return head;
		}
		throw new RuntimeException("linklist is empty");
	}

	private static LLNode deleteFromlast(LLNode head) {
		if(head==null || size==0) {
			throw new RuntimeException("linklist is empty");
		}else if(size==1) {
			head=null;
			size--;
			return null;
		}
		else {
			LLNode curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
			size--;
			return head;
					
		}
	}

	private static LLNode reverseLL(LLNode head) {
		LLNode next=null;
		LLNode curr=head;
		LLNode prev=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;			
		}
		head=prev;
		return head;
	}

	private static LLNode printLL(LLNode head) {
		LLNode curr=head;
		while (curr!= null) {
			System.out.println(curr.data);
			if(curr.next==head)
				break;
			curr = curr.next;
		}
		return head;

	}

	private static LLNode insertAtBegging(int i, LLNode head) {
		if (head == null) {
			size++;
			return new LLNode(i);
		} else {
			LLNode node = new LLNode(i);
			node.next = head;
			head = node;
			size++;
		}
		return head;
	}

	private static LLNode insertAtLast(int i, LLNode head) {
		LLNode temphead = head;
		if (head == null) {
			size++;
			return new LLNode(i);
		} else {
			while (head.next != null) {
				head = head.next;
			}
			head.next = new LLNode(i);
			size++;
		}
		return temphead;
	}

	private static LLNode insertAtLocation(int i, int location, LLNode head) {
		LLNode temphead = head;
		int counter = 1;
		if (location>size)
			throw new RuntimeException("Location Not Present");
		else {
			if(location==0) {
				LLNode newhead=new LLNode(i);
				newhead.next=head;
				size++;
				return newhead;
			}
			while(counter<location-1) {
				head=head.next;
				counter++;
			}
			LLNode next=head.next;
			LLNode newnode=new LLNode(i);
			newnode.next=next;
			head.next=newnode;
			size++;
		}
		return temphead;
	}

}
