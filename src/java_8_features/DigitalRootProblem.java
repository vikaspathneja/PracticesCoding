package java_8_features;

public class DigitalRootProblem{
	public static void main(String[] args) {
//		String finalValue=DigitalRoot(191);

		
		int no=1234567891;
		while(no>=10) {
			no=DigitalRootImproved(no);
		}
		System.out.println(no);
	}
	private static int DigitalRootImproved(int i) {
		if(i<10)
			return i;
		return i%10+ DigitalRootImproved(i/10);//0+1
	}
	private static String DigitalRoot(int i) {
			
			String str=String.valueOf(i);
			if(str.length()==1) {
				return str;
			}
			else 
				i=getDigitSum(i);
			
			return DigitalRoot(i);
				
		}
		
		public static int getDigitSum(int i){
			int sum=0;
			while(i>0) {
				int rem=i%10;//1 //9 //1
				sum+=rem;//1+9+1//
				i=i/10;//1//0
			}
			return sum;
		}
		
}

