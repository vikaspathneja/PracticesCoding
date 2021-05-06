package java_8_features;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bcd","abc", "efg", "abcd","", "jkl");
		java.util.function.Predicate<String>chklength=s->s.length()>2;
		List<String>filteredList=strings.parallelStream().filter(s->{
			
			try {
				return chklength.test(s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}).map(s->{
			String fc=String.valueOf(s.charAt(0));
			String lc=String.valueOf(s.charAt(s.length()-1));
			return fc+lc;
		})
				.distinct()
				
				
				.collect(Collectors.toList());
		System.out.println(filteredList.toString());
		
		List<Integer> intlist= Arrays.asList(1,2,3,4,5);
		IntSummaryStatistics summ= intlist.stream().mapToInt((x)->x).summaryStatistics();		
		System.out.println(summ.getMax());
		System.out.println(summ.getMin());
		System.out.println(summ.getAverage());
		System.out.println(summ.getSum());
		
	}
}
