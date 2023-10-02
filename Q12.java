package com.practisjava.first;

public class Q12 {
	
	
	 public static boolean isVowelOrConsonant(char ch) {
	        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch = 'A';

        
        boolean isVowel = isVowelOrConsonant(ch);

        if (isVowel) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }

   

}
