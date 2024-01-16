package java_8_features.streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import pojos.Employee;

public class StreamExample {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bcd", "abc", "efg", "abcd", "", "jkl");
		java.util.function.Predicate<String> chklength = s -> s.length() > 2;
		List<String> firstCharLastCharList = strings.parallelStream().filter(s -> chklength.test(s))
				.map(s -> String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length() - 1))).distinct()
				.collect(Collectors.toList());
		System.out.println(firstCharLastCharList.toString());

		List<Integer> intlist = Arrays.asList(1, 2, 6, 3, 4, 5);
		System.out.println("intlist:" + intlist.toString());
		IntSummaryStatistics summ = intlist.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("getMax:" + summ.getMax());
		System.out.println("getMin:" + summ.getMin());
		System.out.println("Average:" + summ.getAverage());
		System.out.println("getSum:" + summ.getSum());
		System.out.println("getCount:" + summ.getCount());

		// Frequency of each char in a string
		String str = "vikvikvikas";
		Map<Object, Long> list = str.chars().mapToObj(y -> (char) y)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(list);

		// sort the list of employees with name order
		List<Employee> emp = Employee.getEmployees().stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println(emp);

		// sort the list in reverse order
		List<Integer> intlist2 = Arrays.asList(1, 2, 6, 3, 4, 5, 12, 13, 14, 15, 18, 19, 20, 25, 23, 22, 32, 35, 2, 4,
				5, 23, 12, 14, 15, 18);
		List<Integer> reverseOrder = intlist2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrder);

		// print multiple of 5
		intlist2.stream().filter(x -> x % 5 == 0).forEachOrdered(System.out::println);
		System.out.println();

		// concat two unsorted array into single sorted array
		int[] a = { 4, 5, 3, 2, 1 };
		int[] b = { 7, 8, 9, 10, 6 };
		int[] n = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(n));

		// max 3 nos from list
		List<Integer> l1 = Arrays.asList(1, 2, 6, 3, 4, 5);
		l1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		// min 3 nos from list
		List<Integer> l2 = Arrays.asList(1, 2, 6, 3, 4, 5);
		l2.stream().sorted().limit(3).forEach(System.out::println);

		// sort the string list based on the string length
		strings.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);
		strings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

		// sum of nos
		int sumOfInteger = l2.stream().reduce(0, Integer::sum);
		System.out.println(sumOfInteger);

		// average of nos
		double average = l2.stream().mapToInt(x -> x).average().getAsDouble();
		System.out.println(average);

		// reverse the integer array
		System.out.println(
				Arrays.toString(IntStream.rangeClosed(1, l2.size()).map(i -> l2.get(l2.size() - i)).toArray()));

		String palindrom = "rotator";
		// palindrome
		boolean isPalindrome = IntStream.range(1, palindrom.length() / 2)
				.noneMatch(i -> palindrom.charAt(i) != palindrom.charAt(palindrom.length() - 1 - i));
		System.out.println("rotator isPalindrome=" + isPalindrome);

		// last element of array/list
		int lastno = l2.stream().skip(l2.size() - 1).findFirst().get();
		System.out.println("lastno of array=" + lastno);

		// age of person
		LocalDate vikasdob = LocalDate.of(1993, 12, 30);
		LocalDate simrandob = LocalDate.of(1993, 9, 03);
		LocalDate now = LocalDate.now();
		long ageofVikas = ChronoUnit.YEARS.between(vikasdob, now);
		long ageOfSimran = ChronoUnit.YEARS.between(simrandob, now);
		long diffbwsimvikas = ChronoUnit.DAYS.between(simrandob, vikasdob);
		System.out.println("ageofVikas=" + ageofVikas);
		System.out.println("ageOfSimran=" + ageOfSimran);
		System.out.println("diffbwsimvikas:" + diffbwsimvikas);

		String s = "kivas";
		String s1 = "VIKAS";

		s = Arrays.stream(s.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
		s1 = Arrays.stream(s1.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
		System.out.println("s & s1 isAnagram:" + s.equals(s1));

		// elements which are duplicate in an array
		List<Integer> list4 = Arrays.asList(1, 2, 6, 3, 4, 5, 5, 6);
		List<Integer> listOfduplicates = list4.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(y -> y.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());
		System.out.println("listOfduplicates:" + listOfduplicates);

		// elements which are unique in an array
		List<Integer> listOfUniques = list4.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(y -> y.getValue() == 1).map(entry -> entry.getKey()).collect(Collectors.toList());
		System.out.println("listOfUniques:" + listOfUniques);
		
		///remove duplicates form list
		Set<Integer>set=new HashSet<>();
		list4.stream().filter(x->!set.add(x)).collect(Collectors.toList()).forEach(System.out::println);

		Set<Integer>set1=new HashSet<>();
		List<Integer>uniquelist=list4.stream().distinct().collect(Collectors.toList());
		System.out.println(uniquelist);
		
		//print the sum of each element of integer no
		int no=54321;
		int finalsumofno=Stream.of(String.valueOf(no).split(""))
				.mapToInt(value -> Integer.valueOf(value))
				.reduce(0,Integer::sum);
		System.out.println(finalsumofno);

		int finalsumofno1=Stream.of(String.valueOf(no).split(""))
				.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(finalsumofno1);
		
		//reverse each word of string 
		String myworld="This is my world";
		String myworldreverse=Arrays.stream(myworld.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(myworldreverse);
		
		//find strings which start with digit
		String digitsStrigs="this is 9y world 2kas";
		Arrays.stream(digitsStrigs.split(" ")).filter(word->Character.isDigit(word.charAt(0))).forEach(System.out::println);
		
		//Find first repeated character in a string?
		String repatedCharacters="this is";
		repatedCharacters=repatedCharacters.replaceAll("\\s+", "");
		String repeatedChar=
				Arrays.stream(repatedCharacters.split(""))
				.collect(Collectors.groupingBy
						(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(e->e.getKey()).findFirst(). orElse("");
		System.out.println(repeatedChar);
		
		//Fibonacci series
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(4).map(f -> f[0]).forEach(System.out::println);
		
		
		//odd no
		Stream.iterate(new int[] {1,3},f -> new int[] {f[1],f[1]+2}).limit(3) .map(f -> f[0]).forEach(System.out::println);
		
		//even no
		Stream.iterate(new int[] {0,2},f -> new int[] {f[1],f[1]+2}).limit(10) .map(f -> f[0]).forEach(System.out::println);
		
		System.out.println("-------");
		Stream.iterate(new int[] {2,2},f-> new int[] {f[1],f[0]+f[1]}).limit(8).map(f -> f[0]).forEach(System.out::println);
	}
}
