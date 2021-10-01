package design_pattern.solidPrinciples.cust_filters;

import java.util.List;
import java.util.stream.Collectors;

import pojos.Product;
import design_pattern.solidPrinciples.iterfacesss.Filter;
import design_pattern.solidPrinciples.iterfacesss.Specification;

public class ProductFilterAdvanced implements Filter<Product>{

	
	@Override
	public List<Product> filter(List<Product> list, Specification<Product> specification) {
		return list.stream().filter(x->specification.isSpecificationSatified(x)).collect(Collectors.toList());
	}

}
