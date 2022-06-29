// Min_dowhile

import java.util.*;
class Min_number_dowhile
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int rem;                              
	System.out.println("Enter the big number= ");
	int n=sc.nextInt();
	int min=n;

	do
	{
		rem=n%10;
		if(rem<min)
			min=rem;
		
		n=n/10;	
	}while(n!=0);
	System.out.println("min number is= "+ min);
		
	}

}