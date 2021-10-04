package design_pattern.factory_design_pattern.copy;

public class Main {
	public static void main(String[] args) throws InstantiationException, ClassNotFoundException {

		Factory bankFatory=new HdfcBankFactory();
		BankInterface bank=bankFatory.getBankInstance();
		System.out.println("hdfc account="+bank.createAccount());
		System.out.println("hdfc bank location="+bank.getBankLocation());
		System.out.println("hdfc rate of interest="+bank.rateOfInter());
		System.out.println("hdfc loan amount="+bank.getLoanAmount());
		System.out.println("hdfc date of start="+bank.dateOfStart());
	
		
		System.out.println();
		Factory f=new ICICIBankFactory();
		BankInterface ibank= f.getBankInstance();
	
		System.out.println("icici account="+ibank.createAccount());
		System.out.println("icici bank location="+ibank.getBankLocation());
		System.out.println("icici rate of interest="+ibank.rateOfInter());
		System.out.println("icici loan amount="+ibank.getLoanAmount());
		System.out.println("icici date of start="+ibank.dateOfStart());

	
	
	}
}
