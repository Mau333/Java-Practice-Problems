//Write a program in Java to print n-th Fibonacci number where n is the user input. [Fin(n)=Fib (n-1) + Fib(n-2)]
import java.util.Scanner;
class Fibonacci
{
	int n;
	public Fibonacci(int a)
	{
		n=a;
	}
	public int findNthFibo()
	{
		int t=0,x=0,y=1;
		for(int i=3;i<=n;i++)
		{
			t=x+y;
			x=y;
			y=t;
		}
		return t;
	}
}

class Nth_fibo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position  : ");
		int x=sc.nextInt();
		Fibonacci p=new Fibonacci(x);
		System.out.println("\n"+x+"th term : "+p.findNthFibo());
		
	}
}