
public class Overtime extends Person {

	public Overtime(String first, String last, double hoursWorked, double regularPayRate) {
		setName(first, last, hoursWorked, regularPayRate);
	}
	
	public double payRateMethod() {
		payRate = (hoursWorked * (regularPayRate * 1.5));
		return payRate;
	}

	public String toString() {
		return (firstName + " " + lastName + " " + payRateMethod());
	}
}
