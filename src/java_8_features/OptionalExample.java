package java_8_features;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		Optional<String>opt=Optional.ofNullable(null);
		System.out.println(opt.orElse("vikas"));
		
		Optional<String>opt2=Optional.ofNullable("ram");
		System.out.println(opt2.orElse("vikas"));
		
//		System.out.println(opt.get());

		System.out.println(opt.isPresent());
		System.out.println(opt2.isPresent());
		
	}
}
