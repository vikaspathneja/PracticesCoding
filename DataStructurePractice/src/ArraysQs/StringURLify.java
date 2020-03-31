package ArraysQs;

public class StringURLify {

	public static void main(String[] args) {
		String url=" Vikas is my name ";
		url=url.trim();
		
		System.out.println(url.replaceAll(" ","%20" ));
		
		

	}

}
