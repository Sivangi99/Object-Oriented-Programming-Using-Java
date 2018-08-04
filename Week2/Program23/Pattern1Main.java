import java.util.*;
class Pattern1
{
		
	void print()
	{
		int k=1;
		for(int i=1;i<=5;i+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}
class Pattern1Main
{
	public static void main(String args[])
	{
		Pattern1 ob=new Pattern1();
		ob.print();
	}
}