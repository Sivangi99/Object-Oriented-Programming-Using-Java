import java.util.Scanner;
class Multi
{
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the value of m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		if(m%n==0)
		System.out.println(m+" is a multiple of  "+n);
		else
		System.out.println(m+" is not a multiple of  "+n);
	}

		
}
class MultiMain
{
	public static void main(String args[])
	{
		Multi ob=new Multi();
		ob.calc();
	}
}			