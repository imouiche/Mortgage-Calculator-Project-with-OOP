package P2.Example;

public class MortgageCalculator {

	//fields i.e variables we declare at the class level accessible to all methods in the class
	// static bcz all methods are statics in this class
	
	public static void main(String[] args) {
		// <Mortgage calculation
		
		int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30 );
		byte years = (byte) Console.readNumber("Period (Years): ", 1, 30 );
		
		/*
		 * MortgageReport.printMortgage();
		 * 
		 * MortgageReport.printPaymentSchedule(Principal, annualInterest, years);
		 */
		
		MortgageCalculatorOOP mortgageCalculatorOOP =  new MortgageCalculatorOOP(principal, annualInterest, years);
		MortgageReport report = new MortgageReport(mortgageCalculatorOOP);
		
		report.printMortgage();
		report.printPaymentSchedule();
	}

}
