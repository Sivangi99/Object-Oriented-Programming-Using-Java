import java.util.Scanner;
class Reverse
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number \n");
		int n=sc.nextInt();
		int rev=0,dig;
		while(n>0)
		{
			dig=n%10;
			rev=rev*10+dig;
			n/=10;
		}
		System.out.println("The reverse of number is "+rev);
		

		
		
	}
}

class ReverseMain
{
	public static void main(String []args)
	{
		Reverse ob=new Reverse();
		ob.calc();
	}
}