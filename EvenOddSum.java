// 2:Sum of Even and odd

import java.util.*;
class EvenOddSum
{
	public static void main(String []args)
	{
		int n,rem,esum=0,osum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		do
		{
			rem=n%10;
			if(rem%2==0)
				esum=esum+rem;
			esle
				osum=osum+rem;
			n=n/10;

		}while(n!=0);
			System.out.println("Sum of even= "+ esum);
			System.out.println("Sum of odd= "+eodd);
			
	}
}