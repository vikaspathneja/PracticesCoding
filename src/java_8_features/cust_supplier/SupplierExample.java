package java_8_features.cust_supplier;

import java.util.function.Supplier;

public class SupplierExample {
	public static Supplier<String>randomPasswordGenerator=()->{
		String str="abcdefghijklmnopqrstuvwxyz$&@#";
		String randomPwd="";
		for(int i=0; i<6; i++) {
			int no=(int) (Math.random()*29);
			randomPwd+=str.charAt(no);
		}
		return randomPwd;
	};
	
	
	public static Supplier<String> random6DigitOtpGenerator=()->{
		String randomPwd="";
		for(int i=0; i<6; i++) {
			int no=(int) (Math.random()*10);
			randomPwd+=no;
		}
		return randomPwd;
	};
	
	public static void main(String[] args) {
		String pwd=randomPasswordGenerator.get();
		System.out.println("Random Password Generator="+pwd);

		String pwd2=random6DigitOtpGenerator.get();
		System.out.println("Random OTP Generator="+pwd2);

	}
	
	
	
}
