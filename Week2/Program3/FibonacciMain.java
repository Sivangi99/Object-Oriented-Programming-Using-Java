import java.util.Scanner;
class Fibonacci
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms for fibonacci series \n");
		int n=sc.nextInt();
		int a=1,b=0,c=0;
		for(int i=1;i<=n;i++)
		{
			
		System.out.print(c+" ,");
		c=a+b;
		a=b;
		b=c;
		}

		
		
	}
}

class FibonacciMain
{
	public static void main(String []args)
	{
		Fibonacci ob=new Fibonacci();
		ob.calc();
	}
}