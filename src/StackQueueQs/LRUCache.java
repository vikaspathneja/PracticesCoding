package StackQueueQs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;



public class LRUCache {
    private static Map<Integer, Node> hsMap;
    private static int capacity, count;
    private static Node head, tail;

    LRUCache(int cap) {
        // Intialize the cache capacity with the given
        // cap
    capacity=cap;
    hsMap = new HashMap<>(); 
      head = new Node(0, 0); 
        tail = new Node(0, 0); 
        head.next = tail; 
        tail.pre = head; 
        head.pre = null; 
        tail.next = null; 
        count = 0; 
    }


    
    // This method works in O(1)
    public static int get(int key) {
    
        
        if(hsMap.get(key) != null) { 
			Node node = hsMap.get(key); 
			int result = node.value; 
		    deleteNode(node); 
            addToHead(node);
			return result; 
		} 
		
		return -1; 
        
        
        
    }
    
    
        public static void deleteNode(Node node) 
    { 
        node.pre.next = node.next; 
        node.next.pre = node.pre; 
    } 
  
    public static void addToHead(Node node) 
    { 
        node.next = head.next; 
        node.next.pre = node; 
        node.pre = head; 
        head.next = node; 
    } 
  
 
  

    // This method works in O(1)
    public static void set(int key, int value) {
        // your code here
        if(LRUCache.count<capacity){
        Node nnode=new Node(key,value);
        
        if(hsMap.containsKey(key)){
            Node oldnode=hsMap.get(key);
            deleteNode(oldnode); 
            hsMap.remove(key);
            addToHead(nnode);
            hsMap.put(key,nnode);
            }else{
        addToHead(nnode);
        // LRUCache.count++;
        hsMap.put(key,nnode);
            }}else {
            Node nnode=new Node(key,value);
            if(hsMap.containsKey(key)){
            Node oldnode=hsMap.get(key);
            deleteNode(oldnode); 
            hsMap.remove(key);
            addToHead(nnode);
            hsMap.put(key,nnode);
            }else{
            int tailprevalue=tail.pre.key;
            deleteNode(tail.pre); 
            hsMap.remove(tailprevalue);
            addToHead(nnode);
            hsMap.put(key,nnode);
            }
            
            
        }
        LRUCache.count=hsMap.size();
        // System.out.println(hsMap);
    }
}
