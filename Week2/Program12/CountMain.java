import java.util.Scanner;
class Count
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.println("The number of digits are "+c);
		
	}
}

class CountMain
{
	public static void main(String []args)
	{
		Count ob=new Count();
		ob.calc();
	}
}