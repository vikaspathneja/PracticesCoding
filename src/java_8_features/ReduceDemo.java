package java_8_features;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import pojos.Employee;
import pojos.Product;

public class ReduceDemo {
	public static void main(String[] args) {
			List<Product>products=Product.getProducts();
			int sumofLengthOfAllProducts=products.stream().map(x->x.getLength()).collect(Collectors.toList()).stream().reduce((x,y)->x+y).get();

//			products.stream().map(x->x.getName()).collect(Collectors.toList()).stream().
//			reduce(x,y->x.le));
			Product productWithMaxNameLength=products.stream().reduce((prod1,prod2)->prod1.getName().length()>prod2.getName().length()?prod1:prod2).get();
			System.out.println("productWithMaxNameLength:"+productWithMaxNameLength);
			Product productWithMaxLength=products.stream().reduce((prod1,prod2)->prod1.getLength()>prod2.getLength()?prod1:prod2).get();
			System.out.println("productWithMaxLength:"+productWithMaxLength);
			OptionalInt minlength=products.stream().map(x->x.getLength()).mapToInt(i->i).min();
			System.out.println("min length of product:"+minlength.getAsInt());
			OptionalInt maxLength=products.stream().map(x->x.getLength()).mapToInt(i->i).max();
			System.out.println("max length of product:"+maxLength.getAsInt());			
			OptionalDouble avgLength=products.stream().map(x->x.getLength()).mapToInt(i->i).average();
			System.out.println("avg length of product:"+avgLength.getAsDouble());
			
			
			System.out.println("----------------------------------------------------------------------------------");
			List<Employee>employees=Employee.getEmployees();
			System.out.println("Employees:"+employees.toString());
			int highedpaidBGradeEmployee=employees.stream()
					.filter(emp->emp.getGrade().equalsIgnoreCase("C"))
					.reduce((emp1,emp2)->emp1.getSalary()>emp2.getSalary()?emp1:emp2).get().getSalary();
			System.out.println("highedpaidBGradeEmployee:"+highedpaidBGradeEmployee);
			
			double avgPaidSalary=employees.stream().mapToInt(x->x.getSalary()).average().getAsDouble();
			System.out.println("avgPaidSalary:"+avgPaidSalary);

			IntSummaryStatistics summaryOfSalaryFieldOfAllEmployees=employees.stream().mapToInt(x->x.getSalary()).summaryStatistics();
			System.out.println(summaryOfSalaryFieldOfAllEmployees);
			DoubleSummaryStatistics summary=employees.stream().mapToDouble(x->x.getSalary()).summaryStatistics();
			System.out.println(summary);

	}
}