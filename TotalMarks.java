package com.edu;

public class TotalMarks {

	public static void main(String[] args) {
		int iot=85; 
		int maths=80;
		int nosql=85;
		int english=90;
		int hindi=97;
		int management = 70;
		int markspersubject = 100;
		
		int marks=(iot+maths+nosql+english+hindi+management);
		System.out.println(" marks " +marks);
		int percentage = ((marks/6*markspersubject)/100);
		
		
		System.out.println("percentage " +percentage);
				
		
				
		// TODO Auto-generated method stub

	}

}
