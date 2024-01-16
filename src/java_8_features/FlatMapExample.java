package java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pojos.CustColor;
import pojos.CustSize;
import pojos.Product;



public class FlatMapExample {
	public static void main(String[] args) {
		List<Product>products=Product.getProducts();
		List<List<String>>productsWithFirstCat= products.stream().map(product->product.getCategoryList()).collect(Collectors.toList());
		productsWithFirstCat.forEach(x->System.out.println(x));
		}
}
