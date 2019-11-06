package P2.Example;

public class ProceduralToOop {

	public static void main(String[] args) {
		// employee Salary
		//Employee employee = new Employee();
		// compared to Employee, EmployeeAbstraction has less methods visible, then abstraction
		//new EmployeeAbstraction(50_000); // call from the second constructor
		EmployeeAbstraction employee = new EmployeeAbstraction(50_000, 0);
		//System.out.println(EmployeeAbstraction.numberOfEmployees); 
		EmployeeAbstraction.printNumberOfEmployee(); //employee.printNumberOfEmployee()
		int wage = employee.calculateWage(10); 
		System.out.println("Employee wage is " + wage);
		
		/*
		 * int baseSalary = employee.getBaseSalary(); int hourlyRate =
		 * employee.getHourlyRate();
		 */
		/*
		 * int wage = employee.calculateWage(10); System.out.println("Employee wage is "
		 * +wage + " from base salary " + baseSalary + " and hourly rate "+ hourlyRate);
		 */
		/*
		 * int baseSalary = 50_000; int extraHours = 10; int hourlyRate = 20;
		 * 
		 * int wage = calculateWage(baseSalary, extraHours, hourlyRate);
		 * System.out.println(wage);
		 */
	}
	// below method shd be static so we can call it in the main method which is static
 /*public static int calculateWage(
		 int baseSalary,
		 int extraHours,
		 int hourlyRate) {
	 return baseSalary + (extraHours * hourlyRate);*/
}
