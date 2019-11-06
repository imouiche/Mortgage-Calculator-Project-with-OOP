package P2.Example;

public class PaymentSheduleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static double calculateBalance(
			int Principal, 
			float annualInterest, 
			byte years) {
		
		final byte MONTH_IN_YEAR = 12;
		final byte PERCENT  = 100;
		
		short numberOfPayments = (short) (years * MONTH_IN_YEAR);
		float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
		
		double mortgage = Principal
				*(monthlyInterest*(Math.pow((1 + monthlyInterest), numberOfPayments)))
				/((Math.pow((1 + monthlyInterest), numberOfPayments)) - 1);
		
		return mortgage;
	}
	
}
