package design_pattern.factory_design_pattern.copy;

public abstract class Factory {
	public BankInterface getBankInstance() {
		BankInterface bank=createBankType();
		bank.createAccount();
		bank.getBankLocation();
		bank.getLoanAmount();
		return bank;
	}

	protected abstract BankInterface createBankType(); 

	
}
