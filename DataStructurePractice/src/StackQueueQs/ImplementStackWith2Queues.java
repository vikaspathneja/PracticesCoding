package StackQueueQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackWith2Queues {
	   Queue<Integer> q1 = new LinkedList<Integer>();
	    Queue<Integer> q2 = new LinkedList<Integer>();
	    
	
		   int pop()
		    {   
		        if(!q1.isEmpty())
		        return q1.remove();
		        else
		        return -1;
		    }
			
		    /* The method push to push element into the stack */
		    void push(int a)
		    {
		        q2.add(a);
		        while(!q1.isEmpty()){
		            q2.add(q1.remove());
		        }
		        q1=q2;
		        q2=new LinkedList<Integer>();
		    }
		   
	

}
