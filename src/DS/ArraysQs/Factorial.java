package DS.ArraysQs;

public class Factorial {
	public static void main(String[] args) {
		int no=getFact(5);
		System.out.println(no);
	}
	public static int getFact(int no) {
		if(no==0)
			return 1;
		
		return no*getFact(no-1);
	}
}
