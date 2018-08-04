import java.util.Scanner;
class Multiplication
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		System.out.println("Enter the number whose table is to be generated ");
		int num=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			
		System.out.println(num+"*"+i+"="+(num*i));
		
		}

		
		
	}
}

class MultiplicationMain
{
	public static void main(String []args)
	{
		Multiplication ob=new Multiplication();
		ob.calc();
	}
}