package LinkListRelationQuestions;

import java.util.*;

public class isLinkListPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>mystack=new Stack<Integer>();
		
		Node a=null;
		Node head=null;
		int no=5;
		while(no-->0) {
			if(a==null) {
				a=new Node(no);
				head=a;
			}else {
				a.next=new Node(no);
				a=a.next;
			}
		}
		
		printList(head);
		Node curr=head;
		Node dptr=head;
		while(dptr!=null && dptr.next!=null && dptr.next.next!=null) {
		System.out.println(curr.data);
			mystack.push(curr.data);
			curr=curr.next;
			dptr=dptr.next.next;
		}
		while(curr.next!=null) {
			System.out.println("curr data="+curr.data);
			System.out.println("stack pop value"+mystack.pop());
		curr=curr.next;
		
		}
		
		
		
	}
	public static void printList(Node head){
		while(head!=null) {
			System.out.print("data= "+head.data);
			head=head.next;
			
		}
		System.out.println();
	}

}
