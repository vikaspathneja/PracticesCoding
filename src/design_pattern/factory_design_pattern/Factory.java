package design_pattern.factory_design_pattern;

public class Factory {
	public static BankInterface getBankInstance(String bankName) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (BankInterface) 
				Class.forName
				(BankInterface.class.getPackage().getName()+"."+bankName.toString())
				.newInstance();
	
	
}
}
