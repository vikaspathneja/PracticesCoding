package misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tester {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("hi", "hello","see you soon","bonjour");
        List<String> list2=Arrays.asList("hi", "bye","nice to meet you","bonjour");
//        CollectiosUtils.intersections(list1,list2);
//        List<String>listfinal= Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
//        listfinal.forEach(System.out::println);


//        ["hi", "bye","nice to meet you","bonjour"]
//        ["hi", "bonjour"]
//        ["hello","see you soon","bye","nice to meet you"]



    }
}


