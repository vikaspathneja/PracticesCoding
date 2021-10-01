package design_pattern.solidPrinciples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import JavaConceptExamples.Employee;
import pojos.CustColor;
import pojos.CustSize;
import pojos.Product;
import design_pattern.solidPrinciples.cust_filters.EmployeeFilter;
import design_pattern.solidPrinciples.cust_filters.ProductFilterAdvanced;
import design_pattern.solidPrinciples.iterfacesss.Filter;
import design_pattern.solidPrinciples.iterfacesss.Specification;

class ProductFilter{
	public static List<Product> filterByColor(List<Product>list,CustColor color){
		return list.stream().filter(x->x.getColor()==color).collect(Collectors.toList());
	}
	
	public static List<Product> filterBySize(List<Product>list,CustSize size){
		return list.stream().filter(x->x.getSize()==size).collect(Collectors.toList());
	}
}

public class Open_Closed_Relationship {
	public static void main(String[] args) {
		Product p1=new Product("Tree", CustColor.GREEN,CustSize.EXTRALARGE);
		Product p3=new Product("Boat", CustColor.GREEN,CustSize.LARGE);
		Product p4=new Product("TV", CustColor.BLACK,CustSize.EXTRALARGE);
		Product p2=new Product("House", CustColor.GREEN,CustSize.LARGE);
		Product p5=new Product("BED", CustColor.BROWN,CustSize.SMALL);
		
		
		List<Product> list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		
		List<Product> greenProducts=ProductFilter.filterByColor(list, CustColor.GREEN);
		System.out.println("green color products");
		
		for (Product product : greenProducts) {
			System.out.println(product.getName());
		}
		
		
		
		Specification<Product>greenColorSpec=x->x.getColor()==CustColor.GREEN; 
		Filter<Product> pfa =new ProductFilterAdvanced();
		List<Product>filterdProducts=pfa.filter(list, greenColorSpec);
		System.out.println();System.out.println("green color products with open close principle");
		filterdProducts.forEach(x->System.out.println(x.getName()));
		
		
		
		Specification<Product>ExtraLargeSpec=x->x.getSize()==CustSize.EXTRALARGE; 
		
		Specification<Product>multiSpec=x->x.getSize()==CustSize.EXTRALARGE && x.getColor()==CustColor.GREEN; 
		
		List<Product>filterdProducts2=pfa.filter(list, ExtraLargeSpec);
		System.out.println();System.out.println("extra large products with open close principle");
		filterdProducts2.forEach(x->System.out.println(x.getName()));
	
		
		List<Product>filterdProducts3=pfa.filter(list, multiSpec);
		System.out.println();System.out.println("extra large size products with green color specfiction by open close principle");
		filterdProducts3.forEach(x->System.out.println(x.getName()));
	
		
		List<Employee>listOfEmployees=new ArrayList<>();
		listOfEmployees.add(new Employee("vikas", 1000,1,"M"));
		listOfEmployees.add(new Employee("sim", 2000,2,"F"));
		listOfEmployees.add(new Employee("kiaan", 3000,3,"M"));
		listOfEmployees.add(new Employee("vaibhu", 4000,4,"F"));
		listOfEmployees.add(new Employee("a", 5000,5,"F"));
		listOfEmployees.add(new Employee("b", 6000,6,"M"));
		
		Filter<Employee>employeeFilter=new EmployeeFilter();
		Specification<Employee>isEmployeeFemale=x->x.getGender().equalsIgnoreCase("F");
		System.out.println();System.out.println("all female employee by ocp ");
		employeeFilter.filter(listOfEmployees, isEmployeeFemale).forEach(x->System.out.println(x.getEname()));
		
		
		
		
	}
	
		
	
}



