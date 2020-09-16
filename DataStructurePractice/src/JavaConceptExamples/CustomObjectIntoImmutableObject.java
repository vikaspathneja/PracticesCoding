package JavaConceptExamples;

public  class CustomObjectIntoImmutableObject {
	private final String ObjectName;
	private final Address addr;
	
	public  CustomObjectIntoImmutableObject(String name,Address addr) {
		this.ObjectName=name;
		this.addr=new Address(addr.getPin(),addr.getStreet());
	}

	public String getObjectName() {
		return ObjectName;
	}

	public Address getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "CustomObjectIntoImmutableObject [ObjectName=" + ObjectName + ", addr=" + addr + "]";
	}
	
	
	

}
