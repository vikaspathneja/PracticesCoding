package pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
	private String name;
	private CustColor color;
	private CustSize size;
	private int length;
	private List<String>categoryList;
	
	
	public List<String> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CustColor getColor() {
		return color;
	}
	public void setColor(CustColor color) {
		this.color = color;
	}
	public CustSize getSize() {
		return size;
	}
	public void setSize(CustSize size) {
		this.size = size;
	}
	public Product(String name, CustColor color, CustSize size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	
	public Product(String name, CustColor color, int length) {
		super();
		this.name = name;
		this.color = color;
		this.length = length;
	}
	
	

	
	public Product(String name, CustColor color, CustSize size, int length, List<String> categoryList) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
		this.length = length;
		this.categoryList = categoryList;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", color=" + color + ", size=" + size + ", length=" + length
				+ ", categoryList=" + categoryList + "]";
	}
	public static List<Product> getProducts(){
		List<Product>products=new ArrayList<>();
		products.add(new Product("a", CustColor.BLACK,CustSize.EXTRALARGE,109,Arrays.asList("firstcat","secondcat")));
		products.add(new Product("b", CustColor.RED,CustSize.EXTRALARGE,10,Arrays.asList("firstcat","secondcat")));
		products.add(new Product("cdads", CustColor.BLUE,CustSize.EXTRALARGE,10,Arrays.asList("thirdcat","fourthcat")));
		products.add(new Product("d", CustColor.BLACK,CustSize.EXTRALARGE,1,Arrays.asList("firstcat","secondcat")));
		products.add(new Product("e", CustColor.BLUE,CustSize.LARGE, 8,Arrays.asList("sixcat","sevencat")));
		products.add(new Product("f", CustColor.RED,CustSize.SMALL, 7,Arrays.asList("ninecat","tencat")));
		return products;

	}
	
	
	
	
}
