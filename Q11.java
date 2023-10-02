package com.practisjava.first;

public class Q11 {
	 public static double calculateArea(double length, double width) {
	        return length * width;
	    }

	    
	    public static double calculatePerimeter(double length, double width) {
	        return 2 * (length + width);

	}

	public static void main(String[] args) {
		
		 double length = 7.0;
	        double width = 4.0;

	        
	        double area = calculateArea(length, width);

	       
	        double perimeter = calculatePerimeter(length, width);

	        System.out.println("Rectangle Area: " + area);
	        System.out.println("Rectangle Perimeter: " + perimeter);
	    }

	
	   

}
