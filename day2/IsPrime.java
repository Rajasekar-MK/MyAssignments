package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		 boolean isprime = true;
		 int n = 44;
		for(int i=2;i<n;i++)
		{
			if(n%2 ==0)
			{
			System.out.println( n +" is not a prime number");
			break;
		}
			if (isprime == true)
			{
				System.out.println( n + " is a prime number");
				break;
			}

	} }}

