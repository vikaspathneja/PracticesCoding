package JavaConceptExamples;

public class Timesheet {
	private int noOfDays;
	private int employeeNo;

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Timesheet(int noOfDays, int employeeNo) {
		super();
		this.noOfDays = noOfDays;
		this.employeeNo = employeeNo;
	}
	
	
	

}
