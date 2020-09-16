package JavaConceptExamples;

import java.util.HashMap;

public class HashMapConcepts {
	public static void main(String[] args) {
		HashMap<Student,Integer>hm=new HashMap<Student, Integer>();

		

		hm.put(new Student("vikas",1),1);
		hm.put(new Student("vikas",1),1);
		hm.put(new Student("vikas",1),1);
		System.out.println(hm);
		/**
		 *  Case 1: if hashcode & equals not overridden in Student Class 
		 *  for every object of Student Class  default hashcode method implementation used which givens memory location in integeral form 
		 * 	so for every object with same sname and same sno still it will insert into hashmap 
		 *   3 objects stored even if  first 2 objects having same sname and same sno
		 *   
		 *   OutPut -----{[sname=vikas2, sno=1]=1, [sname=vikas, sno=1]=1, [sname=vikas, sno=1]=1}-----
		 */

		/**
		 *  Case 2: if hashcode overridden & equals not overridden in Student Class 
		 *  so for every object with same sname and same sno it will given return hashcode 
		 *  but equals not overridden so default implementation used which only check reference equality for two objects
		 *  new Student("vikas",1) && new Student("vikas",1) both objects even tough have same sname and same sno 
		 *  have different memory represetation in memory and have different objects in memory 
		 *  so while comparing in bucket it will insert both objects .
		 *   3 objects stored even if  first 2 objects having same sname and same sno
		 *   
		 *  OutPut -----{[sname=vikas, sno=1]=1, [sname=vikas, sno=1]=1, [sname=vikas2, sno=1]=1}-----
		 */

		
		/**
		 * Case 3: if hascode & equals overridden in Student Class  
		 * 
		 * 		@Override
		 *		public int hashCode() {
		 *		return sname.length()+sno; 
		 *		} 
		 * 
		 * then for objects having same sname and same sno it will give same hashcode and equals also overidden to check 
		 * if any object having same sname and same sno if it found it will not insert duplicate key( as Object), value
		 * 
		 *  OutPut for insertion below 
		 *  hm.put(new Student("vikas",1),1); ===hashcode=6
		 *  hm.put(new Student("vikas",1),1); ===hashcode=6
		 *  hm.put(new Student("vikas2",1),1); ===hashcode=7
		 *   2 objects stored ,first 2 objects having same sname and same sno
		 *  
		 *  OutPut -----{[sname=vikas, sno=1]=1, [sname=vikas2, sno=1]=1-----
		 *  
		 */
		
		
		
		
	}
}
