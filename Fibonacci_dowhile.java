// fibonacci number by using dowhile loop 

import java.util.Scanner;
class Fibonacci_dowhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=2,a=0,b=1,c=0;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		System.out.print("Fibonacci serirs : "+a+" "+b+" ");
		do
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}while(i<n);
		
	}
}
