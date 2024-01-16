package java_8_features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupingbyExample {
public static void main(String[] args) {
	List<Character>listOfChar=Arrays.asList('a','b','a','d');
	listOfChar.stream().distinct().forEach(x->System.out.println(x+" element frequency:"+" "+Collections.frequency(listOfChar, x)));
	
	
}
}
