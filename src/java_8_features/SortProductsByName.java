package java_8_features;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pojos.Product;

public class SortProductsByName {
	public static void main(String[] args) {
		List<Product>products=Product.getProducts();
		Comparator<Product> productnameAscOrder=(p1,p2)->p1.getName().compareTo(p2.getName());
		Comparator<Product> productnameDscOrder=(p1,p2)->p2.getName().compareTo(p1.getName());
			
		Comparator<Product> productLengthComparator=(p1,p2)->{
			return (int)p1.getLength()-p2.getLength();
//			if(p1.getLength()<p2.getLength())
//				return -1;
//			else if(p1.getLength()>p2.getLength())
//				return 1;
//			else
//				return 0;
		};
		
		Collections.sort(products,productLengthComparator);	
		System.out.println("producst sort by productLengthComparator::"+products);
		Collections.sort(products,productnameAscOrder);	
		System.out.println("producst sort by productnameAscOrder::"+products);
		Collections.sort(products,productnameDscOrder);	
		System.out.println("producst sort by productnameDscOrder::"+products);
		
	}
}
