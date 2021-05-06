package JavaConceptExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NaturalSortingSample {

	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student("d", 2));
		al.add(new Student("f", 3));
		al.add(new Student("g", 2));
		al.add(new Student("d", 4));
		System.out.println(al.toString());

//		Ordering with the help of Comparable(Natural Ordering) Student
//		Object Implements Comparable Interface having compareTo() Method 
		Collections.sort(al);
		System.out.println("Natural Order Of Object is with SNo=="+al.toString());

	
		
//		Ordering with the help of Comparator
		Collections.sort(al,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
//				return o1.getSno()<o2.getSno()?1:o1.getSno()>o2.getSno()?-1:0;
				return o1.getSname().compareTo(o2.getSname());
					}
			
		});

		System.out.println("Ordering with Comparotor With Name "+al.toString());
	}

}
