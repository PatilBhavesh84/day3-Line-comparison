package com.bridgeLabz.lineComparison;

import java.util.Scanner;

public class Uc_1LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to the Line Comparison Problem");
		int a1,a2,b1,b2;
		double distance;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value of x1=");
		a1=sc.nextInt();

		System.out.println("Enter value of y1=");
		b1=sc.nextInt();

		System.out.println("Enter value of x2=");
		a2=sc.nextInt();

		System.out.println("Enter value of y2=");
		b2=sc.nextInt();
		distance=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));

		System.out.println("The distance between two lines is" +distance);

	}

}
