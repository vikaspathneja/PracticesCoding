package design_pattern.factory_design_pattern.copy;

import java.util.Date;

public class Hdfc implements BankInterface {

	@Override
	public int rateOfInter() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String getBankLocation() {
		// TODO Auto-generated method stub
		return "Noida";
	}

	@Override
	public Date dateOfStart() {
		// TODO Auto-generated method stub
		return new Date();
	}

	@Override
	public int createAccount() {
		// TODO Auto-generated method stub
		return 1111;
	}

	@Override
public int getLoanAmount() {
	// TODO Auto-generated method stub
	return 63247;
}

}
