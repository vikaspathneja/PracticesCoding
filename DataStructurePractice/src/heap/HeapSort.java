package heap;


//{ Driver Code Starts
import java.util.*;
public class HeapSort
{
 void printArray(int arr[],int n)
 {
     //int n = arr.length;
     for (int i=0; i<n; ++i)
         System.out.print(arr[i]+" ");
     System.out.println();
 }
 public static void main(String args[])
 {
     Scanner sc  = new Scanner(System.in);
     HeapSort hs = new HeapSort();
     int arr[] = new int[1000000];
     int T = sc.nextInt();
     while(T>0)
     {
         int n = sc.nextInt();
         for(int i=0;i<n;i++)
             arr[i] = sc.nextInt();
         hs.heapSort(arr,n);
         hs.printArray(arr,n);
         T--;
     }
 }
 public void heapSort(int arr[], int n)
 {
     Heap g = new Heap();
     g.buildHeap(arr, n);
     for (int i=n-1; i>=0; i--)
     {
         int temp = arr[0];
         arr[0] = arr[i];
         arr[i] = temp;
         g.heapify(arr, i, 0);
     }
 }
}


