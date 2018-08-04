import java.util.Scanner;
class Factorial
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial \n");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		fact=fact*i;
		System.out.println("The factorial is "+fact);
		
		
	}
}

class FactorialMain
{
	public static void main(String []args)
	{
		Factorial ob=new Factorial();
		ob.calc();
	}
}