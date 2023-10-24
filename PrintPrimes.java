import java.util.Scanner;
import java.lang.Math;
class PrintPrimes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		Prime a=new Prime();
		System.out.println("Primes between "+x+" & "+y+" : ");
		a.print(x,y);
		
	}
}

class Prime
{
	public void print(int x,int y)
	{
		for(int i=x;i<=y;i++)
		{
			if(checkPrime(i)==1)
			System.out.print(i+" ");
		}
	}
	public int checkPrime(int n)
	{
		int k=(int)Math.sqrt(n);
		for(int i=2;i<=k;i++)
		{
			if(n%i==0)
			{
				return 0;
			}	
		}
	return 1;
	}
}