package design_pattern.factory_design_pattern.copy;


public class HdfcBankFactory extends Factory{
	
	
	@Override
	protected BankInterface createBankType() {
		return new Hdfc();
	}
	

}
