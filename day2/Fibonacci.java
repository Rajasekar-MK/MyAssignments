package week1.day2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
	
		System.out.println(" Enter the range");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int s=1;
		
		
		for(int f = 0 ; s<= input;)
		{
	
			System.out.println(" The Fibonacci series is " + f);
		int t =f+s;
			f = s;
			s = t ;
			
			
		}
		
	}}


