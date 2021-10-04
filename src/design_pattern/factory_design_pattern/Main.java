package design_pattern.factory_design_pattern;

public class Main {
	public static void main(String[] args) {
		try {
			BankInterface bank=Factory.getBankInstance("IciciBank");
			System.out.println(bank.rateOfInter());
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String.valueOf(false);
		
	}
}
