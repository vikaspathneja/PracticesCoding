package design_pattern.factory_design_pattern.copy;

import java.util.Date;

public class IciciBank implements BankInterface {

	@Override
	public int rateOfInter() {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public String getBankLocation() {
		// TODO Auto-generated method stub
		return "DELHI";
	}

	@Override
	public Date dateOfStart() {
		// TODO Auto-generated method stub
		return new Date();
	}

	@Override
	public int createAccount() {
		// TODO Auto-generated method stub
		return 29347;
	}

	@Override
	public int getLoanAmount() {
		// TODO Auto-generated method stub
		return 5678;
	}

}
