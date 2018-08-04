import java.util.Scanner;
class Lcm
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
		int lcm=n*n2/hcf;
		System.out.println("The LCM is "+lcm);
		
		
	}
}

class LcmMain
{
	public static void main(String []args)
	{
		Lcm ob=new Lcm();
		ob.calc();
	}
}