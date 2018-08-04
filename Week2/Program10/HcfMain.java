import java.util.Scanner;
class Hcf
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int min=n<n2?n:n2;	
		int hcf=0;
		for(int i=1;i<=min;i++)
		{
			
			if(n%i==0&&n2%i==0)
				hcf=i;
		
		}
		System.out.println("The HCF is "+hcf);
		
		
	}
}

class HcfMain
{
	public static void main(String []args)
	{
		Hcf ob=new Hcf();
		ob.calc();
	}
}