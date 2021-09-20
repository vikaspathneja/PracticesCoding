package java_8_features.cust_supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExample2 {
	public static Supplier<String>randomCharSupplier=()->{
		int randomNo=(int)(Math.random()*29);
		String str="abcdefghijklmnopqrstuvwxyz$&@#";
		return String.valueOf(str.charAt(randomNo)).toUpperCase();
	};
	public static Supplier<Integer>randomNoSupplier=()->{
		return (int)(Math.random()*10);
	};
	public static Predicate<Integer>pIsEven=x->x%2==0;
	
	public static Supplier<String>pwdgen8Length=()->{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<8;i++) {
			if(pIsEven.test(i))
				sb.append(randomNoSupplier.get());
			else
				sb.append(randomCharSupplier.get());
				
		}
		return sb.toString();
	};
	
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			String sss=pwdgen8Length.get();
		System.out.println(sss );
		}
	}
	
}
