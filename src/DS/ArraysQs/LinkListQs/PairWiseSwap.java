package DS.ArraysQs.LinkListQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairWiseSwap {
	static Node node;
	static Node tail;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int testCases=Integer.parseInt(br.readLine());
		 while(testCases-->0){
		     int noOfInputs=Integer.parseInt(br.readLine());
		     String [] inputArr=br.readLine().split(" ");
		     for(int i = 0; i < inputArr.length; i++) {
				int no= Integer.parseInt(inputArr[i]);
				if(i==0) {
					node=new Node(no);
					tail=node;
				}else {
					Node dummy=new Node(no);
					tail.next=dummy;
					tail=tail.next;
				}
					
				
			}
		 }
		 printLinkList(node);
		 Node latesthead=reverseSubList(node);
		 printLinkList(latesthead);
	}
	

	
	private static Node reverseSubList(Node head) {
		Node c=head;
		Node n=null;
		Node p=null;
		int k=2;
		while(k-->0) {
			 	
				if(c.next!=null)
				n=c.next;
				else {
					return c;
				}
		       c.next=p;
		       p=c;
		       c=n;
		}
		System.out.println("c data="+c.data);
		System.out.println("head data="+head.data);
		if(c!=head)
			head.next=reverseSubList(c);
		
		return p;
	}

	public static void printLinkList(Node head){
		Node dummy=head;
		while(dummy!=null) {
			System.out.print(""+dummy.data+"->");
			dummy=dummy.next;
		}
		System.out.println();
	}
	

}
