package org.talend.bank;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LoanSimulator implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(0)
	private int age;

    @org.kie.api.definition.type.Position(1)
	private double annualRevenue;

    @org.kie.api.definition.type.Position(2)
	private double loanAmount;

    @org.kie.api.definition.type.Position(3)
	private double loanDeposit;

    @org.kie.api.definition.type.Position(4)
	private double loanInterest;

    @org.kie.api.definition.type.Position(5)
	private double monthlyPayment;

    @org.kie.api.definition.type.Position(value = 6)
	private int numberOfYears;

	@org.kie.api.definition.type.Position(value = 7)
	private boolean rejected;

	@org.kie.api.definition.type.Position(value = 8)
	private java.lang.String reason;

	public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public double getAnnualRevenue() {
        return this.annualRevenue;
    }
    
    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }
    
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanDeposit() {
        return this.loanDeposit;
    }
    
    public void setLoanDeposit(double loanDeposit) {
        this.loanDeposit = loanDeposit;
    }

    public double getLoanInterest() {
        return this.loanInterest;
    }
    
    public void setLoanInterest(double loanInterest) {
        this.loanInterest = loanInterest;
    }

    public double getMonthlyPayment() {
        return this.monthlyPayment;
    }
    
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

	public int getNumberOfYears() {
		return this.numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public boolean isRejected() {
		return this.rejected;
	}

	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}

	public java.lang.String getReason() {
		return this.reason;
	}

	public void setReason(java.lang.String reason) {
		this.reason = reason;
	}

	public LoanSimulator() {
	}

	public LoanSimulator(int age, double annualRevenue, double loanAmount,
			double loanDeposit, double loanInterest, double monthlyPayment,
			int numberOfYears, boolean rejected, java.lang.String reason) {
		this.age = age;
		this.annualRevenue = annualRevenue;
		this.loanAmount = loanAmount;
		this.loanDeposit = loanDeposit;
		this.loanInterest = loanInterest;
		this.monthlyPayment = monthlyPayment;
		this.numberOfYears = numberOfYears;
		this.rejected = rejected;
		this.reason = reason;
	}

}