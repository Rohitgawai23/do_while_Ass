// Armstrong number by using dowhile loop 

import java.util.*;
class Armstrong_number_dowhile
{
	public static void main(String []args)
	{
		int n,i,arm=0,rem;
		System.out.println("Enter the number")	;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		i=n;
		do
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}while(n!=0);
		if(n==arm)
			{
			System.out.println("Armstrong number");
			}
		else
			{
			System.out.println("This is Not Armstrong number");
			}

	}
}