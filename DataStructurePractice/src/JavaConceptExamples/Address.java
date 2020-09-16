package JavaConceptExamples;

public class Address {
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", Street=" + Street + "]";
	}
	private int pin;
	private String Street;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Address(int pin,String street) {
	this.pin=pin;
	this.Street=street;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Street == null) ? 0 : Street.hashCode());
		result = prime * result + pin;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (Street == null) {
			if (other.Street != null)
				return false;
		} else if (!Street.equals(other.Street))
			return false;
		if (pin != other.pin)
			return false;
		return true;
	}
	

	
//@Override
//protected Address clone() throws CloneNotSupportedException {
//	return (Address)super.clone();
//}
	
}
