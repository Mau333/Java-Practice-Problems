/*Q16) Write a program in Java to generate all number combination of 1, 2, or 3 using loop*/
class Combination{
	public static void main(String args[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				for(int k=1;k<=3;k++)
				{
					if((i!=j)&&(j!=k)&&(i!=k))
						System.out.print("("+i+","+j+","+k+")"+"\t");
				}
			}
		}
	}

}