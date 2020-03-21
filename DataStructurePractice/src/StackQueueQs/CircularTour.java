package StackQueueQs;
//{ Driver Code Starts
import java.util.*;


public class CircularTour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new GfG().tour(p,d));
		t--;
		}
	}
}// } Driver Code Ends
//In java function tour() takes two arguments array of petrol
//and array of distance
class GfG
{
 int tour(int petrol[], int distance[])
 {
	// Your code here
	int flag=0;
	int petrolcurrent=0;
	int start=0;
	int end=0;
	for(int i=0; i<petrol.length;i++){
	    int cp=petrol[i];
	    int cd=distance[i];
	    petrolcurrent+=cp-cd;
	    if(i==0 && petrolcurrent<0){
	    petrolcurrent=0;
	    continue;
//	    return -1;
	    }
	    else{
	    	if(i==0) {
	    	    start=i;
		    	end=petrol.length-1;
	    	}else {
	    	    start=i;
	    	    end=i-1;
	    	}
	    	
	    while(petrolcurrent>=0 && start!=end ){
	        start=(start+1)%petrol.length;
	        petrolcurrent+=petrol[start]-distance[start];
//	        System.out.println("petrolcurrent="+petrolcurrent);
	    }
     if(petrolcurrent<0){
    	 petrolcurrent=0;
     flag= -1;
//     break;
     }
     if(start==end && petrolcurrent>0){
     flag= i;
     break;
//     return flag;
     }
	}

 }
 return flag;
}
}