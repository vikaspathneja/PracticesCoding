package factory_design_pattern;

public class Main {
	public static void main(String[] args) {
		try {
			BankInterface bank=Factory.getBankInstance("Pnb");
			System.out.println(bank.rateOfInter());
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
