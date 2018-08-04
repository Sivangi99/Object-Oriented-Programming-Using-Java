import java.util.*;
class PrimeRange
{
	boolean isprime(int x)
	{
		int flag=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		return true;
		else
		return false;
	}
		
	void print()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower and upper limits ");
		int l=sc.nextInt();
		int h=sc.nextInt();
		for(int i=l;i<=h;i++)
		{
			if(isprime(i))
			System.out.print(i+",");
		}
	}
}
class PrimeRangeMain
{
	public static void main(String args[])
	{
		PrimeRange ob=new PrimeRange();
		ob.print();
	}
}