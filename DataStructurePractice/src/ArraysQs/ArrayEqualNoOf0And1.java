package practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEqualNoOf0And1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int noOfInputs = Integer.parseInt(br.readLine());
			int arr[] = new int[noOfInputs];
			String inputarr[] = br.readLine().trim().split(" ");
			int sumIndex[]=new int[noOfInputs];
			int count=0;
			int finalcounter=0;
			int sum=0;
			for (int i = 0; i < noOfInputs; i++) {
				int no= Integer.parseInt(inputarr[i]);
				arr[i]=(no==0)?-1:no; 
				sum+=arr[i];
				System.out.println("sum="+sum+" i="+i);
				
				if(sum==0) {
					System.out.println("counter increased for 0 to current loc="+i);
				finalcounter++;
				if(i>1) {
					System.out.println("sum when i greater than zero");
					
					if(count>0) {
						System.out.println("check middle sub array when count>0=="+count);
						int dum=count;
						while(dum-->0) {
							int nod=sumIndex[dum]+1;
							if(nod!=i) {
								System.out.println("when middle sub array found pos="+nod+" i="+i);
								finalcounter++;
							}
						}
					}
				
				}
				sumIndex[count++]=i;
				}else if(i>1) {
					if(arr[i]!=arr[i-1]) {
						//below counter is from prev pos to that position pair
						System.out.println("counter increased when prev doest not match i="+i);
						finalcounter++;
					}
				}
				
				
			}
			System.out.println("finalcounter="+finalcounter);
		}
	}
}
