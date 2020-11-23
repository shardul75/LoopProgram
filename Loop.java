import java.util.*;
class Loop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k,l=6,no;
		int fib1=0,fib2=1,fib3=0;
		System.out.println("...........For Loop...........");
		System.out.println("Enter the no for Fibonacci series");
		no=sc.nextInt();
		for(k=0;k<no;k++)
		{
			fib1=fib2;
			fib2=fib3;
			fib3=fib1+fib2;
			System.out.println(""+fib3);
		}
		System.out.println("...........Do While Loop..........");
		System.out.println("Enter the number where you want to break the loop between 1 to 11");
		int no1=sc.nextInt();
		k=1;
		do
		{
			if(k==no1)
			{
				break;	
			}
			System.out.println(""+k);
		k++;
		}while(k<11);
	}
}
/*
Output=
C:\Users\Admin\Documents\java programs>javac Loop.java

C:\Users\Admin\Documents\java programs>java Loop
...........For Loop...........
Enter the no for Fibonacci series
8
1
1
2
3
5
8
13
21
...........Do While Loop..........
Enter the number where you want to break the loop between 1 to 11
4
1
2
3
*/