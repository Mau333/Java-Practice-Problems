import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		ReverseNum a=new ReverseNum();
		a.rev(x);
		
	}
}

class ReverseNum
{
	public void rev(int n)
	{
		int t=0,r=0,q=0;
		System.out.print("Reverse of "+n);
		int a=count(n);
		//System.out.println(a);
		for(int i=a-1;i>=0;i--)
		{
			r=n%10;
			t+=power(10,i)*r;
			n=(int)(n/10);
		}
		System.out.print(" : "+t);
	}
	public int count(int m)
	{
		int t=0;
		while(m!=0)
		{
			m=(int)(m/10);
			t++;
		}
		return t;
	}
	public int power(int a,int b)
	{
		int k=a;
		if(b==0)
		return 1;
		else{
		for(int i=1;i<b;i++)
			k*=a;
		return k;
		}
	}
}