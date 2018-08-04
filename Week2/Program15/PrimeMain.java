import java.util.Scanner;
class Prime
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number \n");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=1;
		}
		if(flag==0)
		{
			System.out.println("The number is prime");
}
		else
			System.out.println("The number is not prime");
		

		
		
	}
}

class PrimeMain
{
	public static void main(String []args)
	{
		Prime ob=new Prime();
		ob.calc();
	}
}