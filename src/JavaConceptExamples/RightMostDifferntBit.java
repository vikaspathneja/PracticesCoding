package JavaConceptExamples;
public class RightMostDifferntBit {

	public static void main(String[] args) {
//		
		//Position of Rightmost different bit
		int first=64; //01000000
		int second=36;//00100100
					  //01100100
		int c=first^second;
		String s=Integer.toBinaryString(c);
		System.out.println(s);
		for(int i=s.length()-1; i>0; i--) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i)=='1') {
				System.out.println(s.length()-i);
			break;
			}
		}
		
		
		
	}

	
}