// prime number program bu using dowhile loop

import java.util.*;
class prime_number
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		int n, i;
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		i=2;

		do
		{
			if(n%i==0)
			break;
		
		 i++;
		}while(i<=n);
		if(n==i)
		{
			System.out.println("Number is prime number");
		}
		else
		{
			System.out.println("Number is not prime number");
		}

	}
}