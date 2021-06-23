package ch08;

public class SalaryEmployee extends Employee {
	private int annualSalary;
	
	
	public SalaryEmployee(String name, int annualSalary) {
		super(name); this.annualSalary = annualSalary;
	}
	
	
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	int computePay() { // 오버라이딩
		return annualSalary / 12;
	}
}
