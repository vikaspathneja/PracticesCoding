package bitMagic;

public class SumWithoutOperator {
	public static void main(String[] args) {
		int a=7;
		int b=6;
		System.out.println("sum of two values="+add(a,b));
}

	private static int add(int a, int b) {
		while(b!=0){
			int sum=a^b;
			int carry=(a&b) <<1;
			a=sum;
			b=carry;
		}
		return a;
	}
}
