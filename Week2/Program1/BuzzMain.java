/*
** This is a program which checks whether a number is Buzz number or not.A Buzz number is a number which ends with 7 or is divisible by 7.
*/
import java.util.Scanner;
class Buzz
{
	
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number \n");
		int n=sc.nextInt();
		if(n%7==0||n%10==7)
			System.out.println("BUZZ NUMBER");
		else
			System.out.println("Not Buzz Number");
	}//End of method check
}//End of class Buzz

class BuzzMain
{
	public static void main(String []args)
	{
		Buzz ob=new Buzz();
		ob.check();
	}//End of method main
}//End of class BuzzMain