import java.util.Scanner;
class SumNat
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range \n");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("The sum of natural numbers upto given range is "+sum);
		

		
		
	}
}

class SumNatMain
{
	public static void main(String []args)
	{
		SumNat ob=new SumNat();
		ob.calc();
	}
}