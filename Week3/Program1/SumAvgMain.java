import java.util.Scanner;
class SumAvg
{
	void calc()
	{
		int a[],size,sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/size;
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+avg);
	}
}
class SumAvgMain
{
	public static void main(String args[])
	{
		SumAvg ob=new SumAvg();
		ob.calc();
	}
}
