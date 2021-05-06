package factory_design_pattern;

public class Factory {
	public static BankInterface getBankInstance(String bankName) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		return (BankInterface) Class.forName(bankName).newInstance();
//		.newInstance();
		return (BankInterface) Class.forName("factoryDesignPattern"+"."+bankName).newInstance();
//		return new Sbi();
	}
}
