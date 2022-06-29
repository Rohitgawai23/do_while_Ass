// Frequency by using dowhile loop

import java.util.*;
class freq_dowhile
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n,i,rem;                              
	System.out.println("Enter the big number ");
	n=sc.nextInt();
	System.out.println("Enter finding number ");
	int k=sc.nextInt();
	int c=0;
	i=n;
	do
	{
		rem=i%10;
		if(rem==k)
		{
			c++;
		}
		i=i/10;
	}while(i!=0);
	if(c>0)
	{
		System.out.println("number is found "+c+" times");
	}
	else
	{
		System.out.println("not found");
	}

}
}