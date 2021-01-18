
public class Special extends Person {

	public Special(String first, String last, double hoursWorked, double regularPayRate) {
		setName(first, last, hoursWorked, regularPayRate);
	}
	
	public double payRateMethod() {
		payRate = (hoursWorked * (regularPayRate + 10));
		return payRate;
	}

	public String toString() {
		return (firstName + " " + lastName + " " +  payRateMethod());
	}

}
