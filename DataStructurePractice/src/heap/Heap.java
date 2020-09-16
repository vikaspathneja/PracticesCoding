package heap;

import java.util.Arrays;

public class Heap {

	 public static void buildHeap(int arr[], int n)
	 {
		 for (int i = 1; i <= n; i++) {
//			 System.out.println("index="+i);
//			 System.out.println("value="+arr[i]);
			 
			 swapElements(arr, i/2, i);
		 }
	 }

	 public static void swapElements(int arr[],int parentIndex,int i) {
//		 System.out.println("inside swapElements pi="+parentIndex);
		 System.out.println("pi value="+arr[parentIndex]);
//		 System.out.println("i="+i);
		 System.out.println("i value="+arr[i]);
		 
		 		if(i<1 || parentIndex<0)
		 		return ;
		 		
		 		if(arr[i]>arr[parentIndex]) {
				int parentVal=arr[parentIndex];
				arr[parentIndex]=arr[i];
				arr[i]=parentVal;
		 		if(!(parentIndex<=0))
				swapElements(arr, parentIndex/2, parentIndex);
				}
		 		
	 }
	 // To heapify a subtree rooted with node i which is
	 // an index in arr[]. n is size of heap
	 public static void heapify(int arr[], int n, int i)
	 {
	     // Your code here
	 }

}
