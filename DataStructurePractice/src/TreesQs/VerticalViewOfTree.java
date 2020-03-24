package TreesQs;

import java.io.*;
import java.util.*;

class Nodeiii {
	int data;
	Node left;
	Node right;

	Nodeiii(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class VerticalViewOfTree {

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
			BinaryTreeI obj = new BinaryTreeI();
			obj.verticalOrder(root);
			System.out.println();

		}
	}
}
//} Driver Code Ends
//User function Template for Java

/*
 * class Node { int data; Node left, right;
 * 
 * Node(int key) { data = key; left = right = null; } }
 */

class BinaryTreeI {
	static HashMap<Integer, List<Integer>> hm = new HashMap();
	static int minlevel=0;
	static int maxlevel=0;
	
	public static void verticalOrder(Node root) {
		// add your code here
		StringBuffer sb=new StringBuffer();
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(root.data);
		hm.put(0,al);
		verticalView(root, 0);
		for(int i=minlevel; i<=maxlevel; i++) {
			List<Integer> s=hm.get(i);
			Iterator itr=s.listIterator();
			while(itr.hasNext()) {
				int num=(Integer)itr.next();
				sb.append(num+" ");
			}
		}
		System.out.print(sb.toString());
	}

	private static void verticalView(Node root, int level) {
		if (root == null)
			return;
		else {
			if (root.left != null) {
				int newlevel =level-1;
				minlevel=newlevel<minlevel?newlevel:minlevel;
				if(hm.containsKey(newlevel))
				hm.get(newlevel).add(root.left.data);
				else {
					ArrayList<Integer> al=new ArrayList<> ();
					al.add(root.left.data);
					hm.put(newlevel,al);
				}
				verticalView(root.left, newlevel);
			}
			if (root.right != null) {
				int newlevel =level+1;
				maxlevel=newlevel>maxlevel?newlevel:maxlevel;
				if(hm.containsKey(newlevel))
				hm.get(newlevel).add(root.right.data);
				else {
					ArrayList<Integer> al=new ArrayList<>();
					al.add(root.right.data);
					hm.put(newlevel,al);
				}
				verticalView(root.right, newlevel);
			}
		}
	}

}