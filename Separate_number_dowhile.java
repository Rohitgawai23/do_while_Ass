/* 1:Number print seperately;
    12345
  1 2 3 4 5
*/

import java.util.*;
class Separate_number_dowhile
{
	public static void main(String args[])
	{
		int n,i,rem,rev=0,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		i=n;
		c=0;
		do
		{
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;

		}while(i!=0);
		 while(rev!=0)
		{
			int x=rev%10;
			System.out.print(x+" ");
			rev=rev/10;
		}
	}
}