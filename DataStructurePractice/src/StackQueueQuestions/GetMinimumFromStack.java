package StackQueueQuestions;

import java.util.Stack;

public class GetMinimumFromStack {


    int minEle;
    Stack<Integer> s=new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        if(s.empty())
        return -1;
        
        int min=Integer.MAX_VALUE;
        Stack<Integer>s2=new Stack<>();
        while(!s.empty()){
            int popped=s.pop();
            if(popped<min)
            min=popped;
            s2.push(popped);
        }
        
        while(!s2.empty()){
            s.push(s2.pop());
        }
        
        
        return min;
	// Your code here
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(!s.empty())
	return s.pop();
	else
	return -1;
    }

    /*push element x into the stack*/
    void push(int x)
    {
        s.push(x);
	// Your code here	
    }	


}
