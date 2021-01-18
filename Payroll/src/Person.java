
public class Person {
	protected String firstName;
	protected String lastName;
	protected double regularPayRate;
	protected double hoursWorked;
	protected double payRate;

	public Person() {
		firstName = "";
		lastName = "";
		hoursWorked = 0.0;
		regularPayRate = 0.0;
		payRate = 0.0;
	}

	public Person(String first, String last, double hoursWorked, double regularPayRate) {
		setName(first, last, hoursWorked, regularPayRate);
	}

	public void setName(String first, String last, double hoursWorked, double regularPayRate) {
		firstName = first;
		lastName = last;
		this.hoursWorked = hoursWorked;
		this.regularPayRate = regularPayRate;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public double getRegularPayRate() {
		return regularPayRate;
	}
	
	public double payRateMethod() {
		payRate = (hoursWorked * regularPayRate);
		return payRate;
	}

	public String toString() {
		return (firstName + " " + lastName + " " + payRateMethod());
	}
}
