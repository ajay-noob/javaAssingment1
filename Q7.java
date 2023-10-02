package com.practisjava.first;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char operator = '+';
	        int numA = 10, numB = 5;
	        int result;

	        switch (operator) {
	            case '+':
	                result = numA + numB;
	                System.out.println("Sum: " + result);
	                break;
	            case '-':
	                result = numA - numB;
	                System.out.println("Difference: " + result);
	                break;
	            case '*':
	                result = numA * numB;
	                System.out.println("Product: " + result);
	                break;
	            case '/':
	                result = numA / numB;
	                System.out.println("Quotient: " + result);
	                break;
	            case '%':
	                result = numA % numB;
	                System.out.println("Remainder: " + result);
	                break;
	            default:
	                System.out.println("Invalid operator");
	        }

	}

}
