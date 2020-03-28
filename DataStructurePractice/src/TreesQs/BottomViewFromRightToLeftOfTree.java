package TreesQs;

import java.io.*;
import java.util.*;

//class Node {
//	int data;
//	Node left;
//	Node right;
//
//	Node(int data) {
//		this.data = data;
//		left = null;
//		right = null;
//	}
//}

public class BottomViewFromRightToLeftOfTree {

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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			Node root = buildTree(s);
			BinaryTreeBottom obj = new BinaryTreeBottom();
			obj.verticalOrder(root);
			System.out.println();

		}
	}
}
//} Driver Code Ends
//User function Template for Java


class NodeBottom{
	Node node;
	int distance;
	public NodeBottom(Node node,int distance) {
		this.node=node;
		this.distance=distance;
	}
}

class BinaryTreeBottom {
	static int mindistance = 0;
	static int maxdistance = 0;
	static HashMap<Integer, ArrayList<Integer>> hm ;

	public static void verticalOrder(Node root) {
		mindistance = 0;
		maxdistance = 0;
		hm=new HashMap<>();
		Queue<NodeBottom> q = new LinkedList<NodeBottom>();
		NodeBottom node=new NodeBottom(root,0);
		q.add(node);
		q.add(null);
		verticalView(q);
//		System.out.println(mindistance);
//		System.out.println(maxdistance);
		
		for (int i = mindistance; i <= maxdistance; i++) {
			ArrayList<Integer> s = hm.get(i);
			if(s.size()>0)
			System.out.print(s.get(s.size()-1)+" ");
//			System.out.println("list size=="+s.size());
//			Iterator<Integer> itr = s.iterator();
//			StringBuffer sb = new StringBuffer();
//			while (itr.hasNext()) {
//				int num = (Integer) itr.next();
//				sb.append(num + " ");
//			}
//			System.out.print(sb);
//			
			
		}
		
		
	q=null;
	
	}

	private static void verticalView(Queue<NodeBottom> q) {
		
		if (!q.isEmpty() && q.size() > 1) {
			NodeBottom nodem = q.poll();
		
			if (nodem == null && q.size() > 0) {
				q.add(null);
			} else {
				int distance=nodem.distance;
				Node node=nodem.node;
				
//				int distance = node.distance;
				mindistance = distance < mindistance ? distance : mindistance;
				maxdistance = distance > maxdistance ? distance : maxdistance;

				ArrayList<Integer> al = null;
				if (hm.containsKey(distance))
					al = hm.get(distance);
				else
				al = new ArrayList<Integer>();
				al.add(node.data);
				hm.put(distance, al);

				if (node.left != null) {
					NodeBottom newnode=new NodeBottom(node.left,distance-1);
					q.add(newnode);
				}

				if (node.right != null) {
					NodeBottom newnode=new NodeBottom(node.right,distance+1);
					q.add(newnode);
				}

			}
			verticalView(q);
		} else {
			q.poll();
		}
	}

}