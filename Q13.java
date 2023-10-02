package com.practisjava.first;

public class Q13 {
	
	 public static int add(int a, int b) {
	        return a + b;
	    }

	    
	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    
	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	  
	    public static int divide(int a, int b) {
	        return a / b;
	    }

	   
	    public static int modulus(int a, int b) {
	        return a % b;
	    }
	    
	public static void main(String[] args) {
		 int num1 = 10;
	        int num2 = 3;

	      
	        int sum = add(num1, num2);
	        int difference = subtract(num1, num2);
	        int product = multiply(num1, num2);
	        int quotient = divide(num1, num2);
	        int remainder = modulus(num1, num2);

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);
	    }
	}


