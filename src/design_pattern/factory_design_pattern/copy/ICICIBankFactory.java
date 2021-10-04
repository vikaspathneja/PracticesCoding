package design_pattern.factory_design_pattern.copy;

public class ICICIBankFactory extends Factory {

	@Override
	protected BankInterface createBankType() {
		return new IciciBank();
	}


}
