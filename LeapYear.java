import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		A a=new A(x);
		a.checkLeapyear();
		
	}

}
class A
{
	int a;
	public A(int p)
	{
		a=p;
	}
	public void checkLeapyear()
	{
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
					System.out.println("Leapyear");
				else
					System.out.println("Not Leapyear");
			}
			else
			{
				System.out.println("Leapyear");
			}
		}
		else
		{
			System.out.println("Not Leapyear");
		}
	}
}