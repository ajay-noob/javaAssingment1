package com.practisjava.first;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd numbers using for loop:");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Odd numbers using while loop:");
        int oddNum = 1;
        while (oddNum <= 10) {
            System.out.println(oddNum);
            oddNum += 2;
        }

        System.out.println("Odd numbers using do-while loop:");
        int oddNum2 = 1;
        do {
            System.out.println(oddNum2);
            oddNum2 += 2;
        } while (oddNum2 <= 10);
	}

}
