package java_8_features.cust_function;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import JavaConceptExamples.Employee;
import JavaConceptExamples.Timesheet;

public class BiFunctionExample {
	public static BiPredicate<Employee, Timesheet>matchemployeeandtimesheet=(x,y)->{
		return x.getEno()==y.getEmployeeNo();
	};
	public static BiFunction<Employee, Timesheet, Integer> calculateMonthlySalaryByTimesheet = (x, y) -> {
		int monthlySal=0;
		if(matchemployeeandtimesheet.test(x, y))
		monthlySal= x.getSalary() * y.getNoOfDays();
		return monthlySal;
	};

	public static void main(String[] args) {
		int monthlySalOfVikasEmployee= calculateMonthlySalaryByTimesheet.apply(new Employee("vikas",1,1000), new Timesheet(30,1000));
		System.out.println(monthlySalOfVikasEmployee);
	}

}
