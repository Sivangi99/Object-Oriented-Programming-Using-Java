import java.util.Scanner;
class Range
{
	void calc()
	{
		int a[],size,min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
			
		}
		min=a[0];max=a[0];
		for(int i=1;i<size;i++)
		{
			if(a[i]>max)
			max=a[i];
			if(a[i]<min)
			min=a[i];
		}
		System.out.println("The range of the array is "+min+","+max);
	}
}
class RangeMain
{
	public static void main(String args[])
	{
		Range ob=new Range();
		ob.calc();
	}
}