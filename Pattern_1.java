/*Q15) Write programs on java to print the following series:
1
1 2
1 2 3
1 2 3 4
A
B B
C C C
D D D D
1
2 3
4 5 6
7 8 9 10*/
import java.util.Scanner;
class Pattern_1
{
	public static void main(String args[])
	{
		System.out.println("Enter no. of rows : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);	
	}
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		char x='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				
			}
			x++;
			System.out.println();
		}
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;}
			System.out.println();
		}


	}
}