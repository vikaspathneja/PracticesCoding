package design_pattern.solidPrinciples.cust_filters;

import java.util.List;
import java.util.stream.Collectors;

import JavaConceptExamples.Employee;
import design_pattern.solidPrinciples.iterfacesss.Filter;
import design_pattern.solidPrinciples.iterfacesss.Specification;

public class EmployeeFilter implements Filter<Employee> {

	@Override
	public List<Employee> filter(List<Employee> list, Specification<Employee> specification) {
		return list.stream().filter(x->specification.isSpecificationSatified(x)).collect(Collectors.toList());
	}

}
