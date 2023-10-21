package week1.day2;

import java.util.Scanner;

public class Palindrome
{
public static void main(String args[])
{
	System.out.println("Enter the value: ");
	Scanner Value = new Scanner(System.in);
	int check = Value.nextInt();
	int input = check;
	int output = 0 ,temp;
	
	
	for(output=0; check>0; check/=10)
	{
		temp = check % 10;
		output =(output *10)+ temp;
		//check = check/10;
		
	}
	if(input == output)
	{
		System.out.println(" The number is palindrome");
	}
	else {
		System.out.println("it's not a palindrome");
	}	
}
}
	       
       
   
       

