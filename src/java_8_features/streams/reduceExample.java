package java_8_features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import pojos.Employee;

public class reduceExample {
    public static void main(String[] args) {
        Integer sumOfSalaries = Employee.getEmployees().stream().reduce(0, (pr, emp) -> pr + emp.getSalary(), Integer::sum);
        System.out.println("sumOfSalaries of from employess stream:" + sumOfSalaries);
        List<Integer> listOfSalaries = Employee.getEmployees().stream().map(x -> x.getSalary()).collect(Collectors.toList());
        Integer sum = listOfSalaries.stream().reduce(0, Integer::sum);
        System.out.println("sum of salaries from salaries list only :" + sum);


//		Filter a list of strings to only include those that start with the letter "a".
        List<String> names = Arrays.asList( "Bob", "Carol", "Dave", "Eve","Alice");
        List<String>finalNames=names.stream().filter(x->x.startsWith("a") || x.startsWith("A")).collect(Collectors.toList());
        System.out.println("finalName="+finalNames);

//        Map a list of integers to their squares.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbersFinal = numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(numbersFinal);

//        Reduce a list of integers to their sum.
        int finalSum=numbers.stream().reduce(0,Integer::sum);
        System.out.println(finalSum);

//        Find the first element in a list that is greater than 10.
        List<Integer> greterthan10 = Arrays.asList(1, 2, 3, 4, 5, 11, 12, 13);
        int firstelement=greterthan10.stream().filter(x->x>10).findFirst().get();
        System.out.println(firstelement);

//        Sort a list of strings in reverse alphabetical order.
        List<String> stringinreverorder = Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve");
        List<String> finalList = stringinreverorder.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(finalList);

    }

}
