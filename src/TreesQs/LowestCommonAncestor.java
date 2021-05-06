package TreesQs;

//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
//     this.data = data;
//     left=null;
//     right=null;
// }
//}

class LowestCommonAncestor {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		// Scanner sc = new Scanner(System.in);
		while (t > 0) {
			String s = br.readLine();
			Node root = buildTree(s);
			Tree g = new Tree();
			String X = br.readLine();
			String arr[] = X.split(" ");
			int x, y;
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			System.out.println(g.LowestCommonAncestor(root, x, y).data);
			t--;

		}
	}

}

//} Driver Code Ends
//User function Template for Java

/*
 * structure of Node is as follows: class Node{ int data; Node left; Node right;
 * Node(int data){ this.data = data; left=null; right=null; } }
 */
//
//class BST {
//	Node LCA(Node node, int n1, int n2) {
//		
//		Queue<Node>q1=new  LinkedList<Node>();
//		findandBuildQForNum(n1,node,q1);
//		
//		Queue<Node>q2=new  LinkedList<Node>();
//		findandBuildQForNum(n2,node,q2);
////		System.out.println(q1.toString());
////		System.out.println(q2.toString());
//		
//		int q1size=q1.size();
//		int q2size=q2.size();
//		int size=q1size>q2size?q2size:q1size;
//		Node finalNode=null;
//		while(size-->0 && q1.peek().data==q2.peek().data) {
//		finalNode=q1.poll();
//		q2.poll();
//		}
//		
//		return finalNode;
//		
////		return null;
//	}
//
//	private void findandBuildQForNum(int n1,Node root,Queue<Node>q) {
//		if(root==null)
//			return;
//		
//		if(root!=null && root.data==n1) {
//			q.add(root);
//			return ;
//		}
//		if(root!=null && n1>root.data) {
//			q.add(root);
//			findandBuildQForNum(n1,root.right,q);
//		}
//		if(root!=null && n1<root.data) {
//			q.add(root);
//			findandBuildQForNum(n1,root.left,q);
//		}
//			
//		
//	}
//
//	Node LCABetter(Node node, int n1, int n2) {
//	if(node.data>n1 && node.data>n2)
//	return LCABetter(node.left, n1, n2);
//	
//	if(node.data<n1 && node.data<n2)
//	return LCABetter(node.right, n1, n2);
//	
//	return node;
//	}
//	
//	
//}
