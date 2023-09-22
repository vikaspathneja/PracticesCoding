package pojos;



public class Product {
	private String name;
	private CustColor color;
	private CustSize size;
	private int length;
	
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
	@Override
	public String toString() {
		return "Product [name=" + name + ", color=" + color + ", size=" + size + ", length=" + length + "]";
	}
	
	
	
	
	
	
}
