package P2.Example;

public class MortgageCalculatorOOP {
	//Fields that represent the state of our calculator object
	
	private int principal;
	private float annualInterest;
	private byte years;
	
	private final static byte PERCENT  = 100;
	private final static byte MONTH_IN_YEAR = 12;
	
	// now lets initialize these Fields
	
	public MortgageCalculatorOOP(int principal, float annualInterest, byte years) {
		//super();
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}

	
	public double calculateMortgage() {
		// this method encapsulated all data.
		short numberOfPayments = (short) getNumberOfPayments();
		float monthlyInterest = getMonthlyInterest();
		
		double mortgage = principal
				*(monthlyInterest*(Math.pow((1 + monthlyInterest), numberOfPayments)))
				/((Math.pow((1 + monthlyInterest), numberOfPayments)) - 1);
		
		return mortgage;
	}


	public double calculateBalance(short numberOfPaymentsMade) {
		
		short numberOfPayments = (short) getNumberOfPayments();
		float monthlyInterest = getMonthlyInterest();
		
		double balance = principal
				*((Math.pow((1 + monthlyInterest), numberOfPayments)) - (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
				/(Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
		
		return balance;
	}

	public double[] getRemainingBalances() {
		double[] balances = new double[getNumberOfPayments()]; 
		for (short month = 1; month <= balances.length; month++)
			balances[month - 1]  = calculateBalance(month);
		
		return balances;
	}
	
	private float getMonthlyInterest() {
		return annualInterest / PERCENT / MONTH_IN_YEAR;
	}


	private int getNumberOfPayments() {
		return years * MONTH_IN_YEAR;
	}

		//public interface as other classes have to use it
	/*
	 * public byte getYears() { return years; }
	 */
}
