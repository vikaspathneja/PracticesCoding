package DS.ArraysQs.bitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstBitSetFromRight {
	public static void main(String[] args) throws IOException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while (tc-- > 0) {
			boolean firstSetflag=false;
			int num=Integer.parseInt(br.readLine());
			ArrayList<Integer>al=getBitArrayListOfNum(num);
//		System.out.println(position);
			int position=0;
			while(firstSetflag==false && al.size()>=2 && position<al.size()-1) {
				int num1=al.get(position);
				int num2=al.get(position+1);
//				System.out.println("num1=="+num1);
//				System.out.println("num2=="+num2);
				if(num1+num2==1) {
					firstSetflag=true;			
					break;
				}
				position++;
			}
			
			if(firstSetflag==true) {
				if(position==0) {
					System.out.println(2);
				}else {
					System.out.println(position+2);
				}
			}
		}
	}
	
	public static ArrayList<Integer> getBitArrayListOfNum(int num) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(num>0) {
			int rem=num%2;
			 num=num/2;
			al.add(rem);
		}
		
		return al;
	}
	
	
}
