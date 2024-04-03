package DS.ArraysQs;

public class GCD {

	public static void main(String[] args) {
		int no1=544 ;
		int no2=465;
		int no=gcd(no1,no2);
		System.out.println("gcd of "+no1 +" & no2 "+no2+ "= "+no);
	}
	public static int gcd(int no1,int no2) {
		
		while(no2!=0) {
			int rem=no1%no2;
			no1=no2;
			no2=rem;
			
			
		}
		return no1;
	}

}
