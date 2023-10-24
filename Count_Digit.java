import java.util.Scanner;
class Count_Digit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		CountDigit a=new CountDigit();
		System.out.println("No. of digits in "+x+" : "+a.count(x));
		
	}
}

class CountDigit
{
	
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
}