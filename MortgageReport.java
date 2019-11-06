package P2.Example;

import java.text.NumberFormat;

public class MortgageReport {

	private MortgageCalculatorOOP mortgageCalculatorOOP; // initialize as Filed to avoid duplicate calls
	private final NumberFormat currency;

	public MortgageReport(MortgageCalculatorOOP mortgageCalculatorOOP) {
		//super();
		this.mortgageCalculatorOOP = mortgageCalculatorOOP;
		currency = NumberFormat.getCurrencyInstance();
	}

	public void printMortgage() {
		double mortgage  = mortgageCalculatorOOP.calculateMortgage();
		String mortgageFormated = currency.format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("----------------------------------");
		System.out.println("Monthly Payments: " + mortgageFormated);
	}

	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("---------------------------------");
		
		for (double balance: mortgageCalculatorOOP.getRemainingBalances())
			System.out.println(currency.format(balance));
		
	}

}
