package P2.Example;

import java.util.Scanner;

public class Console {
	//Scanner can be changed to field as it's proper to console class. No need to create new instance anytime we call readNumber
	
	private static Scanner scanner = new Scanner(System.in);
	
	//Also we can overload this method as some para donot need min,max and validation
	
	public static double readNumber(String prompt) {
		return scanner.nextDouble();
	}
	
	public static double readNumber(String prompt, double min, double max) {
		//Scanner scanner = new Scanner(System.in);
		double value;
		while (true) {
			System.out.print(prompt);
			value = scanner.nextDouble();
			if (value >= min && value <= max)
				break;
			System.out.println("Enter a value between " + min + " and " + max);
		}
		return value;
	}

}
