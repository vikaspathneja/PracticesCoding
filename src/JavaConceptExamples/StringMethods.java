package JavaConceptExamples;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringMethods {
	 public static void main(String[] args) throws Exception
	    {
		 String str="vikasisgoodperson";
		 String finals=reverse(str);
	    System.out.println(finals);
	    }

	private static String reverse(String str) {
		if(str==null ||str.length()<=1)
			return str;
		return reverse(str.substring(1)+str.charAt(0));
	}
	}

