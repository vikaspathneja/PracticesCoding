package design_pattern.factory_design_pattern;

public class Factory {
	public static BankInterface getBankInstance(BankEnum bankName) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (BankInterface) 
				Class.forName
				(BankInterface.class.getPackage().getName()+"."+bankName.name())
				.newInstance();
	
	
}
}
