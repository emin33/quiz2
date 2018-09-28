package pkgAuto;

public class CarPayment {
	private static double totalPrice = 35000;
	private static double downPayment = 0;
	private static double interestRate = .10;
	private static double remainingPrice = totalPrice - downPayment;
	private static int lengthMonths = 60;
	
	public static void main(String[] args) {
		// For example...  a car that costs $35,000...  10% loan...  for 60 months... will be $743.65, total interest paid $9,618.79
		System.out.println(monthlyPayment());
		System.out.println(totalInterest());
	}
	
	public static double monthlyPayment() {
		double withInterest = remainingPrice + remainingPrice * interestRate;
		return withInterest / lengthMonths;
	}
	
	public static double totalInterest() {
		return monthlyPayment() * lengthMonths - remainingPrice;
	}
}
