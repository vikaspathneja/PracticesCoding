package TreesQs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class summ {
	int sumSoFar;
}

class Res {
	public int val;
}

public class Tree {

	private static Node root;
	private int maxlevel = 1;
	private static int mindistance = 0;
	private static int maxdistance = 0;
	private static HashMap<Integer, ArrayList<Integer>> hm;

	private static int count;

	private Node head;
	private static Node prev;

	private static int deserlizeIndex = 0;

	private static int maxHeight;

	/**
	 * @see to find the max sum of path in tree
	 * @param root node of tree
	 * @return maximum Sum of path
	 */
	int maxPathSum(Node node) {

		// Initialize result
		// int res2 = Integer.MIN_VALUE;
		Res res = new Res();
		res.val = Integer.MIN_VALUE;

		// Compute and return result
		maxPathSumUtil(node, res);
		return res.val;
	}

	// This function returns overall maximum path sum in 'res'
	// And returns max path sum going through root.
	int maxPathSumUtil(Node node, Res res) {

		// Base cases
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return node.data;

		// Find maximum sum in left and right subtree. Also
		// find maximum root to leaf sums in left and right
		// subtrees and store them in ls and rs
		int ls = maxPathSumUtil(node.left, res);
		int rs = maxPathSumUtil(node.right, res);

		// If both left and right children exist
		if (node.left != null && node.right != null) {

			// Update result if needed
			res.val = Math.max(res.val, ls + rs + node.data);

			// Return maxium possible value for root being
			// on one side
			int val = Math.max(ls, rs) + node.data;
			return val;
		}

		// If any of the two children is empty, return
		// root sum for root being on one side
		int mainmax=(node.left == null) ? rs + node.data : ls + node.data;
	return mainmax;
	}

	int MaxSumUtil(Node root, Res res) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return root.data;

		int left = MaxSumUtil(root.left, res);
		int right = MaxSumUtil(root.right, res);

		if (root.left != null && root.right != null) {
			res.val = Math.max(res.val, left + right + root.data);
			return Math.max(left, right) + root.data;
		}

		return root.left != null ? left + root.data : right + root.data;
	}

	/**
	 * 
	 * @param root
	 * @return max distance of Tree any node to any node
	 */
	public static int diameterofTree(Node root) {
//		 return Math.max(maxheight(root.left)+maxheight(root.right),Math.max(diameterofTree(root.left),diameterofTree(root.right)));
		if (root == null)
			return 0;

		return Math.max((1 + height(root.left) + height(root.right)),
				Math.max(diameterofTree(root.left), diameterofTree(root.right)));

	}

	public void leftView(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			leftViewOfTree(root, 1);
		}
	}

	private void leftViewOfTree(Node node, int level) {

		if (node == null)
			return;
		else {
			if (level > maxlevel) {
				System.out.print(node.data + " ");
				maxlevel = level;
			}
			leftViewOfTree(node.left, level + 1);
			leftViewOfTree(node.right, level + 1);
		}
	}

	/**
	 * 
	 * @param node
	 * @param n1
	 * @param n2
	 * @return {@link Node} root node of tree
	 * @see function for finding Lowest Common Ancestor of two nodes and this is
	 *      better version
	 */
	public Node LowestCommonAncestor(Node node, int n1, int n2) {
		if (node.data > n1 && node.data > n2)
			return LowestCommonAncestor(node.left, n1, n2);

		if (node.data < n1 && node.data < n2)
			return LowestCommonAncestor(node.right, n1, n2);

		return node;
	}

	/**
	 * 
	 * @param node
	 * @param n1
	 * @param n2
	 * @return
	 * @see function for finding Lowest Common Ancestor of two node
	 * 
	 */
	private Node LCAOld(Node node, int n1, int n2) {

		Queue<Node> q1 = new LinkedList<Node>();
		findandBuildQForNum(n1, node, q1);

		Queue<Node> q2 = new LinkedList<Node>();
		findandBuildQForNum(n2, node, q2);
//		System.out.println(q1.toString());
//		System.out.println(q2.toString());

		int q1size = q1.size();
		int q2size = q2.size();
		int size = q1size > q2size ? q2size : q1size;
		Node finalNode = null;
		while (size-- > 0 && q1.peek().data == q2.peek().data) {
			finalNode = q1.poll();
			q2.poll();
		}

		return finalNode;

//		return null;
	}

	public void printSpiral(Node node) {
		Deque<Node> dq = new LinkedList<Node>();
//		HashMap<Integer,Node>hm=new HashMap<Integer, Node>();
		dq.add(node);
//		hm.put(node.data, node);
		dq.add(null);
		spiralView(node, 0, dq);
	}

	private void spiralView(Node root, int level, Deque<Node> dq) {
		StringBuffer sb = new StringBuffer();

		if (root == null)
			return;

		while (!dq.isEmpty()) {
			Node num = dq.poll();
			if (num == null && dq.size() > 0) {
				dq.add(null);
				if (level % 2 == 0) {
					String[] inputArr = sb.toString().split(" ");
					for (int i = inputArr.length - 1; i >= 0; i--) {
						System.out.print(inputArr[i] + " ");
					}
					sb = new StringBuffer();
				} else {
					System.out.print(sb);
					sb = new StringBuffer();
				}
				level++;
			} else if (num == null && dq.size() == 0) {
				if (level % 2 == 0) {
					String[] inputArr = sb.toString().split(" ");
					for (int i = inputArr.length - 1; i >= 0; i--) {
						System.out.print(inputArr[i] + " ");
					}
					sb = new StringBuffer();
				} else {
					System.out.print(sb);
					sb = new StringBuffer();
				}

				System.out.print(sb.toString());
			} else {
				sb.append(num.data + " ");
				Node node = num;
				if (node.left != null) {
					dq.add(node.left);
				}
				if (node.right != null) {
					dq.add(node.right);
				}
//				dq.add(null);
			}
		}
	}

	public static boolean isTwoTreeIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 != null && root2 != null)
			return (root1.data == root2.data) && isTwoTreeIdentical(root1.left, root2.left)
					&& isTwoTreeIdentical(root1.right, root2.right);

		return false;
	}

	private boolean isIdenticalOld(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 != null && root2 == null)
			return false;

		if (root2 != null && root1 == null)
			return false;

		if (root1.data != root2.data)
			return false;

		if (root1.left != null || root2.left != null)
			return isIdenticalOld(root1.left, root2.left);

		if (root1.right != null || root2.right != null)
			return isIdenticalOld(root1.right, root2.right);

		return true;
	}

	public static boolean isSymmetric(Node root) {
		if (root == null)
			return true;

		if (root.left == null || root.right == null)
			return false;

		return isTwoTreeIdentical(root.left, root.right);
	}
//
//	static boolean isIdentical(Node root1, Node root2) {
//		if (root1 == null && root2 == null)
//			return true;
//
//		if (root1 != null && root2 != null)
//			return (root1.data == root2.data) && isIdentical(root1.left, root2.right)
//					&& isIdentical(root1.right, root2.left);
//
//		return false;
//	}

//	static int mindistance = 0;
//	static int maxdistance = 0;
//	static HashMap<Integer, ArrayList<Integer>> hm ;

	public static void verticalOrderFromLefttoRightWithOrderTraversal(Node root) {
		mindistance = 0;
		maxdistance = 0;
		hm = new HashMap<>();
		Queue<NodeM> q = new LinkedList<NodeM>();
		NodeM node = new NodeM(root, 0);
		q.add(node);
		q.add(null);
		verticalViewFromLefttoRightWithOrderTraversal(q);
//		System.out.println(mindistance);
//		System.out.println(maxdistance);

		for (int i = mindistance; i <= maxdistance; i++) {
			ArrayList<Integer> s = hm.get(i);
//			System.out.println("list size=="+s.size());
			Iterator<Integer> itr = s.iterator();
			StringBuffer sb = new StringBuffer();
			while (itr.hasNext()) {
				int num = (Integer) itr.next();
				sb.append(num + " ");
			}
			System.out.print(sb);

		}

		q = null;

	}

	private static void verticalViewFromLefttoRightWithOrderTraversal(Queue<NodeM> q) {

		if (!q.isEmpty() && q.size() > 1) {
			NodeM nodem = q.poll();

			if (nodem == null && q.size() > 0) {
				q.add(null);
			} else {
				int distance = nodem.distance;
				Node node = nodem.node;

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
					NodeM newnode = new NodeM(node.left, distance - 1);
					q.add(newnode);
				}

				if (node.right != null) {
					NodeM newnode = new NodeM(node.right, distance + 1);
					q.add(newnode);
				}

			}
			verticalViewFromLefttoRightWithOrderTraversal(q);
		} else {
			q.poll();
		}
	}

	private void findandBuildQForNum(int n1, Node root, Queue<Node> q) {
		if (root == null)
			return;

		if (root != null && root.data == n1) {
			q.add(root);
			return;
		}
		if (root != null && n1 > root.data) {
			q.add(root);
			findandBuildQForNum(n1, root.right, q);
		}
		if (root != null && n1 < root.data) {
			q.add(root);
			findandBuildQForNum(n1, root.left, q);
		}

	}

	public static void verticalOrder(Node root) {
		mindistance = 0;
		maxdistance = 0;
		hm = new HashMap<>();
		Queue<NodeBottom> q = new LinkedList<NodeBottom>();
		NodeBottom node = new NodeBottom(root, 0);
		q.add(node);
		q.add(null);
		verticalView(q);
//		System.out.println(mindistance);
//		System.out.println(maxdistance);

		for (int i = mindistance; i <= maxdistance; i++) {
			ArrayList<Integer> s = hm.get(i);
			if (s.size() > 0)
				System.out.print(s.get(s.size() - 1) + " ");
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

		q = null;

	}

	public boolean isBST(Node root) {
//		return isTreeBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		return isTreeBSTBetter(root, null, null);
	}

	private boolean isTreeBST(Node root, int min, int max) {
		if (root == null)
			return true;
		if (root.data < min || root.data > max)
			return false;

		return isTreeBST(root.left, min, root.data - 1) && isTreeBST(root.right, root.data + 1, max);
	}

	private boolean isTreeBSTBetter(Node root, Node left, Node right) {
		if (root == null)
			return true;

		if (left != null && root.data < left.data)
			return false;

		if (right != null && root.data > right.data)
			return false;

		return isTreeBSTBetter(root.left, left, root) && isTreeBSTBetter(root.right, root, right);
	}

	public static void connectNodesatSameLvl(Node p) {
		Deque<Node> dq = new LinkedList<Node>();
		ArrayList<Node> al = new ArrayList<Node>();
		dq.add(p);
		dq.add(null);
		connectNodesAtSameLevel(p, 0, dq, al);
	}

	/**
	 * 
	 * @param root  pass root Node to connect all nodes at a same level
	 * @param level pass level for recursively travelling in a tree
	 * @param dq    double ended queue to traverse
	 * @param al    arraylist to track elements of a same level
	 * @see this method is to connect all nodes of a same level with the help of
	 *      nextRight Property of Node Class to next node in same level
	 * @author vikas
	 */
	private static void connectNodesAtSameLevel(Node root, int level, Deque<Node> dq, ArrayList<Node> al) {
//		StringBuffer sb = new StringBuffer();

		if (root == null)
			return;

		while (!dq.isEmpty()) {
			Node num = dq.poll();
			if (num == null && dq.size() > 0) {
				dq.add(null);
				// System.out.print(sb);
				al.clear();
				// sb = new StringBuffer();
				level++;
			} else if (num == null && dq.size() == 0) {
				// System.out.print(sb);
				// sb = new StringBuffer();
				al.clear();

			} else {
				// sb.append(num.data + " ");
				if (al.size() >= 1)
					al.get(al.size() - 1).nextRight = num;
				al.add(num);
				Node node = num;
				if (node.left != null) {
					dq.add(node.left);
				}
				if (node.right != null) {
					dq.add(node.right);
				}
			}
		}
	}

//	Node head;
//	static Node prev;

	public Node binaryTreeToDoubleLinkedList(Node root) {
		prev = null;
		binaryToDll(root);
		return head;
	}

	private void binaryToDll(Node root) {
		if (root == null)
			return;

		binaryToDll(root.left);
//	System.out.println(root.data);
		if (prev == null) {
			head = root;
		} else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;

		binaryToDll(root.right);

	}

//	static int count;

	public static int countLeaves(Node node) {
		Leavescount(node);
		return count / 2;
	}

	private static void Leavescount(Node node) {
		if (node == null) {
			count++;
			return;
		}
		Leavescount(node.left);
		Leavescount(node.right);

	}

	public boolean isBalanced(Node root) {
		if (root == null)
			return true;

		int lth = height(root.left);
		int rth = height(root.right);

		return (Math.abs(lth - rth) <= 1) && isBalanced(root.left) && isBalanced(root.right);

	}

	public static int height(Node root) {
		if (root == null)
			return 0;

		return 1 + Math.max(height(root.left), height(root.right));
	}

//	static int maxHeight;

	public static int maxheight(Node root) {
		maxHeight = 0;
		return maxheight(root, maxHeight);
	}

	private static int maxheight(Node node, int height) {
		if (node == null)
			return height;

		int mleft = maxheight(node.left, height + 1);
		int mright = maxheight(node.right, height + 1);
		int maxh = mleft > mright ? mleft : mright;
		return maxh;
	}

	private static void verticalView(Queue<NodeBottom> q) {

		if (!q.isEmpty() && q.size() > 1) {
			NodeBottom nodem = q.poll();

			if (nodem == null && q.size() > 0) {
				q.add(null);
			} else {
				int distance = nodem.distance;
				Node node = nodem.node;

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
					NodeBottom newnode = new NodeBottom(node.left, distance - 1);
					q.add(newnode);
				}

				if (node.right != null) {
					NodeBottom newnode = new NodeBottom(node.right, distance + 1);
					q.add(newnode);
				}

			}
			verticalView(q);
		} else {
			q.poll();
		}
	}

//	public static void main(String[] args) {
//		int[] inputArr = { 6, 3, 2, 5, 8, 7, 9 };
//		createBinaryTree(inputArr);
//		System.out.print("inOrderTraversal= ");
//		inOrderTraversal(root);
//		System.out.println();
//		System.out.print("preOrderTraversal= ");
//		preOrderTraversal(root);
//		System.out.println();
//		System.out.print("postOrderTraversal= ");
//		postOrderTraversal(root);
//		
//	}

	public static void inOrderTraversal(Node root) {
		inOrder(root);
	}

	public static void preOrderTraversal(Node root) {
		preOrder(root);
	}

	public static void postOrderTraversal(Node root) {
		postOrder(root);
	}

	private static void preOrder(Node node) {
		if (node == null)
			return;
		else {
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}

	}

	private static void postOrder(Node node) {
		if (node == null)
			return;
		else {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}

	}

	private static void inOrder(Node node) {
		if (node == null)
			return;
		else {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}

	public static Node createBinaryTree(int[] inputArr) {
		Node str = null;
		boolean flag = true;
		for (int i = 0; i < inputArr.length; i++) {
			int num = inputArr[i];
			flag = true;
			if (root == null) {
				root = new Node(num);
				str = root;
			} else {
				str = root;
				while (flag) {
					if (num < str.data && str.left != null)
						str = str.left;
					else if (num > str.data && str.right != null)
						str = str.right;
					else {
						if (str.left == null && num < str.data) {
							str.left = new Node(num);
							flag = false;
//						break;
						}
						if (str.right == null && num > str.data)
							str.right = new Node(num);
						flag = false;
//						break;
					}
				}
			}
		}
		return root;
	}

//	static int deserlizeIndex = 0;

	public void serialize(Node root, ArrayList<Integer> A) {
		deserlizeIndex = 0;
		if (root == null) {
			A.add(-1);
			return;
		}
		A.add(root.data);
		serialize(root.left, A);
		serialize(root.right, A);

	}

	public Node deSerialize(ArrayList<Integer> A) {
		Node node = null;
		int num = A.get(deserlizeIndex);
		if (num != -1)
			node = new Node(num);
		if (deserlizeIndex < A.size() && num != -1) {
			deserlizeIndex++;
			node.left = deSerialize(A);
			node.right = deSerialize(A);
			return node;
		}
		deserlizeIndex++;
		return node;

	}
}
