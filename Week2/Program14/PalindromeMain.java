import java.util.Scanner;
class Palindrome
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number \n");
		int n=sc.nextInt();
		int rev=0,dig;
		int n2=n;
		while(n>0)
		{
			dig=n%10;
			rev=rev*10+dig;
			n/=10;
		}
		if(n2==rev)
			System.out.println("Palindrome");
		else
			System.out.println(" Not Palindrome");
		

		
	}
}

class PalindromeMain
{
	public static void main(String []args)
	{
		Palindrome ob=new Palindrome();
		ob.calc();
	}
}