import java.util.Scanner;
class Multiple
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower and upper limits\n");
		int l=sc.nextInt();
		int h=sc.nextInt();
		
		for(int i=l;i<=h;i++)
		{
			
		System.out.println("10*"+i+"="+(10*i));
		
		}

		
		
	}
}

class MultipleMain
{
	public static void main(String []args)
	{
		Multiple ob=new Multiple();
		ob.calc();
	}
}