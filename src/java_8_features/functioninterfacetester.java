package java_8_features;

import pojos.Employee;
import pojos.Subject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class functioninterfacetester {
    public static void main(String[] args) {
//        myinterface ref=x->x*x;
//        System.out.println(ref.printno(5));
//       ref.printanotherno(5);
//
//
//        List<Employee> list=new ArrayList<>();
//        list.add(new Employee("first",1));
//        list.add(new Employee("second",1));
//        Stream<String> listS = list.stream().map(p->{
//            System.out.print(p.getName());
//            return p.getName();
//        });
//        listS.forEach(System.out::println);



        //Get person whose dob is after 1990
        Map<String,List<Employee>> mapOfPersWithYeargreter1990=Employee.getEmployees().stream().filter(per->per.getAge()>20).collect(Collectors.groupingBy(p->p.getGender()));
        mapOfPersWithYeargreter1990.values().stream();
        //List of all subjects of all persons
        List<Subject>listOfSubjects=Employee.getEmployees().stream().flatMap(p->p.getSubjects().stream()).collect(Collectors.toList());
        //Group person by month  of birth
        List<Employee>lists=Employee.getEmployees().stream().sorted(Comparator.comparing(Employee::getGender)).limit(10).collect(Collectors.toList());


    }
}
