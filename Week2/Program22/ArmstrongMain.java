import java.util.*;
class Armstrong
{
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int n1=n;
		int sum=0;
		while(n>0)
		{
			int dig=n%10;
			sum=sum+(int)Math.pow(dig,3);
			n/=10;
		}
		if(n1==sum)
			System.out.println(n1+" is an Armstrong Number");
		else
			System.out.println(n1+" is not an Armstrong Number");

	}
}
class ArmstrongMain
{
	public static void main(String args[])
	{
		Armstrong ob=new Armstrong();
		ob.check();
	}
}