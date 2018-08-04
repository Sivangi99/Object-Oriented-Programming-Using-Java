import java.util.Scanner;
class BaseConv
{
	
	void bintodec()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number in binary \n");
		int n=sc.nextInt();
		int i=0,s=0;
		while(n>0)
		{
			int d=n%10;
			s= s+d*((int)Math.pow(2,i));
			n/=10;
			i++;
		}
		System.out.println("The Decimal equivalent is "+s);
	}
	void dectobin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number in decimal \n");
		int n=sc.nextInt();String s="";
		while(n>0)
		{
			int d=n%2;
			s= s.valueOf(d)+s;
			n/=2;
		}
		System.out.println("The Binary equivalent is "+s);

	}
}

class BaseConvMain
{
	public static void main(String []args)
	{
		BaseConv ob=new BaseConv();
		ob.bintodec();
		ob.dectobin();
	}
}