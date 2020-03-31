package ArraysQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class MaxNoArrayInWindow {

	public static void main(String[] args) throws IOException {
	}

	public static void getMax() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String myArr[] = br.readLine().trim().split(" ");
			int noOfInputs = Integer.parseInt(myArr[0]);
			int windowSize = Integer.parseInt(myArr[1]);
			int maxElSiz = ((noOfInputs / windowSize) + 1);
			int windowMaxArr[] = new int[noOfInputs];
			int count = 0;
			String inputArr[] = br.readLine().trim().split(" ");
			int maxNo = 0;
			for (int i = 0; i < noOfInputs; i++) {
				int no = Integer.parseInt(inputArr[i]);
				if (i == 0) {
					int ws = windowSize;
					maxNo = no;
					// System.out.println("maxNo before while="+maxNo);
					while (ws-- > 0) {
						// System.out.println("ws="+ws);
						// System.out.println("value at ws="+Integer.parseInt(inputArr[ws]));
						if (Integer.parseInt(inputArr[ws]) > maxNo) {
							maxNo = Integer.parseInt(inputArr[ws]);
						}
					}
					// System.out.println("final maxNo get from window="+maxNo);
					windowMaxArr[count++] = maxNo;
					i += (windowSize - 1);
				} else {
					// System.out.println("maxNo="+maxNo);
					// System.out.println("i="+i);
					// System.out.println("no="+no);

					if (no >= maxNo) {
						windowMaxArr[count++] = no;
						maxNo = no;
					} else {
						windowMaxArr[count++] = maxNo;
					}
				}

			}
			for (int i = 0; i < count; i++)
				System.out.print(windowMaxArr[i] + " ");
			System.out.println();
		}
	}

	public static void getMax2() throws IOException {
		Deque<Integer> dq=new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String myArr[] = br.readLine().trim().split(" ");
			int noOfInputs = Integer.parseInt(myArr[0]);
			int windowSize = Integer.parseInt(myArr[1]);
			int windowMaxArr[] = new int[noOfInputs];
			String inputArr[] = br.readLine().trim().split(" ");
			int count = 0;
			int maxNo = 0;
			for (int i = 0; i < noOfInputs; i++) {
				int no = Integer.parseInt(inputArr[i]);
			}
			for (int i = 0; i < count; i++)
				System.out.print(windowMaxArr[i] + " ");
			System.out.println();
		}

	}

}
