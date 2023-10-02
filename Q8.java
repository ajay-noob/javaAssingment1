package com.practisjava.first;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Even numbers using for loop:");
	        for (int i = 2; i <= 10; i += 2) {
	            System.out.println(i);
	        }

	        System.out.println("Even numbers using while loop:");
	        int evenNum = 2;
	        while (evenNum <= 10) {
	            System.out.println(evenNum);
	            evenNum += 2;
	        }

	        System.out.println("Even numbers using do-while loop:");
	        int evenNum2 = 2;
	        do {
	            System.out.println(evenNum2);
	            evenNum2 += 2;
	        } while (evenNum2 <= 10);

	}

}
