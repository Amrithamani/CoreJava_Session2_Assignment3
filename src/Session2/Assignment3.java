package Session2;

import java.util.Scanner;//import statement using Scanner

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize variable to get input using Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers");// print the new line

		int firstNumber = input.nextInt();// getting first input

		int secondNumber = input.nextInt();// getting second input

		int thirdNumber = input.nextInt();// getting third input

		// check the conditions using if else...if decision making
		// statement uses Relational operators

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber);// print first input
		}

		else if (secondNumber > thirdNumber) {
			System.out.println(secondNumber);// print second input
		}

		else {
			System.out.println(thirdNumber);// print third input
		}

	}

}
