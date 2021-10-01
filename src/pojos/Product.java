package pojos;



public class Product {
	private String name;
	private CustColor color;
	private CustSize size;
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

	
	
	
	
	
	
	
}
