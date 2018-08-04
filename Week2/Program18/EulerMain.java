import java.util.Scanner;
class Euler
{
	int fact(int x)
	{
		int fact=1;
		for(int i=1;i<=x;i++)
			fact=fact*i;
		return fact;
	}
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		int n;
		double s=0.0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s+1.0/fact(i);
		}
		System.out.print("The value of Euler's number is ");
		System.out.println(s);
	}

		
}
class EulerMain
{
	public static void main(String args[])
	{
		Euler ob=new Euler();
		ob.calc();
	}
}			