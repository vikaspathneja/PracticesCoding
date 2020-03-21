package TreesQs;

public class BinaryTree {
	static Node root;

	public static void main(String[] args) {
		int[] inputArr = { 6, 3, 2, 5, 8, 7, 9 };
		createBinaryTree(inputArr);
		System.out.print("inOrderTraversal= ");
		inOrderTraversal(root);
		System.out.println();
		System.out.print("preOrderTraversal= ");
		preOrderTraversal(root);
		System.out.println();
		System.out.print("postOrderTraversal= ");
		postOrderTraversal(root);
		
	}

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
			System.out.print(node.data+" ");
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
			System.out.print(node.data+" ");
		}
		
	}

	private static void inOrder(Node node) {
		if (node == null)
			return;
		else {
			inOrder(node.left);
			System.out.print(node.data+" ");
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
				str=root;
			} else {
				str=root;
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
}
