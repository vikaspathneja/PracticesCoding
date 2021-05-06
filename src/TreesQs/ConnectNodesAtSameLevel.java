package TreesQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class ConnectNodesAtSameLevel {
 
 static Node buildTree(String str){
     
     if(str.length()==0 || str.charAt(0)=='N'){
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
     while(queue.size()>0 && i < ip.length) {
         
         // Get and remove the front of the queue
         Node currNode = queue.peek();
         queue.remove();
             
         // Get the current node's value from the string
         String currVal = ip[i];
             
         // If the left child is not null
         if(!currVal.equals("N")) {
                 
             // Create the left child for the current node
             currNode.left = new Node(Integer.parseInt(currVal));
             // Push it to the queue
             queue.add(currNode.left);
         }
             
         // For the right child
         i++;
         if(i >= ip.length)
             break;
             
         currVal = ip[i];
             
         // If the right child is not null
         if(!currVal.equals("N")) {
                 
             // Create the right child for the current node
             currNode.right = new Node(Integer.parseInt(currVal));
                 
             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }
     
     return root;
 }
 public static void printInorder(Node root)
 {
     if(root == null)
         return;
         
     printInorder(root.left);
     System.out.print(root.data+" ");
     
     printInorder(root.right);
 }
 
 public static void printSpecial(Node root)
 {
    if (root == null)
      return;
 
    Node next_root=null;
 
    while (root != null)
    {
       System.out.print(root.data+" ");
 
       if( root.left!=null && next_root==null )
         next_root = root.left;
       else if( root.right!=null && next_root==null  )
         next_root = root.right;
 
       root = root.nextRight;
    }
    
    printSpecial(next_root);
 }
 
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
 
	        while(t > 0){
	            String s = br.readLine();
 	    	Node root = buildTree(s);
     	    Tree g = new Tree();
			    g.connectNodesatSameLvl(root);
             printSpecial(root);
             System.out.println();
             printInorder(root);
             System.out.println();
             t--;
         
     }
 }

}

//} Driver Code Ends
//User function Template for Java

//class TreeInner
//{
// public static void connect(Node p)
//     {
//        Deque<Node> dq = new LinkedList<Node>();
//		ArrayList<Node>al=new ArrayList<Node>();
//		dq.add(p);
//		dq.add(null);
//		connectNodesAtSameLevel(p, 0, dq,al);
//     }
//
///**
// * 
// * @param root pass root Node to connect all nodes at a same level
// * @param level pass level for recursively travelling in a tree
// * @param dq double ended queue to traverse
// * @param al arraylist to track elements of a same level
// * @see this method is to connect all nodes of a same level with the help of nextRight Property of Node Class to next node in same level
// * @author vikas 
// */
//static	void connectNodesAtSameLevel(Node root, int level, Deque<Node> dq,ArrayList<Node>al) {
////		StringBuffer sb = new StringBuffer();
//		
//		if (root == null)
//			return;
//
//		while (!dq.isEmpty()) {
//			Node num = dq.poll();
//			if (num == null && dq.size() > 0) {
//				dq.add(null);
//				// System.out.print(sb);
//				al.clear();
//				// sb = new StringBuffer();
//				level++;
//			} else if (num == null && dq.size() == 0) {
//				// 	System.out.print(sb);
//				// 	sb = new StringBuffer();
//					al.clear();
//				
//			} else {
//				// sb.append(num.data + " ");
//				if(al.size()>=1)
//				al.get(al.size()-1).nextRight=num;
//				al.add(num);
//				Node node = num;
//				if (node.left != null) {
//					dq.add(node.left);
//				}
//				if (node.right != null) {
//					dq.add(node.right);
//				}
//			}
//		}
//	}
//
//}
