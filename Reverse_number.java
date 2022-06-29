// 3:Number reverse:

import java.util.*;
class Reverse_number
{
	public static void main(String []args)
	{
		int n,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number= ");
		n=sc.nextInt();
	
		do
		{	
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;

		}while(n!=0);
		System.out.println("Reverse number= "+rev);
	}
}




