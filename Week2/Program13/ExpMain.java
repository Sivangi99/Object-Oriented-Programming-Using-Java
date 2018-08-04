import java.util.Scanner;
class Exp
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number and its exponent");
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int res=1;
		for(int i=1;i<=n2;i++)
		{
			
			res=res*n;
		
		}
		System.out.println("The Result is "+res);
		
		
	}
}

class ExpMain
{
	public static void main(String []args)
	{
		Exp ob=new Exp();
		ob.calc();
	}
}