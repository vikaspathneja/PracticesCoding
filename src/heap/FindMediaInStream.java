package heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class FindMediaInStream {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputs = Integer.parseInt(br.readLine());
		TreeSet<Integer>ts=new TreeSet<Integer>();
		for (int i = 0; i < inputs; i++) {
			if(i==0) {
			int num = Integer.parseInt(br.readLine());
			ts.add(num);
			}else {
				if(i%2==0) {
					int size=ts.size();
					int evenMiddle=size/2;
					
				}
			}
				
		}
	}
}
