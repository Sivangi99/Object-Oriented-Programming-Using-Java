import java.util.Scanner;
class SumEven
{
	void calc()
	{
		int a[],size,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			sum=sum+a[i];
		}
		System.out.println("The sum is "+sum);
		
	}
}
class SumEvenMain
{
	public static void main(String args[])
	{
		SumEven ob=new SumEven();
		ob.calc();
	}
}
