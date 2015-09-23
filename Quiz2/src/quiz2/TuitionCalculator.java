package quiz2;

import java.util.Scanner;

public class TuitionCalculator {
	/**
	 * Creates a tuition calculator that is used to determine the monthly repayment rate for a student loan
	 * Assuming it is amortization such that every payment is the same.
	 * @author Jacques
	 */
	Scanner input = new Scanner(System.in);
	
	// Initializes the variables and makes them private to encapsulate the class
	private double tuition; 
	private double pctIncrease; 
	private double APR; 
	private double term; 
	
	// Creates a constructor of the tuition calculator, leaving everything empty to the setters scanners can be used
	public TuitionCalculator() {
	}
	
	// Creates a constructor of the tuition calculator with assigned values for testing
	public TuitionCalculator(double tut, double pct, double APR, double term){
		this.tuition = tut;
		this.pctIncrease = pct;
		this.APR = APR;
		this.term = term;
	}
	
	// Creates a getter for Tuition
	public double getTuition() {
		return tuition;
	}
	// Creates a setter for tuition from the users input
	public void setTuition(){
		System.out.println("What is the tuition of the school: ");
		this.tuition = input.nextDouble();
	
	}
	// Gets the Percent Increase of the loan
	public double getPctIncrease() {
		return pctIncrease;
	}
	// Sets the percent increase based off of the users input
	public void setPctIncrease() {
		System.out.println("What is the percentage increase for tuition: ");
		this.pctIncrease = input.nextDouble();
		// Convert pct increase to its decimal equivalent
		this.pctIncrease /= 100;
	}
	// Gets the APR rate
	public double getAPR() {
		return APR;
	}
	// Sets the APR based off of user input
	public void setAPR() {
		System.out.println("What is the repament APR: ");
		this.APR = input.nextDouble();
		// Convert the APR to its decimal equivalent
		APR /= 100;
		
	}
	// Gets the repayment term
	public double getTerm() {
		return term;
	}
	// Sets the repayment term based off of user input
	public void setTerm() {
		System.out.println("How many years will you be paying off the loan: ");
		this.term = input.nextDouble();
	}
	
	public double MonthlyPayment(){
		// first calculate the amount of principle and convert terms to month
		double principle = this.tuition * Math.exp(this.pctIncrease*4);
		this.term *= 12;
		
		// Then Use the Amortization Equation (Broken into steps to make it easier.)
		// part1 is part of the numerator found in the denominator of the equation
		double part1 = (1+this.APR/12);
		double A = Math.pow(part1, term);
		A = A * (this.APR / 12);

		double part2 = Math.pow(part1, this.term) - 1;
		A = A / part2;
		A *= principle;
		
		System.out.printf("Monthly payment: $%.2f\n", A);
		return A;
	}
		
	}

